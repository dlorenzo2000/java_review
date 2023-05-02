/*
 *  Main.java uses several different Java programming concepts.
 *  Created: Mon May 1/23
 *  Updated: Tue May 2/23 0815hrs
 */

// Animal Interface
interface Animal {
    public void animalSound();

    public void sleep();
}

class Dog implements Animal {
    public void animalSound() {
        System.out.println("Dogs bark.");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}

public class Main {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    enum Level {
        EASY,
        MEDIUM,
        HARD
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        // Dog class uses Animal interface
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();

        Level myLevel = Level.MEDIUM;
        System.out.println("My level is: " + myLevel);
    }
}