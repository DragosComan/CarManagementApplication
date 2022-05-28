package repository;

import entity.CarTechnicalInspection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarTechnicalInspectionRepository extends JpaRepository<CarTechnicalInspectionRepository, String> {
    CarTechnicalInspection findByCarPlate();
}
