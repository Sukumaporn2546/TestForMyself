
import java.util.ArrayList;
import java.util.Scanner;

class Animal {

    String name;
    int age;
    int lifeExpect;

    public Animal(String name, int lifeExpect) {
        this.name = name;
        this.lifeExpect = lifeExpect;
        age = 0;
        System.out.println(this.name + " was born with life expectancy " + lifeExpect + " year(s)");
    }

    void live(int year) {
        System.out.print(name);
        if (age == lifeExpect) {
            System.out.println(" died earlier");
        } else if (age + year < lifeExpect) {
            if (year == 1)
                System.out.print(" lived " + year + " more year");
            else
                System.out.print(" lived " + year + " more years");
            System.out.println();
            age += year;
        } else if (age + year > lifeExpect) {
            int ageBeforeDie = lifeExpect - age;
            if (ageBeforeDie == 1)
                System.out.print(" lived " + ageBeforeDie + " more year and died");
            else
                System.out.print(" lived " + ageBeforeDie + " more years and died");
            System.out.println();
            age = lifeExpect;
        } else if (age + year == lifeExpect) {
            if (year == 1) {
                System.out.print(" lived 1 more year and died");
            } else {
                System.out.print(" lived " + year + " more years and died");
            }
            System.out.println();
            age += year;
        }
    }

    boolean isAlive() {
        if (age < lifeExpect) {
            System.out.println(name + " is alive");
            return true;
        } else {
            System.out.println(name + " is dead");
            return false;
        }
    }

    void vaccine() {
        System.out.println(this.name + "'s life expectancy is now " + lifeExpect + " year(s)");
    }
}

class Dog extends Animal {
    boolean isVaccine;

    Dog(String name) {
        super(name, 8);
    }

    @Override
    void vaccine() {
        if (!isVaccine) {
            lifeExpect = lifeExpect + (lifeExpect - age);
            isVaccine = true;
        }
        super.vaccine();
    }
}

class Turtle extends Animal {
    Turtle(String name) {
        super(name, 50);
    }
}

class Salmon extends Animal {
    Salmon(String name) {
        super(name, 4);
    }
}

public class AnimalDomain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Animal> an = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int typeAni = sc.nextInt();
                String name = sc.next();
                if (typeAni == 1) {
                    Dog d = new Dog(name);
                    an.add(d);
                } else if (typeAni == 2) {
                    Turtle t = new Turtle(name);
                    an.add(t);
                } else {
                    Salmon s = new Salmon(name);
                    an.add(s);
                }
            } else if (type == 2) {
                int P = sc.nextInt() - 1;
                int year = sc.nextInt();
                an.get(P).live(year);
            } else if (type == 3) {
                int P = sc.nextInt() - 1;
                an.get(P).isAlive();
            } else {
                int P = sc.nextInt() - 1;
                an.get(P).vaccine();
            }
        }
    }
}