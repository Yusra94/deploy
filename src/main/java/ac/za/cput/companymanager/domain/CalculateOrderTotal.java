package ac.za.cput.companymanager.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yusraAdmin on 9/24/2015.
 */
public class CalculateOrderTotal {

    private double orderTotal =0;
    private Product product = new Product();
    private List<Product> productList;
    private List<Product> p = new ArrayList<Product>();
    int x = 0;



    public void setOrderTotal(List<Product> value) {


        productList = value;

        orderTotal = productList.get(1).getSellingPrice();
       /* Iterator<Product> productIterator = productList.iterator();
        while (productIterator.hasNext())
        {
            //System.out.print("YUsra");
            orderTotal = product.getSellingPrice();
        }*/
    }

    public double getOrderTotal() {
        return orderTotal;
    }

}
