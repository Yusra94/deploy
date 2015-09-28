package ac.za.cput.companymanager.api;

import ac.za.cput.companymanager.Service.CustomerService;
import ac.za.cput.companymanager.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
    public ResponseEntity<List<Customer>> getAllCustomers()
    {
        List<Customer> customerList = service.findAll();
        if(customerList.isEmpty()){
            return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
    }
	
    @RequestMapping(value="/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder)
    {
        service.create(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/all").buildAndExpand(customer.getCustomerID()).toUri());
        System.out.println("Customers page = ResponeEntity = Create customer");
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer Customer) {

        Customer cust = service.findById(id);

        if (cust==null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }

        Customer newCustomer = new Customer
                .Builder(cust.getCustomerName()).customerSurname(cust.getCustomerSurname()).phoneNumber(cust.getCustomerPhoneNumber()).emailAddress(cust.getCutomerEmailAddress()).customerAddress(cust.getCustomerAddress()).build();
        service.edit(newCustomer);
        return new ResponseEntity<Customer>(newCustomer, HttpStatus.OK);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") long id, @RequestBody Customer cus) {

        Customer customer = service.findById(id);
		
        if (customer == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }

        service.delete(customer);
        return new ResponseEntity<Customer>(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id) {
        Customer customer = service.findById(id);
        if (customer == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
	
}
