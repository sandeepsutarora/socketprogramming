package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	  try(ServerSocket  serverSocket = new ServerSocket(5000);)
      {
        Socket socket = serverSocket.accept();
          System.out.println("Client Connected");
          BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter output = new PrintWriter(socket.getOutputStream());
          while (true)
          {
              String echoSting = input.readLine();
              if(echoSting.equals("exit"))
                      break;
              else
                  output.println(echoSting);


          }


      }catch(IOException e)
      {
          System.out.println();
      }
    }
}
