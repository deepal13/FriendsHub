
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * profile.java
 *
 * Created on Mar 24, 2012, 11:46:44 PM
 */
/**
 *
 * @author DIVYAM
 */
public class profile extends javax.swing.JFrame {
static String userdata,temp;
    private JPanel contentPane;
    /** Creates new form profile */
    public profile(String s) {
        super(); 
        userdata=s;
       this.setTitle(welcome.currentuser+"'s PROFILE"); 
        initComponents();
        initComponents1();
       this.setVisible(true); 
    }
private void initComponents1()
{
    
  client pic = new client("photo"+userdata);

  client c=new client();

 jButton4.setVisible(false);
  int abc=countfr(userdata);
jButton4=new JButton("View Friends("+abc+")");
jButton4.setVisible(true);
if(abc==0)
{jPanel8.setVisible(false);
jButton4.setVisible(false);
jLabel2.setText("Friends (0)");
jLabel2.setVisible(true);
}
 client c1=new client("seefr"+userdata);
 		 String arr[]=new String[6];
 		 int cc1;
 		 int x;
 		 int y;
 		 int count=0;
 		 int start=0;
 		 if(c1.strrecv!=null)
 		 {int last=c1.strrecv.length();
 		 temp=null;
 		  while(start<last)
                             {  
                               
                                
                             	if((x=c1.strrecv.indexOf("$",start))!=-1)
                             	   { temp=c1.strrecv.substring(start,x);
                             	     start=x+1;
                             	     
                             	     if((y=temp.lastIndexOf("#"))!=-1)
                             	     temp=temp.substring(y+1,temp.length());
                             	     if((y=temp.lastIndexOf("*"))!=-1)
                             	     temp=temp.substring(y+1,temp.length());
                             	     if(count<6)  
                             	    arr[count++]  =temp;
                             	     
                             	   }
                                else start++;
                             	 
                             	 
                             	
                               }
                             
                             
                             if(count!=6)
                             for(int i=count;i<6;i++)
                             arr[i]=null; 	
                             
                             	 
 		 for(int i=0;i<6;i++)
 		 {  
 		    if(arr[i]!=null)
 		 	new client("photo"+arr[i]);
 		 	
 		 }
 		 
 		 }
 		 
 		 String arr12[]=new String[abc];
 		 
 		  count=0;
 		  start=0;
 		 if(c1.strrecv!=null)
 		 {int last=c1.strrecv.length();
 		 temp=null;
 		  while(start<last)
                             {  
                               
                                
                             	if((x=c1.strrecv.indexOf("$",start))!=-1)
                             	   { temp=c1.strrecv.substring(start,x);
                             	     start=x+1;
                             	     
                             	     if((y=temp.lastIndexOf("#"))!=-1)
                             	     temp=temp.substring(y+1,temp.length());
                             	     if((y=temp.lastIndexOf("*"))!=-1)
                             	     temp=temp.substring(y+1,temp.length());
                             	     
                             	    arr12[count++]  =temp;
                             	    
                             	 
                             	      
                             	   }
                                else start++;
                             	 
                             	 
                             	
                               }
          }                   
                 client c66=new client();
 	    int ctr=0; 
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            
 		for(int i=0;i<abc;i++)
 		    { isbbday ibd=new isbbday();
 		        String dbd="";
 		        dbd=c66.client("select bday from logins where username='"+arr12[i]+"';",0);
 		        
 		        
 		        if(ibd.calc(dbd)&&ctr<3)
 		          {
 		          	jLabel29.setText("B'day Reminder");
 		          	switch(ctr)
 		                  {
 		                  	case 0:jLabel30.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr12[i]+".jpg"));
 		                  	       jButton7.setText(arr12[i]);
                                           jPanel3.setVisible(true);
 		                  	     
 		                  	        break;
 		                  	case 1:jLabel31.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr12[i]+".jpg"));
 		                  	       jButton13.setText(arr12[i]);
 		                  	       jPanel4.setVisible(true);
 		                  	          break;
 		                  	case 2:jLabel32.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr12[i]+".jpg"));
 		                  	       jButton15.setText(arr12[i]);
                                                jPanel5.setVisible(true);
 		                  	         break;
 		                  	
 		                  }  
 		                  ctr++; 
 		          }
