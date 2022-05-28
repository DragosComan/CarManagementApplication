package tables;

import database.CarCascoValidityDB;
import org.hibernate.boot.model.relational.Database;
import entity.CarCascoValidity;

import javax.persistence.Index;
import javax.persistence.Table;
import java.util.ArrayList;

@Table(indexes = {
        @Index(name = "idx_carcascovaliditytable_db", columnList = "db")
})
public class CarCascoValidityTable implements CarCascoValidityDB {
    Database db = Database.getInstance();
    ArrayList<CarCascoValidity> carCascoValidities = new ArrayList<CarCascoValidity>();

    public CarCascoValidityTable(){

    }
}
