package vehicleInformation;

public class VehicleInformation {
    private String classModel;
    private String carManufacturer;
    private String carModel;
    private String carEngine;
    private String carFuel;
    private String carVIN;
    private double carKM;

    public VehicleInformation(String classModel, String carManufacturer, String carModel, String carEngine, String carFuel, String carVIN, double carKM) {
        this.classModel = classModel;
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.carEngine = carEngine;
        this.carFuel = carFuel;
        this.carVIN = carVIN;
        this.carKM = carKM;
    }

    public String getClassModel() {
        return classModel;
    }

    public void setClassModel(String classModel) {
        this.classModel = classModel;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(String carFuel) {
        this.carFuel = carFuel;
    }

    public String getCarVIN() {
        return carVIN;
    }

    public void setCarVIN(String carVIN) {
        this.carVIN = carVIN;
    }

    public double getCarKM() {
        return carKM;
    }

    public void setCarKM(double carKM) {
        this.carKM = carKM;
    }
}
