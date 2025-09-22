// Problem 1: School and Students with Courses
import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Course(String name) { this.name = name; }
    public void enrollStudent(Student s) {
        students.add(s);
        if(!s.getCourses().contains(this)) s.addCourse(this);
    }
    public String getName() { return name; }
    public void showStudents() {
        for(Student s: students) System.out.println(name+" -> "+s.getName());
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public Student(String name) { this.name = name; }
    public void addCourse(Course c) {
        courses.add(c);
        if(!cStudents(c).contains(this)) c.enrollStudent(this);
    }// placeholder to avoid recursion
    public List<Course> getCourses() { return courses; }
    public String getName() { return name; }
    public void showCourses() {
        for(Course c: courses) System.out.println(name+" enrolled in "+c.getName());
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();
    public School(String name) { this.name = name; }
    public void addStudent(Student s) { students.add(s); }
    public void showStudents() {
        for(Student s: students) System.out.println(name+" has student "+s.getName());
    }
}

// Problem 2: University with Faculties and Departments
class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String name;
    public Department(String name) { this.name = name; }
    public String getName() { return name; }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();
    public University(String name) { this.name = name; }
    public void addDepartment(Department d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }
    public void deleteUniversity() { departments.clear(); }
    public void show() {
        System.out.println("University: "+name);
        for(Department d: departments) System.out.println("Department: "+d.getName());
        for(Faculty f: faculties) System.out.println("Faculty: "+f.getName());
    }
}

// Problem 3: Hospital, Doctors, and Patients
class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();
    public Doctor(String name) { this.name = name; }
    public void consult(Patient p) {
        if(!patients.contains(p)) patients.add(p);
        if(!p.getDoctors().contains(this)) p.addDoctor(this);
        System.out.println("Doctor "+name+" consulted Patient "+p.getName());
    }
    public String getName() { return name; }
}

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    public Patient(String name) { this.name = name; }
    public void addDoctor(Doctor d) { doctors.add(d); }
    public List<Doctor> getDoctors() { return doctors; }
    public String getName() { return name; }
}

class Hospital {
    private String name;
    public Hospital(String name) { this.name = name; }
}

// Problem 4: E-commerce Platform
class Product {
    private String name;
    private double price;
    public Product(String name,double price) { this.name = name; this.price = price; }
    public double getPrice() { return price; }
    public String getName() { return name; }
}

class Order {
    private List<Product> products = new ArrayList<>();
    private Customer customer;
    public Order(Customer c) { this.customer = c; }
    public void addProduct(Product p) { products.add(p); }
    public void showOrder() {
        System.out.println("Order for "+customer.getName());
        for(Product p: products) System.out.println(p.getName()+" "+p.getPrice());
    }
}

class Customer {
    private String name;
    public Customer(String name) { this.name = name; }
    public String getName() { return name; }
    public Order placeOrder() { return new Order(this); }
}

// Problem 5: University Management System
class UniStudent {
    private String name;
    private List<UniCourse> courses = new ArrayList<>();
    public UniStudent(String name) { this.name = name; }
    public void enrollCourse(UniCourse c) {
        courses.add(c);
        if(c.getStudents().contains(this)) return;
        c.addStudent(this);
        System.out.println(name+" enrolled in "+c.getName());
    }
    public String getName() { return name; }
}

class Professor {
    private String name;
    public Professor(String name) { this.name = name; }
    public void assignProfessor(UniCourse c) {
        c.setProfessor(this);
        System.out.println(name+" assigned to "+c.getName());
    }
    public String getName() { return name; }
}

class UniCourse {
    private String name;
    private Professor professor;
    private List<UniStudent> students = new ArrayList<>();
    public UniCourse(String name) { this.name = name; }
    public void setProfessor(Professor p) { this.professor = p; }
    public void addStudent(UniStudent s) { students.add(s); }
    public List<UniStudent> getStudents() { return students; }
    public String getName() { return name; }
}

public class Main {
    public static void main(String[] args) {
        School sch = new School("GLA");
        Student s1 = new Student("Komal");
        Student s2 = new Student("Rahul");
        Course c1 = new Course("Math");
        Course c2 = new Course("CS");
        sch.addStudent(s1);
        sch.addStudent(s2);
        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);
        s1.showCourses();
        c1.showStudents();
        sch.showStudents();

        University u = new University("State University");
        Department d1 = new Department("CSE");
        Faculty f1 = new Faculty("Dr. Smith");
        u.addDepartment(d1);
        u.addFaculty(f1);
        u.show();
        u.deleteUniversity();
        u.show();

        Hospital h = new Hospital("City Hospital");
        Doctor doc1 = new Doctor("Dr. Brown");
        Patient pat1 = new Patient("Alice");
        doc1.consult(pat1);

        Customer cust = new Customer("Bob");
        Order order = cust.placeOrder();
        order.addProduct(new Product("Laptop",75000));
        order.addProduct(new Product("Mouse",500));
        order.showOrder();

        UniStudent us = new UniStudent("Komal");
        Professor prof = new Professor("Dr. Lee");
        UniCourse uc = new UniCourse("Networks");
        prof.assignProfessor(uc);
        us.enrollCourse(uc);
    }
}
