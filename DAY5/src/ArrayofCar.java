class Car{
    String brand;
    int year;


Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
}

}
public class ArrayofCar{
    public static void main(String[] args){
        Car c1 = new Car("Toyota", 2011);
        Car c2 = new Car("Hyundai" , 2015);
        Car c3 = new Car("Honda", 2023);

        Car[] cars = new Car[3];
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;

        for(Car c: cars){
            System.out.println(c.brand + " " + c.year);
        }


    }
}


