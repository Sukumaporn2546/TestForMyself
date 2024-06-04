import java.util.Scanner;

class Component {
    public String type;
    public int socket, ram;
    public boolean valid;

    Component(String type, int socket, int ram) {
        this.type = type;
        this.socket = socket;
        this.ram = ram;
        this.valid = isValidSpec(type, socket, ram);
    }

    boolean isValidSpec(String type, int socket, int ram) {
        if (this.type != null && this.type.length() > 0 && this.socket > 0 && this.ram > 0
                && this.ram <= 10) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.println(valid);
        System.out.println(this.type);
        System.out.println(this.socket);
        System.out.println(this.ram);

    }
}

class CPU2 extends Component {
    int speed;

    CPU2(String type, int speed, int socket, int ram) {
        super(type, socket, ram);
        this.speed = speed;
        valid = isValidSpec(type, speed, socket, ram);
    }

    boolean isValidSpec(String type, int speed, int socket, int ram) {
        if (isValidSpec(type, socket, ram) && speed > 0) {
            return true;
        }
        return false;
    }

    void printInfo() {
        super.printInfo();
        System.out.println(speed);
    }
}

class MainBoard2 extends Component {
    MainBoard2(String type, int socket, int ram) {
        super(type, socket, ram);
        valid = isValidSpec(type, socket, ram);
    }
}

public class ClassJoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;
        Component cpu = new CPU2(model, clocks, socket, memType);
        cpu.printInfo();

        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if (model.length() == 0 && socket % 2 == 0)
            model = null;
        Component mb = new MainBoard2(model, socket, memType);
        mb.printInfo();
    }
}
