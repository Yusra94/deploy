package ac.za.cput.companymanager.Service.Implementation;

import ac.za.cput.companymanager.Service.CustomerService;
import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> getAllCustomers()
    {
        List<Customer> customerList = new ArrayList();
        Iterable<Customer> customerIterable = repository.findAll();
        for (Customer customer : customerIterable) {
            customerList.add(customer);
        }
        return customerList;
    }

    /*NOT USED*/
    @Override
    public List<Orders> getOrders(Long id)
    {
        return repository.findOne(id).getOrderses();
    }

    @Override
    public Customer findById(Long id){

        return repository.findOne(id);
    }

    @Override
    public Customer create(Customer entity){

        System.out.println("CustomerServiceImpl = create...saving to DB");
        return repository.save(entity);
    }

    @Override
    public Customer edit(Customer entity){

        return repository.save(entity);
    }

    @Override
    public void delete(Customer entity){

        repository.delete(entity);
    }

    @Override
    public List<Customer> findAll()
    {
        List<Customer> customerList = new ArrayList();
        Iterable<Customer> customerIterable = repository.findAll();
        for (Customer customer : customerIterable) {
            customerList.add(customer);
        }
        return customerList;
    }

}
