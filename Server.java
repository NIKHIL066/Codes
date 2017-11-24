package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server 
{
    public static void main(String[] args) 
    {
        String serverName;
        int port1;
        Scanner sc;
        int port2;
        ServerSocket servSock;
        Socket sock = null;
        BufferedReader br;
        String msg;
    
        sc=new Scanner(System.in);
        port1=6000;
        
        serverName="localhost";
      
        try
        {
            servSock=new ServerSocket(port1);
            sock = servSock.accept();
        }
        catch(Exception e) {System.err.println("Exception: "+e.getMessage());}
        while(true){
         try
                    {
                        br=new BufferedReader(new InputStreamReader( sock.getInputStream()));
                        msg=br.readLine();
                        System.out.println("--------------------------------------------\nClient:"+msg);
                        
                    }
                    catch(Exception IOE)
                    {
                        System.err.println(IOE.getMessage());
                        return;
                    }
        try
                {
                    System.out.println("\nEnter the message : ");
                    msg=sc.nextLine();
                    msg=msg+"\n";
                    sock.getOutputStream().write(msg.getBytes());
                }
                catch(Exception IOE)
                {
                        System.err.println(IOE.getMessage());
                        return;
                }       
       }
    }
     
}
