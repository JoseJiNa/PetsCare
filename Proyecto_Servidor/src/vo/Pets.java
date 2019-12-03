package vo;

import java.util.ArrayList;

public class Pets extends ArrayList<Pet> {
    public Pet getPetById(int id){
        for(Pet pet: this){
            if(pet.getPetId()== id){
                return pet;
            }
        }
        return null;
    }

}
