package entity;

public class CarServiceOperations {
    private String oilFilter;
    private String airFilter;
    private String cabinFilter;
    private String dieselFilter;
    private String petrolFilter;
    private String carPlate;

    public CarServiceOperations(String oilFilter, String airFilter, String cabinFilter, String dieselFilter, String petrolFilter, String carPlate) {
        this.oilFilter = oilFilter;
        this.airFilter = airFilter;
        this.cabinFilter = cabinFilter;
        this.dieselFilter = dieselFilter;
        this.petrolFilter = petrolFilter;
        this.carPlate = carPlate();
    }

    private String carPlate() {
        return null;
    }

    public String getOilFilter() {
        return oilFilter;
    }

    public void setOilFilter(String oilFilter) {
        this.oilFilter = oilFilter;
    }

    public String getAirFilter() {
        return airFilter;
    }

    public void setAirFilter(String airFilter) {
        this.airFilter = airFilter;
    }

    public String getCabinFilter() {
        return cabinFilter;
    }

    public void setCabinFilter(String cabinFilter) {
        this.cabinFilter = cabinFilter;
    }

    public String getDieselFilter() {
        return dieselFilter;
    }

    public void setDieselFilter(String dieselFilter) {
        this.dieselFilter = dieselFilter;
    }

    public String getPetrolFilter() {
        return petrolFilter;
    }

    public void setPetrolFilter(String petrolFilter) {
        this.petrolFilter = petrolFilter;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }
}
