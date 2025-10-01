class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("This is a Car");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
        myCar.show();
    }
}
