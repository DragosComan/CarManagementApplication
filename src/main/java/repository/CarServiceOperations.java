package repository;

public class CarServiceOperations {
    private String oilFilter;
    private String airFilter;
    private String cabinFilter;
    private String dieselFilter;
    private String petrolFilter;

    public CarServiceOperations(String oilFilter, String airFilter, String cabinFilter, String dieselFilter, String petrolFilter) {
        this.oilFilter = oilFilter;
        this.airFilter = airFilter;
        this.cabinFilter = cabinFilter;
        this.dieselFilter = dieselFilter;
        this.petrolFilter = petrolFilter;
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
}
