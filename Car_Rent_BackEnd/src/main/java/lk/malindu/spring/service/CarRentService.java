package lk.malindu.spring.service;

import lk.malindu.spring.dto.CarRentDTO;

import java.util.ArrayList;

public interface CarRentService {
    boolean saveRent(CarRentDTO dto);

    boolean deleteRent(String id);

    boolean updateRent(CarRentDTO dto);

    CarRentDTO searchRent(String id);

    ArrayList<CarRentDTO> getAllRents();
}
