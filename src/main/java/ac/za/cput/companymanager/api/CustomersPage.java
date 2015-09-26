package ac.za.cput.companymanager.api;

import ac.za.cput.companymanager.Service.CustomerService;
import ac.za.cput.companymanager.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

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

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder)
    {
        service.create(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/all").buildAndExpand(customer.getCustomerID()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
