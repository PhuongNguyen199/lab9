public class Main {
    public static void main(String[] args) {
        EmployeeService empser = new EmployeeService();
        Waiter[] waiters = empser.addWaiter(2);
        Kitchen[] kitchens = empser.addKitchen(2);

        empser.showWaiter(waiters);
        empser.showKitchen(kitchens);
    }
}
