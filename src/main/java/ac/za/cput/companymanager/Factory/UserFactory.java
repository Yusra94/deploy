package ac.za.cput.companymanager.Factory;

import ac.za.cput.companymanager.domain.User;

/**
 * Created by yusraAdmin on 9/25/2015.
 */
public class UserFactory {

    public static User createUser(String uName,String pWord){
        User userAccount = new User
                .Builder(uName)
                .userPasword(pWord)
                .build();
        return userAccount;
    }
}
