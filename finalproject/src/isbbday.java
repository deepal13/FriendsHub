
import java.util.Calendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIVYAM
 */
public class isbbday {
    public isbbday()
            {
                
            }
     public  boolean calc(String dob) {

 String months[] = {
"Jan", "Feb", "Mar", "Apr",
"May", "Jun", "Jul", "Aug",
"Sep", "Oct", "Nov", "Dec"};
String s=dob;
 
 int age;
 String m=s.substring(0,3);
 
 String d="";
          char cha;
         int k;
         for( k=4;(cha=s.charAt(k))!='/';k++)
           d=d + cha ;
         int dat=Integer.parseInt(d);

         Calendar calendar = Calendar.getInstance();
         
int i;
for ( i=0;i<12;i++)
if(m.equals(months[i])) break;

int month=i+1;
int cmonth=calendar.get(Calendar.MONTH)+1;
int cdat=calendar.get(Calendar.DATE);
  
        boolean isb;
 if(month==cmonth  && dat==cdat)
    isb=true;
    
   else isb=false;
     
     return isb;
}
}
