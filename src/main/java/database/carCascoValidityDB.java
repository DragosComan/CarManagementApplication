package database;

import repository.CarCascoValidity;
import java.util.ArrayList;

/**
 * Car Casco Validity Database declaration
 * @author DComan
 */
public interface carCascoValidityDB {
    public ArrayList<CarCascoValidity> getCarPlate();

    public CarCascoValidity getCarCascoValidity(String carPlate);
    public void updateCarCascoValidity(CarCascoValidity carCascoValidity);
    public void deleteVehicle(CarCascoValidity carCascoValidity);
    public void createVehicle(CarCascoValidity carCascoValidity);
}
