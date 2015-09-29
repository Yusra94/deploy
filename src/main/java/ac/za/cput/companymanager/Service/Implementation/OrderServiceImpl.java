package ac.za.cput.companymanager.Service.Implementation;

import ac.za.cput.companymanager.Service.OrderService;
import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.repository.CustomerRepository;
import ac.za.cput.companymanager.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    CustomerRepository repository;

    @Autowired
    OrderRepository orderRepository;

    /*@Override
    public List<Customer> getCustomer()
    {
        List<Customer> customerList = new ArrayList<>();
        Iterable<Customer> customerIterable = repository.findAll();

        for(Customer customer: customerIterable)
        {
            customerList.add(customer);
        }

        return customerList;
    }*/

    /*@Override
    public List<Orders> getCustomerOrdersById(Long customerID) {
        return repository.findOne(customerID).getOrderses();
    }*/

    @Override
    public List<Orders> getAllOrders(){

        List<Orders> ordersList = new ArrayList<>();
        Iterable<Orders> ordersIterable = orderRepository.findAll();

        for(Orders o : ordersIterable)
        {
            ordersList.add(o);
        }

        return ordersList;
    }

    /*@Override
    public List<Orders> getOrders(Long id)
    {
        List<Orders> ordersList = new ArrayList();
        return ordersList;
        //return  repository.findOne(id).getOrderses();

    }*/


}
