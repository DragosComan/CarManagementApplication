package repository;

import entity.CarServiceOperations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarServiceOperationsRepository extends JpaRepository<CarServiceOperations,String> {
    CarServiceOperations findByCarPlate();

}
