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
public class PingPongClient {
    public static void main(String[] args){
        try{
            //1.membuat client socket sekaligus menghubungi server
            Socket client = new Socket("localhost", 4444);
            
            //2.membuat reader dan writer untuk membaca dan menulis data ke server
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            do{
                //3.dalam sebuah loop, kirim data ke server
                out.write("PING\n");
                System.out.println("Sending PING to server");
                out.flush();
                
                //4.dalam loop yang sama terima data dari server
                String inputLine = in.readLine();
                System.out.println("Received: " + inputLine + " from server");
                
                //5.dalam loop tersebut lakukan 1 detik pause agar loop bisa bagus
                Thread.sleep(10);
            }while(true);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }catch(IOException e){
            
        }catch(InterruptedException e){
            
        }
    }
}
