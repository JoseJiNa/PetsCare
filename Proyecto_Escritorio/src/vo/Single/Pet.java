/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.Single;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 * @author jjimenez
 */
public class Pet {
    private int petId;
    private String name;
    private Date birthDate;
    private int petType;
    private int ownerId;
    private int clincId;
    private String pathologies;

    public Pet(int petId, String name, Date birthDate, int ownerId, int clincId) {
        this.petId = petId;
        this.name = name;
        this.birthDate = birthDate;
        this.ownerId = ownerId;
        this.clincId = clincId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getClincId() {
        return clincId;
    }

    public void setClincId(int clincId) {
        this.clincId = clincId;
    }

    public String getPathologies() {
        return pathologies;
    }

    public void setPathologies(String pathologies) {
        this.pathologies = pathologies;
    }

    public int getAge() {
        LocalDate birthlocaldate = birthDate.toLocalDate();
        return Period.between(birthlocaldate, LocalDate.now()).getYears();
    }

    public int getPetType() {
        return petType;
    }

    public void setPetType(int petType) {
        this.petType = petType;
    }

    public String renderType(int petType) {
        switch (petType) {
            case 1:
                return "Perro";
            case 2:
                return "Gato";
        }
        return "Desconocido";
    }
}
