package principal;

import java.io.*;
import java.net.*;

public class Servidor extends Thread {

    private Socket con;
    private BufferedReader in;
    private PrintWriter out;

    public Servidor(Socket socket) throws IOException {

        con = socket;
        in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        out = new PrintWriter(con.getOutputStream(), true);

    }

    public void run() {

        out.println("bem vindo");
        String mensagem = "";
        try {
            while ((mensagem = in.readLine()) != null) {
                System.out.println(mensagem);
            }
        } catch (IOException ex) {
            System.err.println("problema de IO");
        }

    }

}
