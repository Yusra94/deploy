package ac.za.cput.companymanager.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by yusraAdmin on 9/25/2015.
 */
@Entity
public class User {

    @Id
    private String username;
    private String password;

    public User()
    {}

    public User (Builder builder)
    {
        this.username = builder.uname;
        this.password = builder.pWord;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public static class Builder
    {
        private String uname;
        private String pWord;

        public Builder(String uname)
        {
            this.uname = uname;
        }

        public Builder userPasword(String pWord)
        {
            this.pWord = pWord;
            return this;
        }

        public Builder copy(User value)
        {
            this.uname = value.username;
            this.pWord = value.password;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }


}
