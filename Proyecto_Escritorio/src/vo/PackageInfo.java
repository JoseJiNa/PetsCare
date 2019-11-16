/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.io.Serializable;

/**
 *
 * @author jjimenez
 */
public class PackageInfo implements Serializable{
    
    private int operacion;
    private Object objeto;

    public PackageInfo(int tipo, User objeto) {
        this.operacion = tipo;
        this.objeto = objeto;
    }

    public PackageInfo() {
    }

    public int getTipo() {
        return operacion;
    }

    public void setTipo(int tipo) {
        this.operacion = tipo;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    
    
}
