
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIVYAM
 */
public class client {
    String  strinput,strrecv;
     int max;
        profile p1;
    public client()
    {
        
    }
    public  client(String str)
    {
        processing(str);
    }
     public String client(String str,int c)
     { 
        processing(str);
         return strrecv; 
     }
       
    public final void processing(String str)
	{  strinput=str;
		try
		{
			Socket client=new Socket("localhost",4444);
			BufferedReader br;
			BufferedWriter bw;
		    String usname ="" , scrap="";
			br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				
	            
                bw.write(strinput.length()+"\n");
                
            	bw.flush();
                 
                  bw.write(strinput+"\n");
                             
			    	bw.flush();
			
			   	int length=strinput.length();
				String temp=strinput.substring(0,5);
                
               	if(temp.equals("filin")||temp.equals("delet")||temp.equals("phtin")||temp.equals("phoin"))	
			  { 
			    int i=5;
				char c;
			
				while((i<length) && (c=strinput.charAt(i))!='*') 
				   { 
				     usname=usname+c;
				   	  i++;
				   	}
			
               
                
                scrap =strinput.substring(i+1,length);
                
              
               
               }
              
               else  
              
              usname=strinput.substring(5,length);
               
               
              usname=usname.trim();
                 
               
               
               
         
               
                 
                 if(temp.equals("phtin"))
                {
                }
                
                else if(temp.equals("#####")||temp.equals("addco"))
                    { 
                    }
                
               else if(temp.equals("frien")||temp.equals("seefr")||temp.equals("chkfr")||temp.equals("addas"))//view friends
                  { 
                  
                  	strrecv=br.readLine();
                  	strrecv=strrecv.trim();
                  	                 	
                         
                  	       
                   
                  }
            
               
               else if(temp.equals("noscr"))
               {  
                  strrecv= br.readLine();
                  strrecv=strrecv.trim();
               }
                else if(temp.equals("scrap"))
                  { 
                     FileOutputStream fos=new FileOutputStream("c:/socialnet_java/temp.txt");
                    InputStream in = client.getInputStream();
                    byte[] buffer = new byte[8192];
                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) > 0) 
                   {
                    fos.write(buffer, 0, bytesRead);
                   }
                     fos.flush(); 
                     fos.close();
                   }



                 else if(temp.equals("phoin"))
                 { 
                 
                 
                  FileInputStream fis=new FileInputStream(scrap);
			      OutputStream out = client.getOutputStream();
                   byte[] buffer = new byte[8192];
                  int bytesRead;
                  while ((bytesRead = fis.read(buffer)) > 0) {
                   out.write(buffer, 0, bytesRead);
                     }
                     out.flush(); 
                     fis.close(); 
                 }
				
				
				
				
				else if(temp.equals("newus")) {}
                          
                          
                          else if(temp.equals("filin")) 
                          {  }
                          
                            else if(temp.equals("delet")) 
                          {  }
                           
                          
				      	             
                               
                           else if(temp.equals("photo")) 
                                {  
                                 
                    FileOutputStream fos=new FileOutputStream("c:/socialnet_java/photos/"+usname+".jpg");
                    InputStream in = client.getInputStream();
                    byte[] buffer = new byte[8192];
                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) > 0) 
                   {
                    fos.write(buffer, 0, bytesRead);
                   }
                     fos.flush(); 
                     fos.close(); 
                                }  
                           
                           else    {  
                           
                                          int charsread = Integer.parseInt(br.readLine());
		                                	
		   
		                              	char [] chars=new char [charsread];
			 
		                                	br.read(chars);
					
		                            	 strrecv= String.valueOf(chars);
                                       if(strrecv!=null) strrecv=strrecv.trim();
                                   
                                   
                                   }
				
				
			  	
			
			bw.close();
			br.close();
			client.close();
			

		}
		catch(Exception e)
		{
			
		}
	}
        public static void main(String a[]) {
client c=new client();
        // TODO code application logic here
    }

	
}
