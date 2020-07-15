package com.training;

import java.util.Optional;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> getCustomer(int customerId) {
        return customerRepository.getCustomer(customerId);
    }

    public void save(Customer newCustomer) throws CustomerAlreadyExistsException {
        this.customerRepository.save(newCustomer);
    }
}
