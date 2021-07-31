//package lk.malindu.spring.service.impl;
//
//import lk.malindu.spring.dto.CarRentDTO;
//import lk.malindu.spring.dto.DriversDTO;
//import lk.malindu.spring.entity.CarRent;
//import lk.malindu.spring.entity.Drivers;
//import lk.malindu.spring.repo.CarRentRepo;
//import lk.malindu.spring.repo.DriversRepo;
//import lk.malindu.spring.service.DriversService;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class DriversServiceImpl implements DriversService {
//
//    @Autowired
//    private DriversRepo driversRepo;
//    @Autowired
//    private ModelMapper mapper;
//
//    @Override
//    public boolean saveDrivers(DriversDTO dto) {
//        Drivers drivers = mapper.map(dto, Drivers.class);
//        driversRepo.save(drivers);
//        return true;
//    }
//
//    @Override
//    public boolean deleteDrivers(String id) {
//        driversRepo.deleteById(id);
//        return true;
//    }
//
//    @Override
//    public boolean updateDrivers(DriversDTO dto) {
//        if (driversRepo.existsById(dto.getId())) {
//            Drivers drivers = mapper.map(dto, Drivers.class);
//            driversRepo.save(drivers);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public DriversDTO searchDrivers(String id) {
//        Optional<Drivers> drivers = driversRepo.findById(id);
//        if (drivers.isPresent()) {
//            return mapper.map(drivers.get(), DriversDTO.class);
//        }
//        return null;
//    }
//
//    @Override
//    public ArrayList<DriversDTO> getAllDrivers() {
//        List<Drivers> all = driversRepo.findAll();
//        return mapper.map(all, new TypeToken<ArrayList<DriversDTO>>() {
//        }.getType());
//    }
//}
