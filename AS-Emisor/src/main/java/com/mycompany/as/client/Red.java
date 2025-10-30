package com.mycompany.as.client;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 52644
 */
public class Red {
    private final int PUERTO = 8080;
    private final String IP = "127.0.0.1";
    Socket socket;

    private List<String> cola;

    public Red() {
        try {
            socket = new Socket(IP, PUERTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        cola = new LinkedList<String>();
    }

    public void agregar(String elemento) {
        cola.add(elemento);
    }

    public void enviar() {
        try{
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            for(String mensaje : cola){
                out.println(mensaje);
                System.out.println("Enviando: " + mensaje);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
}
