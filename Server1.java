//a program to create a server for sending some strings to the client
import java.io.*;
import java.net.*;
public class Server1
{
    public static void main(String[]args) throws IOException
    {
        
    //Create the server socket
    ServerSocket ss=new ServerSocket(777);
    // make the socket accept client connection
    Socket s=ss.accept();
    System.out.println("Connection established successfully");
    //Attach outputstream to the socket
    OutputStream tm =s.getOutputStream();
    //Send data to the socket
    PrintStream ps =new PrintStream(tm);
    String str="Hello client";
    ps.println(str);
    ps.println("Bye");
    //close the client socket
    s.close();
    //closethe server socket
    ss.close();
    //stop sending data
    ps.close();
    }

}