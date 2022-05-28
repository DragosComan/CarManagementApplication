package repository;

import java.util.Date;

public class CarCascoValidity {
    private final String carPlate;
    private Date startCascoDate;
    private Date endCascoDate;

    /**
     * @param startCascoDate
     * @param endCascoDate
     */
    public CarCascoValidity(String carPlate,Date startCascoDate, Date endCascoDate) {
        this.carPlate = carPlate;
        this.startCascoDate = startCascoDate;
        this.endCascoDate = endCascoDate;
    }

    /**
     * @return car plate number
     */
    public String getCarPlate() {
        return carPlate;
    }

    /**
     * @return Casco start date
     */
    public Date getStartCascoDate() {
        return startCascoDate;
    }

    /**
     * @return Casco end date
     */
    public Date getEndCascoDate() {
        return endCascoDate;
    }

    /**
     * @param startCascoDate
     */
    public void setStartCascoDate(Date startCascoDate) {
        this.startCascoDate = startCascoDate;
    }

    /**
     * @param endCascoDate
     */
    public void setEndCascoDate(Date endCascoDate) {
        this.endCascoDate = endCascoDate;
    }

    @Override
    public String toString() {
        return "carCascoValidity{" +
                "startCascoDate=" + startCascoDate +
                ", endCascoDate=" + endCascoDate +
                '}';
    }
}
