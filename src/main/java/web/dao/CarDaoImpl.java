package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    public List<Car> getCar() {
        List<Car> carList = new ArrayList<>(5);
        carList.add(new Car("BMW", 192121L, "RED"));
        carList.add(new Car("NIVA", 2324454L, "BLU"));
        carList.add(new Car("AUDI", 6798004L, "WHITE"));
        carList.add(new Car("KIA", 7652330L, "GREEN"));
        carList.add(new Car("LADA", 4567781L, "BLACK"));
        return carList;
    }
}
