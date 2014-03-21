
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import javax.swing.ImageIcon;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * scrapbook.java
 *
 * Created on Mar 23, 2012, 11:48:40 PM
 */
/**
 *
 * @author DIVYAM
 */
public class scrapbook extends javax.swing.JFrame {
static  public scrapbook aa[];
   static public int number;
     static public int maxscrap;
    static public int max;//max frames
     static String name;
  static  String s1="";
        static String s2="";
          static String s3="";

    public scrapbook(String str11,String str22,String str33,scrapbook a[],int num,int maxx,String name1) 
 	{ 
 		
 		super();
                s1=str11;
                s2=str22;
                s3=str33;
                
 		aa=a;
 		number=num;
 		maxscrap=maxx;
 		
 		if (maxx==0)
 		    max=1;
 		
 		else if(maxx%3==0)
 		      max=maxx/3;
 		else
 		max=maxx/3+1;
 		
 		name=name1;
                 this.setTitle( "Welcome to "+name+"'s  Scrapbook" ); 
        initComponents();
      initializeComponent(str11,str22,str33); 
  if(num==0)
        this.setVisible(true); 
        else
        this.setVisible(false);
 	} 
    private void initializeComponent(String str1,String str2,String str3) 
 
 	{
    String sender1="";
        String sender2="";
         String sender3="";
 		if(!str1.equals(""))
 		{
 		
 		sender1=getsender(str1);
            client client = new client("photo"+sender1);
 		jLabel2.setIcon(new ImageIcon("c:/socialnet_java/photos/"+sender1+".jpg")); 
 		
 		}	if(!str2.equals(""))
 			{
 			
 		sender2=getsender(str2);
            client client = new client("photo"+sender2);
 		jLabel4.setIcon(new ImageIcon("c:/socialnet_java/photos/"+sender2+".jpg")); 
 		
 		}
 			if(!str3.equals(""))
 		{
 		
 		sender3=getsender(str3);
            client client = new client("photo"+sender3);
 		jLabel5.setIcon(new ImageIcon("c:/socialnet_java/photos/"+sender3+".jpg")); 
 		
 		
 		} 
 		
 		
 		
 	
 		jLabel58.setIcon(new ImageIcon("c:/socialnet_java/photos/"+welcome.currentuser+".jpg")); 
 		
 		
 		
 		
 		jScrollPane2.setViewportView(jTextArea2); 
 	
 		jTextArea1.setText(str1);
 		jTextArea1.setEditable(false); 
 		 
 		jScrollPane1.setViewportView(jTextArea1); 
 		 
 		
 			jTextArea3.setText(str2);
 	
 		jTextArea3.setEditable(false); 
 		 
 		jScrollPane3.setViewportView(jTextArea3); 
 		
 			jTextArea4.setText(str3);
 	
 		jTextArea4.setEditable(false); 
 		
 		jScrollPane4.setViewportView(jTextArea4);  
               
                
                  if(str1.equals(""))
                 {    jPanel2.setVisible(false);}	 
 		 else
                 {   jPanel2.setVisible(true);
 		jButton15.setText(sender1); 
                 }
                if(str2.equals(""))
                   jPanel4.setVisible(false);	 
 		 else
                {jPanel4.setVisible(true);
                     jButton16.setText(sender2); 
                }
                if(str3.equals(""))
                     jPanel5.setVisible(false);	 
 		 else
                { jPanel5.setVisible(true);
 		jButton17.setText(sender3); 
                }
               
                
                if(str1.equals("") || ! (name.equals(welcome.currentuser) || sender1.equals(welcome.currentuser) )) 
                    jButton8.setVisible(false);	
 		else
                    jButton8.setVisible(true);
                
                  if(str2.equals("") || ! (name.equals(welcome.currentuser) || sender2.equals(welcome.currentuser) )) 
                    jButton10.setVisible(false);	
 		else
                    jButton10.setVisible(true);
                  
                  if(str3.equals("") || ! (name.equals(welcome.currentuser) || sender3.equals(welcome.currentuser) )) 
                    jButton11.setVisible(false);	
 		else
                    jButton11.setVisible(true);
                
                
        }
    String getsender(String s)
 { 
   int i,l;
   String nm;
   
   
   l=s.length();
   
   
   for(i=l-2;s.charAt(i)!='\n' && i>=0;i--);
             
   nm = s.substring(i+1,l);
   nm=nm.trim();
    
   return nm;
 }
 
