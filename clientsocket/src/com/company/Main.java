package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 try(Socket socket = new Socket("localhost",5000);)
     {
         BufferedReader echos = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream());

         Scanner scanner = new Scanner(System.in);
         String echString;
         StringBuffer response;
         do{
             System.out.println("Enter String to be ecoched");
             echString =  scanner.nextLine();



         }while (! echString.equals("exit"));

     }catch (IOException e)
     {
         System.out.println(e.getMessage());
     }

    }
}
