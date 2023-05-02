public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;

    public Employee(String fname, String lname, int id) {
        this.employeeId = id;
        this.firstName = fname;
        this.lastName = lname;
        this.setFullName(fname, lname);
    }

    public void setFullName(String fname, String lname) {
        this.fullName = fname + " " + lname;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return this.employeeId;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom", "Jones", 1);
        System.out.println("Fullname: " + emp1.fullName + "\n" + "ID: " + emp1.employeeId);
    }
}

class Animal {
    public void animalSound() {
        System.out.println("Animal sound.");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Dog says woof.");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("Cat says meow.");
    }
}