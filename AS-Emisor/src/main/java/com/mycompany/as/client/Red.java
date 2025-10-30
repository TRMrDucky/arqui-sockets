package com.mycompany.as.client;

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

    public void agregar(String elemento){
        cola.add(elemento);
    }

    public String sacar(){
        return cola.remove(0);
    }
}
