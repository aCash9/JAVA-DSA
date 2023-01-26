package JavaDSA.OOPS;

class Car {
    String name;
    int price;

    public void details() {
        System.out.println("Car name : " + this.name);
        System.out.println("Car price : " + this.price);
    }
}

class HatchBack extends Car {
    int seats;
    String Engine;

    public void details() {
        System.out.println("Number of seats : " + this.seats);
        System.out.println("Number of Engine : " + this.Engine);
    }

    HatchBack() {

    }

    HatchBack(int seats, String Engine) {
        this.seats = seats;
        this.Engine = Engine;
    }

    HatchBack(HatchBack car) {
        this.seats = car.seats;
        this.Engine = car.Engine;
    }
}

public class OOPS1 {
    public static void main(String[] args) {
        HatchBack car1 = new HatchBack();
        OOPS1 obj = new OOPS1();
        car1.name = "Xcent";
        car1.price = 300000;
        car1.seats = 5;
        car1.Engine = "Diesel";
        System.out.println("Details of Car 1");
        car1.details();

        HatchBack car2 = new HatchBack();
        car2.name = "Baleno";
        car2.price = 400000;
        car2.seats = 4;
        car2.Engine = "Diesel";
        System.out.println("Details of Car 2");
        car2.details();

        HatchBack car3 = new HatchBack(6, "Swift Dezire");
        car3.details();

        // copying one object into other
        HatchBack car4 = new HatchBack(car2);
        car4.details();
    }
}
