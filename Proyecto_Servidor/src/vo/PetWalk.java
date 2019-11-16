/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author jjimenez
 */
public class PetWalk {
    private int walkId;
    private int petId;
    private Date date;
    private ArrayList<WalkStep> steps;
    private Date start;
    private Date end;

    public PetWalk(int petId, Date date, ArrayList<WalkStep> steps, Date start, Date end) {
        this.petId = petId;
        this.date = date;
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

    public ArrayList<WalkStep> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<WalkStep> steps) {
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
