package lk.malindu.spring.service.impl;

import lk.malindu.spring.dto.CarDTO;
import lk.malindu.spring.dto.CustomerDTO;
import lk.malindu.spring.entity.Car;
import lk.malindu.spring.entity.CarRent;
import lk.malindu.spring.entity.Customer;
import lk.malindu.spring.repo.CarRepo;
import lk.malindu.spring.service.CarService;
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
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean saveCar(CarDTO dto) {
        Car car = mapper.map(dto, Car.class);
        carRepo.save(car);
        return true;
    }

    @Override
    public boolean deleteCar(String rno) {
        carRepo.deleteById(rno);
        return true;
    }

    @Override
    public boolean updateCar(CarDTO dto) {
        if (carRepo.existsById(dto.getRno())) {
            Car car = mapper.map(dto, Car.class);
            carRepo.save(car);
            return true;
        }
        return false;
    }

    @Override
    public CarDTO searchCar(String rno) {
        Optional<Car> car = carRepo.findById(rno);
        if (car.isPresent()) {
            return mapper.map(car.get(), CarDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        List<Car> all = carRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CarDTO>>() {
        }.getType());
    }
}
