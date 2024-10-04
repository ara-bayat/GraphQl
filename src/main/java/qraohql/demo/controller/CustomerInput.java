package qraohql.demo.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import qraohql.demo.data.Customer;


@Setter
@Getter
public class CustomerInput {


    private String firstName;

    private String lastName;



    public Customer getCustomerEntity()
    {
        return Customer.builder()
                .firstName(firstName)
                .lastName(lastName)
                .build();

    }

}
