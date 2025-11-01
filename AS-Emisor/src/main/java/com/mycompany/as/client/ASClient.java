package com.mycompany.as.client;

import com.google.gson.Gson;

/**
 *
 * @author 52644
 */
public class ASClient {

    public static void main(String[] args) throws InterruptedException {
        Red red = new Red();
        Gson gson = new Gson();
        Mensaje mensaje = new Mensaje("TRMrDucky", "Saludos desde el emisor");

        String json = gson.toJson(mensaje);
        red.agregar(json);
        red.enviar();

        Thread.sleep(1000);
    }

}
