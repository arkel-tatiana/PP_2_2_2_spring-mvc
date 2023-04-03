package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCar() {
        List<Car> carList = new ArrayList<>(5);
        carList.add(new Car("BMW", 192121L, "RED"));
        carList.add(new Car("BMW", 2324454L, "BLU"));
        carList.add(new Car("BMW", 6798004L, "WHITE"));
        carList.add(new Car("BMW", 7652330L, "GREEN"));
        carList.add(new Car("BMW", 4567781L, "BLACK"));
        return carList;
    };
}
