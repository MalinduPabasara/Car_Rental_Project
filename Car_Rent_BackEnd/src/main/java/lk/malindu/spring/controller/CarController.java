package lk.malindu.spring.controller;

import lk.malindu.spring.dto.CarDTO;
import lk.malindu.spring.dto.CustomerDTO;
import lk.malindu.spring.service.CarService;
import lk.malindu.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveCar(@RequestBody CarDTO dto) {
//        if (dto.getRno().trim().length() <= 0) {
//            throw new RuntimeException("Car RNo Cannot be empty");
//        }

        boolean b = service.saveCar(dto);
        return b + "";

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CarDTO> getAllCars() {

        return service.getAllCars();
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CarDTO searchCar(@PathVariable String id) {
        return service.searchCar(id);
    }


    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteCar(@RequestParam String id) {
        System.out.println("delete called");
        boolean b = service.deleteCar(id);
        return b + "";
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateCar(@RequestBody CarDTO dto) {
        boolean b = service.updateCar(dto);
        return b + "";
    }
}