 void refresh() throws Exception
  { 
       client client = new client("scrap"+name);
              
              
          
 		
 		FileReader fr = new FileReader("c:/socialnet_java/temp.txt");
        BufferedReader br = new BufferedReader(fr);
        int c=Integer.parseInt(br.readLine());
         
        int j;
        
        int maxfrm;
       if(c==0) maxfrm=1;
       else if((c%3)==0) 
        maxfrm=c/3;
       else  maxfrm=(c/3)+1;
      
        scrapbook array[] =new scrapbook [maxfrm];
     
        String temp;
        String src[]=new String[3];
        for(int i=0;i<maxfrm;i++)
           { 
             src[0]=src[1]=src[2]="";
             for(j=0;j<3;j++)
             { 
              
             if(br.read()==-1)
           	 break;  
             temp=br.readLine();             
                        
           	 while( !(temp.equals("~!@#$%")))
           	 {
           	 	src[j]+=temp+"\n";
           	 	temp=br.readLine();
           	 }     
                       	    	 
             }
             	 if( c%3==1 && i==maxfrm-1) src[2]="";
             	
               array[i]=new scrapbook(src[0],src[1],src[2],array,i,c,name); 
           }
          
             br.close();
             fr.close();
           
           
           
  }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 213, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1034, 900));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Friendshub.jpg"))); // NOI18N

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Scrapbook");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Friend List");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Edit profile");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("home");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton3.setText("Post");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 246, 235));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton8)))
                .addContainerGap())
        );

        jButton12.setText("Next");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextArea3.setBackground(new java.awt.Color(255, 246, 235));
        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton10)))
                .addContainerGap())
        );

        jTextArea4.setBackground(new java.awt.Color(255, 246, 235));
        jTextArea4.setColumns(20);
        jTextArea4.setEditable(false);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton11.setText("Delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton11)))
                .addContainerGap())
        );

        jButton9.setText("Info");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton7)
                        .addGap(51, 51, 51)
                        .addComponent(jButton4)
                        .addGap(59, 59, 59)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 534, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(92, 92, 92))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13)
                                .addGap(32, 32, 32)
                                .addComponent(jButton12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton9)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jButton13)
                                    .addComponent(jButton12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
searchres sres=new searchres();
sres.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
welcome wl=new welcome();
wl.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try{
            
           refresh();
           this.setVisible(false);
           }
           catch(Exception ex) 
                             {  
                            }

    // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
client c=new client("frien"+welcome.currentuser);
 		
 		             int start=0;
                     int friends=0;
                     int temp1;
                     if(c.strrecv!=null)
                     {int last=c.strrecv.length();
                     int max1;
                     String arr[]=new String[6];
                     
                     
                     while(start<last)
                        { if((temp1=c.strrecv.indexOf("$",start))!=-1)
                          {
                          	friends++;
                          	start=temp1+1;
                          }
                          start++;
                          
                        }
                     
                    
                 if(friends==0)
                     max1=0;
                     else 
                     if(friends%6==0)
                     max1=friends/6;
                     else
                     max1= friends/6+1;
                                        
                     friendlist[] fri =new friendlist[max1];
                     
                        int frameno=0;
                        int count=0;
                        int cc;
                        int c1;
                        int photo=1;
                        start=0;
                        String temp=null;
                        while(start<last)
                             {  
                                if(count==6)
                                  {for(int i=0;i<6;i++) 
                                   if(arr[i]!=null)
                                   {
                        
                        client client = new client("photo"+arr[i]);
                                   	photo++;
                                   }
                                   
                                   fri[frameno]=new friendlist(arr,welcome.currentuser,fri,max1-1,frameno++);
                                  	for(int i=0;i<6;i++)
                                      arr[i]=null; 
                                     count =0; 
                                  }
                                
                             	if((cc=c.strrecv.indexOf("$",start))!=-1)
                             	   { temp=c.strrecv.substring(start,cc);
                             	     start=cc+1;
                             	     
                             	     if((c1=temp.lastIndexOf("#"))!=-1)
                             	     temp=temp.substring(c1+1,temp.length());
                             	     if((c1=temp.lastIndexOf("*"))!=-1)
                             	     temp=temp.substring(c1+1,temp.length());
                             	      arr[count++]  =temp;
                             	      
                             	   }
                             	   else start++;
                             	   
                             	
                             	
                             	
                             }
                             
                             if(frameno==max1-1) 
                               {   
                                   for(int i=0;i<count;i++) 
                                   if(arr[i]!=null)
                                   { 
                    client client = new client("photo"+arr[i]);
                                   	
                                   	photo++;
                                   	}
                                 
                                   fri[frameno]=new friendlist(arr,welcome.currentuser,fri ,max1-1,frameno++);
                                 
                                }             
                           }       
 		  	this.setVisible(false);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.setVisible(false);
editprof wl1=new editprof(welcome.currentuser);
wl1.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
this.setVisible(false);
profile p=new profile(welcome.currentuser);
p.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try
 	{
 	
 		String str=jTextArea2.getText();
 	      FileReader fr = new FileReader("c:/socialnet_java/temp.txt");
        BufferedReader br = new BufferedReader(fr);
        int maxscrp =Integer.parseInt(br.readLine());
        maxscrp++;
        Date date=new Date();
     	    
 	    String s="filin"+name+'*'+maxscrp+"\n"+" "+str+"\n\n\n"+date+"\n"+welcome.currentuser+"\n~!@#$%\n";
         
            client client = new client(s);
        fr.close(); 
        br.close(); 
        
        
         refresh();
         this.setVisible(false);
    	jTextArea2.setText("");     
 	} catch(Exception ex) 
 	    {   
            }    
 	
 		
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
// TODO: Add a// TODO: Add any handling code here 
 		if((max-1)!=number)
 		   {    aa[number].setVisible(false);
            	aa[number+1].setVisible(true);
            }
 		
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
	// TODO: Add any handling code here 
          if(number!=0)
            {    aa[number].setVisible(false);
            	 aa[number-1].setVisible(true);
             
            } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
 if(!(jButton15.getText()).equals(welcome.currentuser))
 {	frndprofile f=       new frndprofile(jButton15.getText());
 f.setVisible(true);
 }	       else
 {
     profile p=new profile(jButton15.getText());
      p.setVisible(true);
 }
 	       this.setVisible(false);
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     int scrapno=3*number+1;
 	       client cl= new client("delet"+name+"*"+scrapno);
 	        try{
 	         refresh();
 	         this.setVisible(false);
 	         }
 	         catch(Exception exs) 
 	         { 
 	       
 	         }  
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
  
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
        int scrapno=3*number+2;
        client client = new client("delet"+name+"*"+scrapno);
 	        try{
 	         
 	        
 	         refresh();
 	          this.setVisible(false);
 	         }
 	         catch(Exception exs) 
 	         { 
 	         }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 int scrapno=3*number+3;
        client client = new client("delet"+name+"*"+scrapno);
 		 try{
 	         
 	       
 	         refresh();
 	           this.setVisible(false);
 	         }catch(Exception exs) 
 	         {  
 	      
 	         }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
if(!(jButton16.getText()).equals(welcome.currentuser))
{
    frndprofile f=new frndprofile(jButton16.getText());
    f.setVisible(true);
}
 	       else
{
   profile p= new profile(jButton16.getText());
   p.setVisible(true);
}
 	       this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
if(!(jButton17.getText()).equals(welcome.currentuser))
{
  frndprofile f=  new frndprofile(jButton17.getText());
     f.setVisible(true);
}
 	       else
{
    profile p=new profile(jButton17.getText());
     p.setVisible(true);
}
 	       this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
info  i=new info(welcome.currentuser);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(scrapbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scrapbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scrapbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scrapbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new scrapbook(s1,s2,s3,aa,number,maxscrap,name).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
