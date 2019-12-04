/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.Single;

import java.io.Serializable;

/**
 *
 * @author jjimenez
 */
public class PackageInfo implements Serializable{
    
    private int operacion;
    private String objeto;

    public PackageInfo(int tipo, String objeto) {
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

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }


}
