package com.company;

public class TestMain {
    public static void Task1(){
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
    }
    public static void Task2(){
        Circle c1 = new Circle(1.1);
        System.out.println(c1.Print());

        Circle c2 = new Circle();
        System.out.println(c2.Print());

        c1.setRadius(2.2);
        System.out.println(c1.Print());
        System.out.println("radius is: " + c1.getRadius());

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
    public static void Task3(){
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1.Print());
        Rectangle r2 = new Rectangle();
        System.out.println(r2.Print());

        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1.Print());

        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
    public static void Task4(){
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1.Print()); // toString();

        e1.setSalary(999);
        System.out.println(e1.Print()); // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());

        System.out.println(e1.raiseSalary(10));
        System.out.println(e1.Print());


    }
    public static void Task5(){
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1.Print());
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1.Print());
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());
        // Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
    public static void Task6(){
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1.Print());
        Account a2 = new Account("A102", "Kumar");
        System.out.println(a2.Print());

        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        a1.credit(100);
        System.out.println(a1.Print());
        a1.debit(50);
        System.out.println(a1.Print());
        a1.debit(500);
        System.out.println(a1.Print());

        a1.transferTo(a2, 100);
        System.out.println(a1.Print());
        System.out.println(a2.Print());

    }
    public static void Task7(){
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1.Print());

        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1.Print());
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        d1.setData(3, 4, 2016);
        System.out.println(d1.Print());
    }
    public static void Task8(){
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        t1.setTime(23, 59, 58);
        System.out.println(t1);
        System.out.println(t1.nextSeconds());
        System.out.println(t1.previousSeconds());
    }
    public static void Task9(){
        Ball ball = new Ball((int) 1.1f, (int) 2.2f, 10, (int) 3.3f, (int) 4.4f);
        System.out.println(ball);

        ball.setX((int) 80.0f);
        ball.setY((int) 35.0f);
        ball.setRadius(5);

        System.out.println(ball); // ()
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());


        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();

            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }

    }
}
