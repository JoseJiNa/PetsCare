/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.Single;

/**
 *
 * @author jjimenez
 */
public class Vaccine {
    private int vaccineId;
    private String name;
    private int petType;
    private int renovPeriod;

    public Vaccine(String name, int petType, int renovPeriod) {
        this.name = name;
        this.petType = petType;
        this.renovPeriod = renovPeriod;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetType() {
        return petType;
    }

    public void setPetType(int petType) {
        this.petType = petType;
    }

    public int getRenovPeriod() {
        return renovPeriod;
    }

    public void setRenovPeriod(int renovPeriod) {
        this.renovPeriod = renovPeriod;
    }
    
    
}
