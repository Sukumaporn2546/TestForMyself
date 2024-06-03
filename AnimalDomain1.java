
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
        if(age == lifeExpect){
            System.out.println(" died earlier");
        }
        else if (age + year < lifeExpect) {
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
}

public class AnimalDomain1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Animal> an = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                String name = sc.next();
                int lifeExpect = sc.nextInt();
                Animal ani = new Animal(name, lifeExpect);
                an.add(ani);
            } else if (type == 2) {
                int id = sc.nextInt();
                int year = sc.nextInt();
                an.get(id - 1).live(year);
            } else if (type == 3) {
                int id = sc.nextInt();
                an.get(id - 1).isAlive();
            }
        }
    }
}