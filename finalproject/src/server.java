
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIVYAM
 */
public class server {
   private ServerSocket	Server;
 	private Socket			Client;
 	private int ConnectionCounter;
        	private int Port;
    public server()
    {
       
		ConnectionCounter=0;
		Port=5000;
        

		Init();
    }
    public final void Init()
    {
        try {
           Server=new ServerSocket(4444);
			System.out.println("Waiting For Connection "+Server.getInetAddress().getHostName());
	        System.out.println("Listening on port: "+Server.getLocalPort());

			while(true)
			{


				WaitingForConnection();
				CreateThread();

			}


		}
		catch(Exception e)
		{
			
		}
	}

	public void CreateThread()
	{
		try
		{
			System.out.println("Total Active Users:\t"+ConnectionCounter);
			ConnectionCounter++;
            connectivity connecti = new connectivity(Client,ConnectionCounter);
		}
		catch(Exception e)
		{
		
		}
			return;

	}

	public void WaitingForConnection()
	{
		

		try
		{
			do
			{
				Client=Server.accept();

			}
			while(Client==null);
			
		}
		catch(Exception e)
		{
			
		}
	}
 
      public static void main(String a[]) {
       
        server multiServer = new server();
      
        // TODO code application logic here
    }
}
