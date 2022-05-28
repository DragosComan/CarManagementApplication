package repository;

import entity.VehicleInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInformationRepository extends JpaRepository<VehicleInformation, String> {
    VehicleInformation findByCarPlate();
}
