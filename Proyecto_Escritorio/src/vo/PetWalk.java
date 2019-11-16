/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

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
    private Set<WalkStep> steps;
    private Date start;
    private Date end;

    public PetWalk(int petId, Date date, Set<WalkStep> steps, Date start, Date end) {
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

    public Set<WalkStep> getSteps() {
        return steps;
    }

    public void setSteps(Set<WalkStep> steps) {
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
