package lk.malindu.spring.service;

import lk.malindu.spring.dto.CarDTO;

import java.util.ArrayList;

public interface CarService {
    boolean saveCar(CarDTO dto);

    boolean deleteCar(String rno);

    boolean updateCar(CarDTO dto);

    CarDTO searchCar(String rno);

    ArrayList<CarDTO> getAllCars();
}
