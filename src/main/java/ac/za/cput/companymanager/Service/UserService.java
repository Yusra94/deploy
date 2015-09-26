package ac.za.cput.companymanager.Service;


import ac.za.cput.companymanager.domain.User;
import ac.za.cput.companymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yusraAdmin on 9/25/2015.
 */
public interface UserService {

    String getUser(String username);
}
