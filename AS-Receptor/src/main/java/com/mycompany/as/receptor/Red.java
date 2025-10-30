package com.mycompany.as.receptor;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 52644
 */
public class Red {
    private List<String> cola;

    public Red (){
        cola = new LinkedList<String>();
    }

    public void recibir(String elemento){
        cola.add(elemento);
    }

    public String desencolar(){
        return cola.remove(0);
    }
}
