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
class WalkStep {
    private int walkId;
    private Date dateTime;
    private String coordinates;

    public WalkStep(int walkId, Date dateTime, String coordinates) {
        this.walkId = walkId;
        this.dateTime = dateTime;
        this.coordinates = coordinates;
    }

    public int getWalkId() {
        return walkId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
    
    
}
