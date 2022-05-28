package repository;

import entity.CarInsuranceValidity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface CarInsuranceValidityRepository extends JpaRepository<CarInsuranceValidity, String> {
    CarInsuranceValidity findByCarPlate(String carPlate);
}
