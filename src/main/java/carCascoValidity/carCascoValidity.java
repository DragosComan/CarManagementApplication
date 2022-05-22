package carCascoValidity;

import java.util.Date;

public class carCascoValidity {
    public Date startCascoDate;
    public Date endCascoDate;

    public carCascoValidity(Date startCascoDate, Date endCascoDate) {
        this.startCascoDate = startCascoDate;
        this.endCascoDate = endCascoDate;
    }

    public void setStartCascoDate(Date startCascoDate) {
        this.startCascoDate = startCascoDate;
    }

    public Date getEndCascoDate() {
        return endCascoDate;
    }

    public carCascoValidity() {
        super();
    }

    @Override
    public String toString() {
        return "carCascoValidity{" +
                "startCascoDate=" + startCascoDate +
                ", endCascoDate=" + endCascoDate +
                '}';
    }
}
