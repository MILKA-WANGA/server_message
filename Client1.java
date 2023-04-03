// a program to create a client which accepts all the strings sent by the server
a client that accepts data from
server
import java.io.*;
import java.util.*;
import java.net.*;
public class client1
{
    public static void main(String[]args) throws IOException
    {
    //Create client socket
    Socket s=new Socket("localhost",777);
    //Attach imputstream to the socket
    InputStream nt=s.getInputStream();
    // receive data from the socket
    BufferedReader br=new BufferedReader(new InputStreamReader(obj));
    //Read data coming from the server
    String str;
    while(br.readLine!=null)
    {
        System.out.println(str);
        s.close();
        br.close();
       
    }
    }
}