package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	  try(ServerSocket  serverSocket = new ServerSocket(5000);)
      {

          while (true)
          {
              Socket socket = serverSocket.accept();
              System.out.println("Client Connected");
              BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
              PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

              String echoSting = input.readLine();
              if(echoSting.equals("exit"))
                      break;

              output.println(echoSting);
          }


      }catch(IOException e)
      {
          System.out.println();
      }
    }
}
