package ac.za.cput.companymanager.Service;

import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;

import java.util.List;

public interface CustomerService extends Service<Customer, Long>{

        List<Customer> getAllCustomers();
        //List<Orders> getOrders(Long customerID);

}

