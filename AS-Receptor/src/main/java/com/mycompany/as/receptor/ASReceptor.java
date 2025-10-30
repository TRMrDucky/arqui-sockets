package com.mycompany.as.receptor;

import com.google.gson.Gson;

/**
 *
 * @author 52644
 */
public class ASReceptor {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Red red = new Red();
        red.recibir();
        String jsonInput = "";
        Mensaje mensaje = gson.fromJson(jsonInput, Mensaje.class);
        System.out.println(mensaje.toString());
    }
}
