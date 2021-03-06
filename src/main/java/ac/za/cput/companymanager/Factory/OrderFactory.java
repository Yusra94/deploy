package ac.za.cput.companymanager.Factory;

import ac.za.cput.companymanager.domain.Customer;
import ac.za.cput.companymanager.domain.Orders;
import ac.za.cput.companymanager.domain.Product;

import java.util.List;

public class OrderFactory {

    public static Orders createOrder(String orderDate, double totalSales, List<Product> productList, Long customerID)
    {
        Orders orders = new Orders.Builder(orderDate).totalSales(totalSales).productList(productList).customerID(customerID).build();

        return orders;
    }
}
