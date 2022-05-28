package repository;

import java.util.Date;

public class CarInsuranceValidity {
    public Date startDate;
    public Date endDate;

    public CarInsuranceValidity(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public CarInsuranceValidity() {
        super();
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "CarEnsuranceValability{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
