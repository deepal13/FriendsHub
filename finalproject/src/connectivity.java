import java.io.*;
import java.net.*;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIVYAM
 */
public class connectivity extends Thread {
  
    public Socket client;
    public int ID;
    public connectivity(Socket stemp,int id)
	{
		try
		{
			client=stemp;
			ID=id;
		}
		catch(Exception e)
		{
			
		}
		this.start();

	}
    @Override
    public void run()
	{
		processing();

	}
public void processing()
{
        try {
             String strquerytext="";
			String strresult="";
			String str="";
            BufferedReader br;
            BufferedWriter bw;
            br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            int charsread = Integer.parseInt(br.readLine());
            char [] chars=new char [charsread];
            br.read(chars);
            strquerytext= String.valueOf(chars);
            strquerytext=strquerytext.trim();
            String strres=strquerytext.substring(0,5);
            int length=strquerytext.length();
            String usname=new String();
            String scrap = new String();
            if(strres.equals("filin")||strres.equals("delet")||strres.equals("phtin")||strres.equals("phoin"))	
            {
                int i=5;
                char c;
                while((i<length) && (c=strquerytext.charAt(i))!='*') 
                { 
                    usname=usname+c;
                    i++;
                }
                scrap =strquerytext.substring(i+1,length);
            }
            else
            
              usname=strquerytext.substring(5,length);
              usname=usname.trim();
              if(strres.equals("frien")||strres.equals("seefr")||strres.equals("addas")||strres.equals("chkfr"))
              {
                  try{
                      String str1=new String();
                      FileReader fis=new FileReader("c:/socialnet_java/friends/"+usname+".txt"); 
                      char[] buffer = new char[100]; 
                      while ( fis.read(buffer) > 0)
                      { 
                          str1=str1+String.valueOf(buffer);
                      }
                      str1=str1.trim();
                      bw.write(str1);
                      bw.flush();
                       
                   }
                  catch(Exception e) 
                  {
                      
                  }
                
              }
              else if(strres.equals("noscr"))
              { 
                  FileReader fr1 = new FileReader("c:/socialnet_java/scrapbook/"+usname+".txt");
                  BufferedReader br1 = new BufferedReader(fr1);
                  bw.write(br1.readLine());
                  bw.flush();  
              }
               else if(strres.equals("#####"))
               {
                   int c=strquerytext.indexOf("*",5);
                   String cur=strquerytext.substring(5,c);
                   String view=strquerytext.substring(c+1,strquerytext.length());
                   FileWriter f=new FileWriter( "c:/socialnet_java/friends/"+cur+".txt",true);
                   f.write(view+"*");
                   f.close();
                   FileWriter f1=new FileWriter( "c:/socialnet_java/friends/"+view+".txt",true);
                   f1.write(cur+"#");
                   f1.close();
               }
               else if(strres.equals("addco"))
                   {  char flag='*';
                   int c=strquerytext.indexOf("*",5);
                   if(c==-1)
                   {
                       c=strquerytext.indexOf("@",5);
                       flag='@';
                   }
                   String cur=strquerytext.substring(5,c);
                   String view=strquerytext.substring(c+1,strquerytext.length());
                   String str1=new String();
                   String str2=new String();
                   FileReader f=new FileReader("c:/socialnet_java/friends/"+cur+".txt");
                   char[] buffer = new char[100];
                   while ( f.read(buffer) > 0)
                   { 
                       str1=str1+String.valueOf(buffer);
                   }
                   str1=str1.trim();
                   f.close();
                   FileReader f1=new FileReader("c:/socialnet_java/friends/"+view+".txt");
                   char[] buffer1 = new char[100];
                   while ( f1.read(buffer1) > 0)
                   { 
                       str2=str2+String.valueOf(buffer1);
                   }
                   str2=str2.trim();
                   f1.close();	
                   int index;
                   if(flag=='*')
                       {
                           str1=str1.replace(view+"#",view+"$");
                           FileWriter f11=new FileWriter( "c:/socialnet_java/friends/"+cur+".txt");
                           f11.write(str1);
                           f11.close();
                           str2= str2.replace(cur+"*",cur+"$");
                           FileWriter f111=new FileWriter( "c:/socialnet_java/friends/"+view+".txt");
                           f111.write(str2);
                           f111.close();
                       } 
                   else
                   {
                       str1=str1.replace(view+"#","");
                       FileWriter f2=new FileWriter( "c:/socialnet_java/friends/"+cur+".txt");
                       f2.write(str1);
                       f2.close();
                       str2=str2.replace(cur+"*","");
                       FileWriter f222=new FileWriter( "c:/socialnet_java/friends/"+view+".txt");
                       f222.write(str2);
                       f222.close();
                   } 
                   }                  
			    
               else if( strres.equals("photo")) 	
{  
    FileInputStream fis=new FileInputStream("c:/socialnet_java/dataphoto/"+usname+".jpg");
    OutputStream out = client.getOutputStream();
    byte[] buffer = new byte[8192];
    int bytesRead;
    while ((bytesRead = fis.read(buffer)) > 0)
    {
        out.write(buffer, 0, bytesRead);
    }
out.flush(); 
fis.close();
}		
else if(strres.equals("phtin"))
{ 

char c;
int len=scrap.length();
int  j=-1;
FileOutputStream  fout = new FileOutputStream("c:/socialnet_java/dataphoto/"+usname+".jpg");
while(j<len)
{  
j++;
String stri="";
for(;j<len && ((c=scrap.charAt(j))!='\n');j++)
{ stri=stri+c;
}
fout.write(Integer.parseInt(stri));
fout.flush();
}
fout.close();
}
else	if(strres.equals("scrap"))
{
FileInputStream fis=new FileInputStream("c:/socialnet_java/scrapbook/"+usname+".txt");
OutputStream out = client.getOutputStream();
byte[] buffer = new byte[8192];
int bytesRead;
while ((bytesRead = fis.read(buffer)) > 0) 
{
out.write(buffer, 0, bytesRead);
}
out.flush();
fis.close();
}
else if(strres.equals("newus"))
{ 
FileWriter f0=new FileWriter("c:/socialnet_java/scrapbook/"+usname+".txt");
f0.write(""+0);
f0.flush();
f0.close();
f0=new FileWriter("c:/socialnet_java/friends/"+usname+".txt");
f0.close();
f0=new FileWriter("c:/socialnet_java/dataphoto/"+usname+".jpg");
f0.close();
}
else if(strres.equals("phoin"))
{
FileOutputStream fos=new FileOutputStream("c:/socialnet_java/dataphoto/"+usname+".jpg");
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
else if(strres.equals("filin"))
{ 
FileReader fr1 = new FileReader ("c:/socialnet_java/scrapbook/"+usname+".txt");
BufferedReader br1= new BufferedReader(fr1);
String scr=br1.readLine();
byte [] buf1 = scr.getBytes();
br1.close();
FileInputStream  in = new FileInputStream ("c:/socialnet_java/scrapbook/"+usname+".txt");
in.read(buf1);
int n=in.available();
byte[] buffer = new byte[n];
in.read(buffer);
in.close();
FileOutputStream fos=new FileOutputStream("c:/socialnet_java/scrapbook/"+usname+".txt");
byte buf[]= scrap.getBytes();
fos.write(buf);
fos.close();
fos=new FileOutputStream("c:/socialnet_java/scrapbook/"+usname+".txt",true);
fos.write(buffer);
fos.flush();
fos.close();
}
else if(strres.equals("profi")) {} 
else if(strres.equals("delet"))
             {
int scrno=Integer.parseInt(scrap);
FileReader fr1=new FileReader("c:/socialnet_java/scrapbook/"+usname+".txt");
BufferedReader br1 = new BufferedReader(fr1);
FileWriter fw1=new FileWriter("c:/socialnet_java/scrapbook/"+usname+"temp.txt",true);
String tmp;
int scrpsno=Integer.parseInt(br1.readLine());     
scrpsno--;
if(scrpsno==0) { 
fr1.close();
br1.close();
fw1.flush();
fw1.close();
fw1=new FileWriter("c:/socialnet_java/scrapbook/"+usname+".txt");
fw1.write(""+0);
fw1.close();
} 
else{
for(int i=0;i<scrno-1;)
{   tmp=br1.readLine();
fw1.write(tmp+"\n");
if(tmp.equals("~!@#$%"))
i++;
}
do
{ 
tmp=br1.readLine();
}
while(tmp!=null && !tmp.equals("~!@#$%"));
while((tmp=br1.readLine())!=null)
{ 
fw1.write(tmp+"\n");
}

fr1.close();
br1.close();
fw1.flush();
fw1.close();
fr1=new FileReader("c:/socialnet_java/scrapbook/"+usname+"temp.txt");
fw1=new FileWriter("c:/socialnet_java/scrapbook/"+usname+".txt");
br1 = new BufferedReader(fr1);
fw1.write(scrpsno+"\n") ;
fw1.flush();
fw1.close();
fw1=new FileWriter("c:/socialnet_java/scrapbook/"+usname+".txt",true);   
while((tmp=br1.readLine())!=null)
{ 
fw1.write(tmp+"\n");
}
            
fr1.close();
br1.close();
fw1.flush();
fw1.close();
File f= new File("c:/socialnet_java/scrapbook/"+usname+"temp.txt");
f.delete();
}
}  
else
{ 
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           String filename = "G:/updated project/mydb.mdb";
           String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
           database+= filename.trim() + ";DriverID=22;READONLY=true}";
           Connection con = DriverManager.getConnection( database); 
        
                    java.sql.Statement s =con.createStatement();
s.execute(strquerytext);
ResultSet rs = s.getResultSet();
				if(rs==null){
                              bw.write(null+"\n");
					          bw.flush();
					          
                            }
                              else
                                  {			
				ResultSetMetaData metadata=rs.getMetaData();
				int itotalcolumns=metadata.getColumnCount();
                                strresult=""; 
                                while(rs.next())
				  {     
					for( int i=1;i<=itotalcolumns;i++)
					{
						strresult+=rs.getString(i)+"   ";
                        
					}
					 bw.write(strresult.length()+"\n");
				            	 bw.flush();
				            	
				            	bw.write(strresult+"\n");
					            bw.flush();
		       			              strresult="";

				   
                                       }
				

			       }       
                        
                s.close();
                con.close();        
                }        
			
            br.close();
			bw.close();
                        client.close();
           } catch (Exception ex) {
        }
} 
}
