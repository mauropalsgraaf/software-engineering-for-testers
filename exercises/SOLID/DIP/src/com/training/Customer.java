package com.training;

public class Customer {
    private CustomerId id;
    private CustomerName name;

    public Customer(CustomerId id, CustomerName name) {
        this.id = id;
        this.name = name;
    }

    public Customer(CustomerName name) {
        this.name = name;
    }

    public CustomerId getId() {
        return id;
    }

    public CustomerName getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "id=" + id +
            ", name=" + name +
            '}';
    }
}
