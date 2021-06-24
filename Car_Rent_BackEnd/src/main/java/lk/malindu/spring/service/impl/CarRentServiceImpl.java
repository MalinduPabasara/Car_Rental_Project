package lk.malindu.spring.service.impl;

import lk.malindu.spring.dto.CarRentDTO;
import lk.malindu.spring.entity.CarRent;
import lk.malindu.spring.repo.CarRentRepo;
import lk.malindu.spring.service.CarRentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarRentServiceImpl implements CarRentService {

    @Autowired
    private CarRentRepo rentRepo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean saveRent(CarRentDTO dto) {

        CarRent carRent = mapper.map(dto, CarRent.class);
        rentRepo.save(carRent);
        return true;
    }

    @Override
    public boolean deleteRent(String id) {
        rentRepo.deleteById(id);
        return true;
    }

    @Override
    public boolean updateRent(CarRentDTO dto) {
        if (rentRepo.existsById(dto.getRentId())) {
            CarRent carRent = mapper.map(dto, CarRent.class);
            rentRepo.save(carRent);
            return true;
        }
        return false;
    }

    @Override
    public CarRentDTO searchRent(String id) {
        Optional<CarRent> carRent = rentRepo.findById(id);
        if (carRent.isPresent()) {
            return mapper.map(carRent.get(), CarRentDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CarRentDTO> getAllRents() {
        List<CarRent> all = rentRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CarRentDTO>>() {
        }.getType());
    }
}
