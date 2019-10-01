package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	 try(Socket socket = new Socket("localhost",5000);)
     {
         BufferedReader echos = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(),true);

         Scanner scanner = new Scanner(System.in);
         String echoString;
         String response;
         System.out.println("About to enter in do while loop");
         do{
             System.out.println("Enter String to be ecoched");
             echoString =  scanner.nextLine();
             stringToEcho.println(echoString);

             if(!echoString.equals("exit"))
             {

                 response = echos.readLine();
                 System.out.println(response);

             }


         }while (! echoString.equals("exit"));

     }catch (IOException e)
     {
         System.out.println(e.getMessage());
     }

    }
}
