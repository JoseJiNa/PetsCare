/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.Single;

import java.sql.Date;

/**
 *
 * @author jjimenez
 */
public class PetVaccine {
    private int petId;
    private int vacId;
    private Date vacDay;

    public PetVaccine(int petId, int vacId, Date vacDay) {
        this.vacId = vacId;
        this.vacDay = vacDay;
        this.petId = petId;
    }

    public PetVaccine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPetId() {
        return petId;
    }

    public int getVacId() {
        return vacId;
    }

    public Date getVacDay() {
        return vacDay;
    }

    public void setVacDay(Date vacDay) {
        this.vacDay = vacDay;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public void setVacId(int vacId) {
        this.vacId = vacId;
    }
    
    
    
}
