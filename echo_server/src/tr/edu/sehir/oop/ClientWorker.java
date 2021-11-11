package tr.edu.sehir.oop;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


import java.net.Socket;

class ClientWorker implements Runnable {
    private Socket client;
    private int clientNo;

    //Constructor
    ClientWorker(Socket client,int clientno ) {
        this.client = client;
        this.clientNo=clientno;
        System.out.println("client worker "+clientNo+"  is ready now");

    }

    public void run(){
        String line;
        BufferedReader in = null;
        PrintWriter out = null;
        try{
            in = new BufferedReader(new
                    InputStreamReader(client.getInputStream()));
            out = new
                    PrintWriter(client.getOutputStream(), true);
        } catch (IOException e) {
            System.out.println("in or out failed");
            System.exit(-1);
        }

        while(true){
            try{
                line = in.readLine();
                long time = System.currentTimeMillis();
                System.out.println("line read from client: " + line);
                //Send data back to client
                out.println(line+time);
                Thread.sleep(1000);
                //Append data to text area
               // textArea.append(line);
            }catch (IOException | java.lang.InterruptedException e) {
                System.out.println("Read failed");
                System.exit(-1);
            }
        }
    }
}