//                        else
//                        {
//                            jLabel29.setText("No b'day reminder");
//                        }
 		          
 		    }    
               
                jPanel9.setVisible(false);
                jPanel12.setVisible(false);
                jPanel13.setVisible(false);
                jPanel14.setVisible(false);
                jPanel15.setVisible(false);
                jPanel16.setVisible(false);
 	if(arr[0]!=null)
 		{
 		 jLabel88.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr[0]+".jpg"));
 		 jButton16.setText(arr[0]+"("+countfr(arr[0])+")");
                 jPanel9.setVisible(true);
 		}
 		else
 		jPanel9.setVisible(false);
 		
 		
 		if(arr[1]!=null)
 		{jLabel91.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr[1]+".jpg"));
 		 jButton19.setText(arr[1]+"("+countfr(arr[1])+")");
                  jPanel12.setVisible(true);
 		}
 		else
 		jPanel12.setVisible(false);
 		
 	
 	
 		if(arr[2]!=null)
 		{jLabel92.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr[2]+".jpg"));
 		 jButton20.setText(arr[2]+"("+countfr(arr[2])+")");
                  jPanel13.setVisible(true);
 		}
 		else
 		jPanel13.setVisible(false);
 		
 		if(arr[3]!=null)
 		{jLabel93.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr[3]+".jpg"));
 		 jButton21.setText(arr[3]+"("+countfr(arr[3])+")");
                  jPanel14.setVisible(true);
 		}
 		else
 		jPanel14.setVisible(false);   	
 		   
               if(arr[4]!=null)
 		{jLabel95.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr[4]+".jpg"));
 		 jButton23.setText(arr[4]+"("+countfr(arr[4])+")");
                  jPanel16.setVisible(true);
 		}
 		else
 		jPanel16.setVisible(false);   	
 		
 		
 	
 	
 		if(arr[5]!=null)
 	{jLabel94.setIcon(new ImageIcon("c:/socialnet_java/photos/"+arr[5]+".jpg"));
 		 jButton22.setText(arr[5]+"("+countfr(arr[5])+")");
                  jPanel15.setVisible(true);
 		}
 		else
 		jPanel15.setVisible(false);   	
 		
 	
 	
 	 c=new client("noscr"+userdata);
 		jButton14.setText("Scrapbook");
 		jLabel58.setIcon(new ImageIcon("c:/socialnet_java/photos/"+welcome.currentuser+".jpg"));
                
               client c2=new client("chkfr"+userdata);
 		 start =0;
 		 int temp1;
 		 int friends=0;
 		 int last=0;
 		 if(c2.strrecv!=null)
 		 {last=c2.strrecv.length();
 		 int cc;
 		 while(start<last)
                        { if((temp1=c2.strrecv.indexOf("#",start))!=-1)
                          {
                          	friends++;
                          	start=temp1+1;
                          }
                          start++;
                          
                        }            
          String brr[]=new String[friends];  
          count=0;
          start=0;
           while(start<last)
          	{
          		if((cc=c2.strrecv.indexOf("#",start))!=-1)
                         	   { temp=c2.strrecv.substring(start,cc);
                                 start=cc+1;
                             	     
                                 if((x=temp.lastIndexOf("$"))!=-1)
                                 temp=temp.substring(x+1,temp.length());
                                 if((x=temp.lastIndexOf("*"))!=-1)
                             	 temp=temp.substring(x+1,temp.length());
                             	 brr[count++]  =temp; 
                              	     
                             	   }
                             else start++;	   
                                 
                            	 
              	 }
          for(int i=0;i<friends;i++)
          	 if(friends!=0)
 		 {addconf a[]=new addconf[friends];
 		  for( i=0;i<friends;i++)
 		  a[i]=new addconf(brr,a,friends-1,i);
 		  }
 		}
 		
 	} 	
 		
 		   

 		
                 int countfr(String user)
	       {
                   client d=new client("frien"+user);
 		   int start1=0;
 		   int	last1;
int friends1=0;
 		   if(d.strrecv!=null)
                   {
                       last1=d.strrecv.length();
                       int temp2;
                       while(start1<last1)
                        { 
                            if((temp2=d.strrecv.indexOf("$",start1))!=-1)
                            {
                                friends1++;
                          	start1=temp2+1;
                            }
                            start1++;
                        }
                   }
return friends1;
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
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 213, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1034, 900));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Friendshub.jpg"))); // NOI18N

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel29.setText("No b'day reminder");

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton8.setText("Post");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(236, 233, 216));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("My status");

        jButton12.setText("Logout");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton6.setText("Friend List");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("Edit profile");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton14.setText("Scrapbook");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton10.setText("home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton3.setText("Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton10)
                                .addGap(62, 62, 62)
                                .addComponent(jButton14)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8)
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton6)
                                        .addGap(71, 71, 71)
                                        .addComponent(jButton9)))
                                .addGap(19, 19, 19)
                                .addComponent(jButton3)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jButton11)))
                                .addGap(66, 66, 66)
                                .addComponent(jButton12)
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(573, 573, 573)
                                        .addComponent(jButton1))))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(67, 67, 67)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jButton8)
                                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(349, 349, 349))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9)
                                    .addComponent(jButton6)
                                    .addComponent(jButton14)
                                    .addComponent(jButton10)
                                    .addComponent(jButton12)
                                    .addComponent(jButton11)
                                    .addComponent(jButton3))
                                .addGap(72, 72, 72)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1118, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
