public class Main2 {

    public static void main(String[] args) {

        Car car = new Car("BMW", "Black", 1996);
        Car car2 = new Car("Mercedes", "Red", 1998);

        System.out.println(car.model + " " + car.color + " " + car.il);
        System.out.println(car2.model + " " + car2.color + " " + car2.il);
    }
}

// Car car = new Car("BMW", "Black", 1996); Obyekt Yaradilir ve Moterizenin ici doldurulur
// Car car2 = new Car("Mercedes", "Red", 1998); Obyekt yaradilir ve Moterizenin ici doldurulur
// System.out.println(car.model + " " + car.color + " " + car.il); Capa Verilir
// System.out.println(car2.model + " " + car2.color + " " + car2.il); Capa Verilir