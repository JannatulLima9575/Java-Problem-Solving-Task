class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2022;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.year = 2020;

        car1.displayInfo();
        car2.displayInfo();
    }
}

// Problem 02: Student Class
class Student {
    String name;
    int id;
    double cgpa;

    void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rakib Hasan";
        s1.id = 101;
        s1.cgpa = 3.85;

        Student s2 = new Student();
        s2.name = "Sara Akter";
        s2.id = 102;
        s2.cgpa = 3.92;

        s1.showDetails();
        s2.showDetails();
    }
}

// Problem 03: Book Class
class Book {
    String title;
    String author;
    double price;

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "The Alchemist";
        b1.author = "Paulo Coelho";
        b1.price = 450.0;

        Book b2 = new Book();
        b2.title = "Clean Code";
        b2.author = "Robert C. Martin";
        b2.price = 720.0;

        b1.displayBook();
        b2.displayBook();
    }
}

// Problem 04: Employee Class
class Employee {
    String name;
    double salary;
    String department;

    void showInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Abdur Rahman";
        e1.salary = 50000.0;
        e1.department = "ECE";

        Employee e2 = new Employee();
        e2.name = "Karim Ahmed";
        e2.salary = 65000.0;
        e2.department = "IT";

        e1.showInfo();
        e2.showInfo();
    }
}

// Problem 05: Product Class
class Product {
    String productName;
    double price;
    int quantity;

    void totalPrice() {
        double total = price * quantity;
        System.out.println("Product: " + productName);
        System.out.println("Total Price: " + total);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.productName = "Laptop";
        p1.price = 50000.0;
        p1.quantity = 2;

        Product p2 = new Product();
        p2.productName = "Mouse";
        p2.price = 500.0;
        p2.quantity = 3;

        p1.totalPrice();
        p2.totalPrice();
    }
}
