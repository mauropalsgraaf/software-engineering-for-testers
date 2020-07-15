package com.training;

public class Main {

    public static void main(String[] args) {
	    var customerRepository = new CustomerRepository();
	    var customerService = new CustomerService(customerRepository);

	    var customer = new Customer(new CustomerId(1), new CustomerName("Mauro", "Palsgraaf"));

	    System.out.println(customerService.getCustomer(new CustomerId(1)));

	    customerService.save(customer);

	    System.out.println(customerService.getCustomer(new CustomerId(1)));
    }
}
