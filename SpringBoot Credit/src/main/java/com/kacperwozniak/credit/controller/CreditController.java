package com.kacperwozniak.credit.controller;

import com.kacperwozniak.credit.model.Credit;
import com.kacperwozniak.credit.model.Customer;
import com.kacperwozniak.credit.model.Product;
import com.kacperwozniak.credit.model.TransportObject;
import com.kacperwozniak.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Credit RESTController Class
 */
@RestController
@RequestMapping(value = "/restapi/credit")
public class CreditController {

    @Autowired
    CreditService creditService;

    Credit credit = new Credit();
    Customer customer = new Customer();
    Product product = new Product();

    @GetMapping (value = "/getCredits")
    public List<Credit> getCredits(){
        return creditService.getCreditsList();
    }

    @PostMapping (value = "/createCredit")
    public void createCredit(@RequestBody TransportObject transportObject){

        product.setProductName(transportObject.getProductName());
        product.setValue(transportObject.getValue());

        customer.setFirstName(transportObject.getFirstName());
        customer.setSurname(transportObject.getSurname());
        customer.setPesel(transportObject.getPesel());

        credit.setProduct(product);
        credit.setCustomer(customer);
        credit.setCreditName(transportObject.getCreditName());

        creditService.createCredit(credit);
    }
}
