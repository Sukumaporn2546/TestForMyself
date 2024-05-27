import java.util.Scanner;

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
        if (this.type != null && this.type.length()>0 && this.speed > 0 && this.socket > 0 && this.ram > 0 && this.ram <= 10) {
            return true;
        }else{
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

public class CPUSpec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        cpu.printInfo();
    }
}
