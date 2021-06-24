package lk.malindu.spring.service;

import lk.malindu.spring.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {
    boolean saveCustomer(CustomerDTO dto);

    boolean deleteCustomer(String id);

    CustomerDTO searchCustomer(String id);

    ArrayList<CustomerDTO> getAllCustomer();

    boolean updateCustomer(CustomerDTO dto);

    CustomerDTO searchCustomerByName(String name, String address);
}
