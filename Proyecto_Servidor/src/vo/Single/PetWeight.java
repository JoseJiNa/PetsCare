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
public class PetWeight {
    private int petId;
    private Date weightDate;
    private Double weightValue;

    public PetWeight(int petId, Date weightDate, Double weightValue) {
        this.petId = petId;
        this.weightDate = weightDate;
        this.weightValue = weightValue;
    }

    public PetWeight() {
    }

    public int getPetId() {
        return petId;
    }
   
    public Date getWeightDate() {
        return weightDate;
    }

    public void setWeightDate(Date weightDate) {
        this.weightDate = weightDate;
    }

    public Double getWeightValue() {
        return weightValue;
    }

    public void setWeightValue(Double weightValue) {
        this.weightValue = weightValue;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }
    
    
}
