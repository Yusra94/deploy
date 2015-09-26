package ac.za.cput.companymanager.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderNumber;
    private String orderDate;
    private double totalSales;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="ProductList")
    private List<Product> productList;
    //@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JoinColumn(name="CustomerID")
    private Long customerID;

    public Orders() {
    }

    public Orders(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.orderDate = builder.orderDate;
        this.totalSales = builder.totalSales;
        this.productList = builder.productList;
        this.customerID = builder.customerID;

    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public List<Product> getProductList(){return productList;}

    public Long getCustomerID(){return customerID;}

    public static class Builder
    {
        private long orderNumber;
        private String orderDate;
        private double totalSales;
        private List<Product> productList;
        private  Long customerID;



        public Builder (String orderDate)
        {
            this.orderDate = orderDate;

        }

        public Builder totalSales(double total)
        {
            this.totalSales = total;
            return this;
        }

        public Builder productList(List<Product> value)
        {
            this.productList = value;
            return this;
        }

        public Builder customerID(Long customerID)
        {
            this.customerID = customerID;
            return this;
        }

        public Builder copy(Orders value)
        {
            this.orderNumber = value.orderNumber;
            this.orderDate = value.orderDate;
            this.totalSales = value.totalSales;
            this.productList = value.productList;
            this.customerID = value.customerID;
            return this;
        }

        public Orders build()
        {
            return new Orders(this);
        }
    }
}


