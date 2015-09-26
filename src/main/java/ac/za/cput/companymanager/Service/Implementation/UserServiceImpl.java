package ac.za.cput.companymanager.Service.Implementation;

import ac.za.cput.companymanager.Service.UserService;
import ac.za.cput.companymanager.domain.User;
import ac.za.cput.companymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yusraAdmin on 9/25/2015.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public String getUser(String username)
    {
        return repository.findOne(username).getUsername();
    }
}
