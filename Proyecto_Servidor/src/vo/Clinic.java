/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author jjimenez
 */
public class Clinic {
    private int cliniId;
    private String name;
    private String phone;
    private String adress;

    public Clinic(int cliniId, String name, String phone, String adress) {
        this.cliniId = cliniId;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    public Clinic() {
    }

    public int getCliniId() {
        return cliniId;
    }

    public void setCliniId(int cliniId) {
        this.cliniId = cliniId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
    
}
