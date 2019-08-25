package com.kacperwozniak.credit.service;

import com.kacperwozniak.credit.model.Credit;
import com.kacperwozniak.credit.model.Customer;
import com.kacperwozniak.credit.model.Product;
import com.kacperwozniak.credit.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Service implementation ICreditService
 */
@Service
public class CreditService implements ICreditService{

    @Autowired
    CreditRepository creditRepository;

    @Autowired
    RestTemplate restTemplate;

    List<Credit> creditList;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    public List<Credit> getCreditsList(){
        creditList = creditRepository.findAll();

        for (Credit credit : creditList){
            credit.setCustomer(restTemplate.getForObject("http://localhost:8070/restapi/customer/getCustomer/" + credit.getCreditId(), Customer.class));
            credit.setProduct(restTemplate.getForObject("http://localhost:8090/restapi/product/getProduct/" + credit.getCreditId(),Product.class));
        }


        return creditList;
    }

    @Override
    public void createCredit(Credit credit){

        int generatedCreditID = createCreditNumber();

        credit.setCreditId(generatedCreditID);
        credit.getCustomer().setCreditId(generatedCreditID);
        credit.getProduct().setCreditId(generatedCreditID);

        creditRepository.save(credit);

        restTemplate.postForObject("http://localhost:8070/restapi/customer/createCustomer",credit.getCustomer(), Customer.class);
        restTemplate.postForObject("http://localhost:8090/restapi/product/createProduct", credit.getProduct(), Product.class);

    }

    /**
     * Method finds max ID from List of all Credits and creates new ID from max value +1
     * @return new creditID
     */
    private int createCreditNumber(){
        creditList = creditRepository.findAll();
        if (creditList.isEmpty())
            return 1;
        else
            return Collections.max(creditList, Comparator.comparing(c->c.getCreditId())).getCreditId() + 1;
    }
}
