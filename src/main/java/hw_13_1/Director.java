package hw_13_1;

public final class Director extends BaseManager{
    private static final int COEFFICIENT = 9;
    public Director(int baseSalary, String name, int numberOfSubordinates){
        super(baseSalary, name, numberOfSubordinates);
    }
    public int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * COEFFICIENT));
        } else return getBaseSalary();
    }
}
