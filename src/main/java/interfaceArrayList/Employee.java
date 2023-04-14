package interfaceArrayList;

public abstract class Employee implements Salary {
   private String name;
   private int baseSalary;

   public Employee(String name, int baseSalary){
       this.name = name;
       this.baseSalary = baseSalary;
   }

   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }

   public void setBaseSalary(int baseSalary){
       this.baseSalary = baseSalary;
   }
   public int getBaseSalary(){
       return baseSalary;
   }

   public abstract int getSalary();
}
