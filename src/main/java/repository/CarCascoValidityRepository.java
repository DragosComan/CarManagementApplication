package repository;

import entity.CarCascoValidity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarCascoValidityRepository extends JpaRepository<CarCascoValidity,String> {
    /**
     * @param carPlate
     * @return
     */
    CarCascoValidity findByCarPlate(String carPlate);
}
