package lk.malindu.spring.repo;



import lk.malindu.spring.entity.CarRent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentRepo extends JpaRepository<CarRent,String> {
}
