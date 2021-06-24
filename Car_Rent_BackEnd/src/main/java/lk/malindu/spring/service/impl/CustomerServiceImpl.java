package lk.malindu.spring.service.impl;

import lk.malindu.spring.dto.CustomerDTO;
import lk.malindu.spring.entity.Customer;
import lk.malindu.spring.repo.CustomerRepo;
import lk.malindu.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean saveCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getNic())) {
            throw new RuntimeException("Customer Already Exists...");
        }
//        Customer customer = mapper.map(dto, Customer.class);
        customerRepo.save(mapper.map(dto, Customer.class));
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return true;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CustomerDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {
        List<Customer> all = customerRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CustomerDTO>>() {
        }.getType());
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getNic())) {
            Customer customer = mapper.map(dto, Customer.class);
            customerRepo.save(customer);
            return true;
        }
        return false;
    }

    @Override
    public CustomerDTO searchCustomerByName(String name, String address) {
//        Optional<Customer> customer = customerRepo.findByNameAndAddress(name, address);
//        if (customer.isPresent()) {
//            return mapper.map(customer.get(), CustomerDTO.class);
//        }
        return null;
    }
}
