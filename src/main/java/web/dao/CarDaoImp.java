package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Sandero Stepway", "red",1645290.00));
        carList.add(new Car("Renault Arcana", "blue",1622000.00));
        carList.add(new Car("VW Polo", "gray",1800000.00));
        carList.add(new Car("Skoda Rapit", "black",1455290.90));
        carList.add(new Car("Haval F7 I", "blue",1590000.00));
    }

    @Override
    public List<Car> getCars(int value) {
        if (value == 0) {
            return carList;
        }

        return carList.stream().limit(value).collect(Collectors.toList());
    }
}
