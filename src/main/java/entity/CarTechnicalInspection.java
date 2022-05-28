package entity;

import java.util.Date;

public class CarTechnicalInspection {
    public Date startInspection;
    public Date endInspection;
    private String carPlate;


    public CarTechnicalInspection(Date startInspection, Date endInspection, String carPlate) {
        this.startInspection = startInspection;
        this.endInspection = endInspection;
        this.carPlate = carPlate;
    }

    public Date getStartInspection() {
        return startInspection;
    }

    public void setStartInspection(Date startInspection) {
        this.startInspection = startInspection;
    }

    public Date getEndInspection() {
        return endInspection;
    }

    public void setEndInspection(Date endInspection) {
        this.endInspection = endInspection;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
