package clientsocket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket1 
{

    public static void main(String[] args) 
    {
        String serverName;
        int port;
        Socket client = null;
        String msg;
        BufferedReader br;
        Scanner sc=new Scanner(System.in);
        
        serverName="localhost";
        port=6000;
        
        try{ client=new Socket(serverName,port); }
        
        catch(Exception e){ System.err.println("Exception: "+e.getMessage());}
        
       while(true)
       {
        System.out.println("\nEnter the message -> ");
        msg=sc.nextLine(); 
        msg=msg+"\n";

        try{ client.getOutputStream().write(msg.getBytes()); }
        
        catch(IOException e){System.out.println(e.getMessage());}
        try
        {
            br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            String rmsg=br.readLine();
            System.out.println("Server:"+rmsg+"\n------------------------------");
        }
        catch(Exception e){System.out.println("Exception:"+e.getMessage());}
        
       } 
        
    }
}
