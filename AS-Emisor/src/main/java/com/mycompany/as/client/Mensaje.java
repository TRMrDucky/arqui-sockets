package com.mycompany.as.client;

/**
 *
 * @author 52644
 */
public class Mensaje {
    private String emisor;
    private String mensaje;

    public Mensaje(){}
    
    public Mensaje(String emisor, String mensaje) {
        this.emisor = emisor;
        this.mensaje = mensaje;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
