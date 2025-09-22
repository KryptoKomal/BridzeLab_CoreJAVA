// Sample Problem 1: Bank Account Types (Hierarchical Inheritance)
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("This is a Savings Account with Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("This is a Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int lockPeriodMonths;

    public FixedDepositAccount(String accountNumber, double balance, int lockPeriodMonths) {
        super(accountNumber, balance);
        this.lockPeriodMonths = lockPeriodMonths;
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account locked for " + lockPeriodMonths + " months");
    }
}

// Sample Problem 2: School System with Different Roles (Hierarchical Inheritance)
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayRole() {
        System.out.println(name + " is Staff working as " + position);
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000.0, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 3000.0, 1000.0);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000.0, 12);
        sa.displayDetails();
        sa.displayAccountType();
        ca.displayDetails();
