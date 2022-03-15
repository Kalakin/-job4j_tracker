package oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
    }

    public void pritInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD " + ssd + " GB");
        System.out.println("Модель CPU " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        computer.pritInfo();
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.pritInfo();
        Computer third = new Computer();
        third.pritInfo();
    }
}
