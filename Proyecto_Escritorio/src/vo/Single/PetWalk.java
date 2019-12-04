/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.Single;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jjimenez
 */
public class PetWalk {
    private int walkId;
    private int petId;
    private Date date;
    private String steps;
    private Date start;
    private Date end;

    public PetWalk(int petId, Date start, Date end, String steps) {
        this.petId = petId;
        this.steps = steps;
        this.start = start;
        this.end = end;
    }

    public int getWalkId() {
        return walkId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
    
    
}
