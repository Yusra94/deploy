package ac.za.cput.companymanager.api;

import ac.za.cput.companymanager.Service.UserService;
import ac.za.cput.companymanager.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yusraAdmin on 9/25/2015.
 */

@RestController
@RequestMapping(value="/login/**")
public class UserAPI {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)

    public  String getUser(@PathVariable("username") String username)
    {
        String user = userService.getUser(username);
        return user;
    }
}
