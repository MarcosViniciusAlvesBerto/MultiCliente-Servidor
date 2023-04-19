package principal;

import java.io.*;
import java.net.*;
import java.util.*;


public class SocketServidor {

    public static void main(String[] args) throws IOException {
                    
        ServerSocket Server = new ServerSocket(1245);
        System.out.println("Esperando Clientes");
        
        while(true){
            Socket socket = Server.accept();
            Servidor cliente = new Servidor(socket);
            System.out.println("Um Cliente Chegou");    
            cliente.start();
        }
    }
}