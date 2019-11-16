/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.sql.Date;

/**
 *
 * @author jjimenez
 */
public class PetDaylog {
    private final int petId;
    private Date logDate;
    private int activity;
    private int appetite;
    private int thirst;
    
    public PetDaylog(int petId, Date logDate, int activity, int appetite, int thirst) {
        this.petId = petId;
        this.logDate = logDate;
        this.activity = activity;
        this.appetite = appetite;
        this.thirst = thirst;
    }

    public PetDaylog(int petId) {
        this.petId = petId;
    }
    
    public int getPetId() {
        return petId;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
    
    
}
