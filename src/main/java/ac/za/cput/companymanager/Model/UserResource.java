package ac.za.cput.companymanager.Model;

import ac.za.cput.companymanager.domain.User;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Created by yusraAdmin on 9/25/2015.
 */
public class UserResource extends ResourceSupport {

    
        private String username;
        private String password;

        public UserResource() {

        }

        public UserResource(Builder builder) {
            this.username = builder.username;
            this.password = builder.password;
        }

        public String getUsername() {
            return username;
        }

        public static class Builder
        {
            private String username;
            private String password;

            public Builder(String value) {

                this.username = value;
            }

            public Builder setPassword(String value) {

                this.password = value;
                return this;
            }

            public UserResource build()
            {
                return new UserResource(this);
            }
        }

    
}
