import java.util.Scanner;

public class EmployeeService {
    public Waiter creatWaiter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong co ban: ");
        double basicSalary = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap thuong: ");
        double compensate = Double.parseDouble(sc.nextLine());

        Waiter waiter = new Waiter(id, name, age, basicSalary, compensate);
        return waiter;
    }

    public Kitchen creatKitchen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong co ban: ");
        double basicSalary = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap phi dich vu: ");
        double serviceCharge = Double.parseDouble(sc.nextLine());

        Kitchen kitchen = new Kitchen(id, name, age, basicSalary, serviceCharge);
        return kitchen;
    }

    public Waiter[] addWaiter(int size) {
        Waiter[] waiter = new Waiter[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap nhan vien thu " + i);
            waiter[i] = creatWaiter();
        }
        return waiter;
    }

    public Kitchen[] addKitchen(int size) {
        Kitchen[] kitchen = new Kitchen[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap nhan vien thu " + i);
            kitchen[i] = creatKitchen();
        }
        return kitchen;
    }

    public void showWaiter(Waiter[] waiters) {
        for (Waiter waiter : waiters) {
            System.out.println(waiter + " Luong nhan vien : " + waiter.calculatorSalary());
        }
    }

    public void showKitchen(Kitchen[] kitchens) {
        for (Kitchen kitchen : kitchens) {
            System.out.println(kitchen + " Luong nhan vien : " + kitchen.calculatorSalary());
        }
    }
}
