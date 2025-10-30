package com.mycompany.as.receptor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

import javax.xml.crypto.Data;

/**
 *
 * @author 52644
 */
public class Red {
    private final int PUERTO = 8080;
    private final String IP = "127.0.0.1";
    ServerSocket serverSocket;
    Socket socket;
    String mensajeServer;
    DataOutputStream salidaServer;

    private List<String> cola;

    public Red() {
        try {
            serverSocket = new ServerSocket(PUERTO);
            socket = new Socket();
            System.out.println("Servidor iniciado");
        } catch (Exception e) {
            e.printStackTrace();
        }
        cola = new LinkedList<String>();
    }

    public void recibir(){
        while(true){
            try {
                socket = serverSocket.accept();
                BufferedReader entrada = new BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
                
                while(mensajeServer == entrada.readLine()){
                    cola.add(mensajeServer);
                }

                serverSocket.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }

    public String desencolar() {
        return cola.remove(0);
    }
}
