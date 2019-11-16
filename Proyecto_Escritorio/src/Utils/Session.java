/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import vo.Clinic;
import vo.User;

/**
 *
 * @author jjimenez
 */
public class Session {
    User loggedUser;
    Clinic clinic;

    public Session(User loggedUser, Clinic clinic) {
        this.loggedUser = loggedUser;
        this.clinic = clinic;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
    
    
    
}
