package carTechnicalInspection;

import java.util.Date;

public class CarTechnicalInspection {
    public Date startInspection;
    public Date endInspection;

    public CarTechnicalInspection(Date startInspection, Date endInspection) {
        this.startInspection = startInspection;
        this.endInspection = endInspection;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