searchres sres=new searchres();
sres.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
this.setVisible(false);
welcome wl=new welcome();
wl.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton12ActionPerformed

private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
this.setVisible(false);
searchres sres=new searchres();
sres.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton11ActionPerformed

private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

              client client = new client("scrap"+userdata);
              
              
           	try{
 		
 		FileReader fr = new FileReader("c:/socialnet_java/temp.txt");
        BufferedReader br = new BufferedReader(fr);
        
       
        String firstline=br.readLine();
        firstline=firstline.trim();
       
        
        int c=Integer.parseInt(firstline);
         
        int j;
        
        int maxfrm;
       if(c==0) maxfrm=1;
       else if((c%3)==0) 
            maxfrm=c/3;
       else  maxfrm=(c/3)+1;
      
        scrapbook array[] =new scrapbook [maxfrm];
     
        String temp;
        
        String src[]=new String [3];
        for(int i=0;i<maxfrm;i++)
           { 
               src[0]=src[1]=src[2]="";
             for(j=0;j<3;j++)
             { 
             
             if(br.read()==-1)
           	 break;  
             temp=br.readLine();             
             
           	      
           	 while(!(temp.equals("~!@#$%")))
           	 {
           	 	src[j]+=temp+"\n";
           	 	temp=br.readLine();
           	 }     
                       	    	 
             }
       
               if( c%3==1 && i==maxfrm-1) src[2]="";
               array[i]=new scrapbook(src[0],src[1],src[2],array,i,c,userdata); 
           }
          
             br.close();
             fr.close();
             this.setVisible(false);
                }
           catch(Exception e1) 
                { 
                }
    // TODO add your handling code here:
}//GEN-LAST:event_jButton14ActionPerformed

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
client c=new client("frien"+userdata);
 		
int start=0;
                     int friends=0;
                     int temp1;
                     if(c.strrecv!=null)
                     {int last=c.strrecv.length();
                     int max;
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
                     max=0;
                     else 
                     if(friends%6==0)
                     max=friends/6;
                     else
                     max= friends/6+1;
                     friendlist[] fri =new friendlist[max];
                        int frameno=0;
                        int count=0;
                        int cc;
                        int c1;
                        int photo1=1;
                        start=0;
                        String temp=null;
                        while(start<last)
                             {  
                                if(count==6)
                                  {for(int i=0;i<6;i++) 
                                   if(arr[i]!=null)
                                   {
                       client client = new client("photo"+arr[i]);
                                   	photo1++;
                                   }
                                 
                                   fri[frameno]=new friendlist(arr,welcome.currentuser,fri,max-1,frameno++);
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
                             
                             if(frameno==max-1) 
                               {
                                   for(int i=0;i<count;i++) 
                                   if(arr[i]!=null)
                                   { 
                    client client = new client("photo"+arr[i]);
                                   	
                                   	photo1++;
                                   	}
                                   
                                   fri[frameno]=new friendlist(arr,welcome.currentuser,fri ,max-1,frameno++);
                          
                                     
                                }             
                           }       
                     
                              
 			this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 frndprofile view_others = new frndprofile(jButton7.getText());
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
String temp=jButton16.getText();
 		int i=temp.indexOf("(");
 		temp=temp.substring(0,i);
        frndprofile view_others = new frndprofile(temp);
 	
 			this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
frndprofile view_others = new frndprofile(jButton13.getText());
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
frndprofile view_others = new frndprofile(jButton15.getText());
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
String temp=jButton19.getText();
 		int i=temp.indexOf("(");
 		temp=temp.substring(0,i);
        frndprofile view_others = new frndprofile(temp);
 	
 			this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed
    
    
private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
String temp=jButton20.getText();
 		int i=temp.indexOf("(");
 		temp=temp.substring(0,i);
        frndprofile view_others = new frndprofile(temp);
 	
 			this.setVisible(false);
}//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
String temp=jButton21.getText();
 		int i=temp.indexOf("(");
 		temp=temp.substring(0,i);
        frndprofile view_others = new frndprofile(temp);
 	
 			this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
info  i=new info(welcome.currentuser);

i.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
this.setVisible(false);
editprof wl1=new editprof(userdata);
wl1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 String stat=jTextField2.getText();
    jTextArea1.setText(stat);
jTextField2.setText("");
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
String temp=jButton22.getText();
 		int i=temp.indexOf("(");
 		temp=temp.substring(0,i);
        frndprofile view_others = new frndprofile(temp);
 	
 			this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
String temp=jButton23.getText();
 		int i=temp.indexOf("(");
 		temp=temp.substring(0,i);
        frndprofile view_others = new frndprofile(temp);
 	
 			this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new profile(userdata).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
