import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

class CPU {
    public String type;
    public int speed, socket, ram;
    public boolean valid;

    CPU(String type, int speed, int socket, int ram) {
        this.type = type;
        this.speed = speed;
        this.socket = socket;
        this.ram = ram;
        this.valid = isValidSpec(type, speed, socket, ram);
    }

    boolean isValidSpec(String type, int speed, int socket, int ram) {
        if (this.type != null && this.type.length() > 0 && this.speed > 0 && this.socket > 0 && this.ram > 0
                && this.ram <= 10) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.println(this.type);
        System.out.println(this.speed);
        System.out.println(this.socket);
        System.out.println(this.ram);
        System.out.println(valid);
    }
}

class MainBoard {
    public String type;
    public int socket, ram;
    public boolean valid;

    MainBoard(String type, int socket, int ram) {
        this.type = type;
        this.socket = socket;
        this.ram = ram;
        this.valid = isValidSpec(type, socket, ram);
    }

    boolean isValidSpec(String type, int socket, int ram) {
        if (this.type != null && this.type.length() > 0 && this.socket > 0 && this.ram > 0 && this.ram <= 10) {
            return true;
        }
        return false;
    }

    void printInfo() {
        System.out.println(this.type);
        System.out.println(this.socket);
        System.out.println(this.ram);
        System.out.println(valid);
    }
}

class Computer {
    boolean valid;
    MainBoard MB;
    CPU cpu;

    Computer(MainBoard MB, CPU cpu) {
        this.MB = MB;
        this.cpu = cpu;
        this.valid = isValidCom(MB, cpu);
    }

    boolean isValidCom(MainBoard MB, CPU cpu) {
        if (MB.valid && cpu.valid && MB.socket == cpu.socket && MB.ram == cpu.ram) {
            return true;
        }
        return false;
    }

    void printInfo() {
        if (valid) {
            System.out.println(cpu.type);
            System.out.println(cpu.speed);
            System.out.println(MB.type);
            System.out.println(MB.socket);
            System.out.println(MB.ram);
        } else {
            System.out.println("Invalid Spec");
            cpu.printInfo();
            MB.printInfo();
        }
    }
}

public class MBCompat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;

        CPU cpu = new CPU(model, clocks, socket, memType);
     

        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;
        MainBoard mb = new MainBoard(model, socket, memType);

        Computer com = new Computer(mb, cpu);
        com.printInfo();
    }
}
