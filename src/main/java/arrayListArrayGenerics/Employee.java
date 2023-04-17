package arrayListArrayGenerics;

public class Employee<T, K> {

    private String name;
    private T salary;
    private K address;

    public Employee(String name, T salary, K address){
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSalary(T Salary){
        this.salary = salary;
    }

    public T getSalary(){
        return salary;
    }

    public void setAddress(K address){
        this.address = address;
    }
    public K getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

//    public String toString(){
//        return name + " " + salary + " " + address;
//    }
}
