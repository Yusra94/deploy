package ac.za.cput.companymanager.Repository;

import ac.za.cput.companymanager.Factory.OrderFactory;
import ac.za.cput.companymanager.Factory.ProductFactory;
import ac.za.cput.companymanager.Model.CustomerResource;
import ac.za.cput.companymanager.domain.*;
import ac.za.cput.companymanager.repository.CustomerRepository;
import ac.za.cput.companymanager.repository.OrderRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import ac.za.cput.companymanager.App;

import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class OrdersCrudTest extends AbstractTestNGSpringContextTests {

    CurrDate date;
    long id;
   // @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    OrderRepository repository;

    Product product1;
    Product product2;
    Product product3;
    List<Product> productList1;
    List<Product> productList2;
    CalculateOrderTotal calculateOrderTotal;

    @BeforeMethod
    public void setUp() throws Exception {

        date = new CurrDate();

    }

    @Test
    public void insert() throws Exception {

      /*  product1 = ProductFactory.createProduct("Dishwasher", 5, 22.00, 10.00, null);
        product2= ProductFactory.createProduct("Washing powder", 5, 45.00, 18.00, null);
        product3 = ProductFactory.createProduct("Pine", 5, 15.00, 8.00, null);

        productList1 = new ArrayList<Product>();
        productList1.add(product1);
        productList1.add(product2);
        productList1.add(product3);

        calculateOrderTotal= new CalculateOrderTotal();
        calculateOrderTotal.setOrderTotal(productList1);
        Orders order1 = OrderFactory.createOrder(date.getDate(),300, productList1,2L);
        repository.save(order1);

        product1 = ProductFactory.createProduct("Dishwasher", 5, 22.00, 10.00, null);
        product2= ProductFactory.createProduct("Washing powder", 5, 45.00, 18.00, null);
        product3 = ProductFactory.createProduct("Pine", 5, 15.00, 8.00, null);

        productList2 = new ArrayList<Product>();
        productList2.add(product1);
        productList2.add(product2);
        productList2.add(product3);

        calculateOrderTotal= new CalculateOrderTotal();
        calculateOrderTotal.setOrderTotal(productList2);
        Orders order2 = OrderFactory.createOrder(date.getDate(), calculateOrderTotal.getOrderTotal(), productList2);
        repository.save(order2);

        Orders order3 = OrderFactory.createOrder(date.getDate(), 926.40, null);
        repository.save(order3);

        //id = order3.getOrderNumber();
        Assert.assertEquals(date.getDate(), order1.getOrderDate());
        Assert.assertEquals(300.00, order1.getTotalSales());

        Assert.assertEquals(date.getDate(), order2.getOrderDate());
        Assert.assertEquals(1024.80, order2.getTotalSales());

        Assert.assertEquals(date.getDate(), order3.getOrderDate());
        Assert.assertEquals(926.40, order3.getTotalSales());
        */

    }

    /*@Test(dependsOnMethods = "insert")
    public void read() throws Exception {

        Orders orders = repository.findOne(id);
        Assert.assertEquals(id, orders.getOrderNumber());
        Assert.assertEquals(date.getDate(),orders.getOrderDate());
        Assert.assertEquals(926.40, orders.getTotalSales());

    }*/
    /*
    @Test
    public void update() throws Exception {

    }*/

   /* @Test (dependsOnMethods = "read")
    public void delete() throws Exception {

        Orders orders = repository.findOne(id);
        repository.delete(orders);


    }*/
}
