package Coding;

public class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own
implementation of calculateSalePrice() method in which returned price is calculated as
following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5% discount, otherwise 10% discount
     */
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(){
       return carPrice;
    }

}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    double calculateSalePrice(){
        if(weight>2000){
            return carPrice-(carPrice*0.10);
        }else{
            return carPrice-(carPrice*0.20);
        }
    }

}
class Sedan extends Car{
 double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    double calculateSalePrice(){
        if(length>20){
            return carPrice-(carPrice*0.05);
        }else{
            return carPrice-(carPrice*0.10);
        }
    }

}
class CarTester{
    public static void main(String[] args) {
        Car car=new Truck(36000,"white",8500);
        System.out.println(car.calculateSalePrice());
        Car car1=new Sedan(45000,"Silver",15);
        System.out.println(car1.calculateSalePrice());

    }
}
