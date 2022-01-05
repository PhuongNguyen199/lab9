public class Waiter extends Employee {
    private double compensate;

    public Waiter(int id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public Waiter(double compensate) {
        this.compensate = compensate;
    }

    public double getCompensate() {
        return compensate;
    }

    public void setCompensate(double compensate) {
        this.compensate = compensate;
    }

    @Override
    public double calculatorSalary() {
        return getBasicSalary() + compensate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Waiter{" +
                "compensate=" + compensate +
                '}';
    }
}
