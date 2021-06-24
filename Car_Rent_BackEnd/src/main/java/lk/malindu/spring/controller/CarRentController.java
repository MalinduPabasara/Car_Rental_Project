package lk.malindu.spring.controller;

import lk.malindu.spring.dto.CarRentDTO;
import lk.malindu.spring.dto.CustomerDTO;
import lk.malindu.spring.service.CarRentService;
import lk.malindu.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/rent")
public class CarRentController {

    @Autowired
    private CarRentService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveRent(@RequestBody CarRentDTO dto) {
        boolean b = service.saveRent(dto);
        return b + "";
    }

    @GetMapping
    public ArrayList<CarRentDTO> getAllRent() {
        return service.getAllRents();
    }

    @GetMapping(path = "/{id}")
    public CarRentDTO searchRent(@PathVariable String id) {
        return service.searchRent(id);
    }

//    @GetMapping(path = "/name/")
//    public CustomerDTO searchRentByName(@PathVariable String name) {
//        return service.searchRentByName(name);
//    }

    @DeleteMapping(params = {"id"})
    public String deleteRent(@RequestParam String id) {
        boolean b = service.deleteRent(id);
        return b + "";
    }

    @PutMapping
    public String updateRent(@RequestBody CarRentDTO dto) {
        boolean b = service.updateRent(dto);
        return b + "";
    }
}
