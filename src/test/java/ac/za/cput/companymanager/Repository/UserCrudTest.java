package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.App;
import ac.za.cput.companymanager.Factory.UserFactory;
import ac.za.cput.companymanager.domain.User;
import ac.za.cput.companymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

/**
 * Created by yusraAdmin on 9/25/2015.
 */

@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class UserCrudTest extends AbstractTestNGSpringContextTests {

    @Autowired
    UserRepository userRepository;
    @Test
    public void insert() throws Exception {

        User userAccount1 = UserFactory.createUser("yusra94", "12345");
        userRepository.save(userAccount1);

        User userAccount2 = UserFactory.createUser("KabasoB", "332211");
        userRepository.save(userAccount2);

        User userAccount3 = UserFactory.createUser("cput", "54321");
        userRepository.save(userAccount3);

    }
}
