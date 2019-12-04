package vo.Multiple;

import vo.Single.User;

import java.util.ArrayList;

public class Users extends ArrayList<User> {
    public Users(){

    }

    public User getUserById(int id){
        for(User user: this){
            if(user.getUserId()== id){
                return user;
            }
        }
        return null;
    }
}
