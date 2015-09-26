package ac.za.cput.companymanager.api;

import ac.za.cput.companymanager.Service.CustomerService;
import ac.za.cput.companymanager.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yusraAdmin on 9/25/2015.
 */
@RestController
@RequestMapping("/customers/**")
public class CustomersPage {

    @Autowired
    private CustomerService service;
    @RequestMapping(value= "/all", method = RequestMethod.GET)
    public List<Customer> getAllCustomers()
    {
        return service.getAllCustomers();
    }

   /* @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable Long id)
    {
        return service.getCustomer();
    }*/
}
