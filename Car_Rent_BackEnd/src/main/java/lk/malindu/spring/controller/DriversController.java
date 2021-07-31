//package lk.malindu.spring.controller;
//
//
//import lk.malindu.spring.dto.DriversDTO;
//import lk.malindu.spring.service.DriversService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api/v1/drivers")
//public class DriversController {
//
//    @Autowired
//    private DriversService service;
//
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String saveDrivers(@RequestBody DriversDTO dto) {
//        boolean b = service.saveDrivers(dto);
//        return b + "";
//
//    }
//
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ArrayList<DriversDTO> getAllDrivers() {
//        return service.getAllDrivers();
//    }
//
//    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public DriversDTO searchDrivers(@PathVariable String id) {
//        return service.searchDrivers(id);
//    }
//
//
//    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String deleteDrivers(@RequestParam String id) {
//        boolean b = service.deleteDrivers(id);
//        return b + "";
//    }
//
//    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String updateDrivers(@RequestBody DriversDTO dto) {
//        boolean b = service.updateDrivers(dto);
//        return b + "";
//    }
//}
