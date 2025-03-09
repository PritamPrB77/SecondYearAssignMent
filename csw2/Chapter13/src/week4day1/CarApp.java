package week4day1;

import java.util.*;

class Car {
    private String modelNumber;
    private String name;
    private int stock;
    public Car(String modelNumber, String name, int stock) {
        this.modelNumber = modelNumber;
        this.name = name;
        this.stock = stock;
    }
    public String getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelNumber='" + modelNumber + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
class StockComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.getStock(), c2.getStock());
    }
}
public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("1234", "Toyota Camry", 10));
        cars.add(new Car("5678", "Honda Accord", 5));
        cars.add(new Car("9101", "Ford Mustang", 7));
        Collections.sort(cars, new StockComparator());
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

