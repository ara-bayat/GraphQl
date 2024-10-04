package qraohql.demo.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import qraohql.demo.data.Customer;
import qraohql.demo.data.CustomerRepository;

@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @QueryMapping
    public Iterable<Customer> customers() {
        return customerRepository.findAll();
    }

    @QueryMapping
    public Customer customerById(@Argument Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Customer addCustomer(@Argument(name="input") CustomerInput customerInput) {
        return customerRepository.save(customerInput.getCustomerEntity());
    }
}
