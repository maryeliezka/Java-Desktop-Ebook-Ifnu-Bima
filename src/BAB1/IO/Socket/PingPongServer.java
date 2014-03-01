/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BAB1.IO.Socket;


import java.io.*;
import java.net.*;
/**
 *
 * @author raditya
 */
public class PingPongServer {
    public static void main(String[] args){
        try{
            //1.membuka server socket
            ServerSocket server = new ServerSocket(4444);
            System.out.println("Server ready. Listening in port 4444.");
            
            //2.berusaha menerima client
            Socket client = server.accept();
            System.out.println("Connection from client is excepted.");
            
            //3.membuat reader dan writer untuk mengirim data ke client
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String input = null;
            
            //4.dalam sebuah loop akan membaca data yang dikirim client
            while((input = in.readLine()) != null){
                System.out.println("Received:" + input + " from client.");
                
                //5.kalau ada data yang dikirim client maka akan segera membalas dengan mengirim PONG ke client.
                out.write("PONG");
                System.out.println("Send PONG to client.");
                out.flush();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

