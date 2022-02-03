package tr.edu.sehir.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

    public static void main(String[] args) throws IOException{

       //InetAddress address = InetAddress.getLocalHost();
        InetAddress address = InetAddress.getLocalHost();

        String hostname = address.getHostName();
        int portNumber =4321; //= Integer.parseInt(args[0]);

        try (

            Socket socket = new Socket(/*hostname*/"192.168.1.53", portNumber);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader( socket.getInputStream()));
            BufferedReader stdin = new BufferedReader(new InputStreamReader((System.in)));
           )  {
            String userInput;
            System.out.println("tyoe a sentence and press enter");
            while((userInput =stdin.readLine())!="."){
                out.println(userInput);
                System.out.println("echo: "+ in.readLine());
               // System.out.println("echo2: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host");
            System.exit(1);
        }

        catch  (IOException e) {
            System.out.println("No I/O");
            System.exit(1);
        }
    }
}
