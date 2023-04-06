package hw_13_1;

public class EmployeeUtils {

//    поиск сотрудника в массиве по его имени
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
//    подсчет зарплатного бюджета для всех сотрудников в массиве
//    поиск наименьшей зарплаты в массиве
//    поиск наибольшей зарплаты в массиве
//    поиск наименьшего количества подчиненных в массиве менеджеров
//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int findByName(String name, Employee [] arr){
        for(int i = 0; i < arr.length; i++){
            if(name.equals(arr[i].getName())){
                return i;
            }
        }

        return -1;
    }

    public int findBySubName(String subName, Employee [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().contains(subName)){
                return i;
            }
        }

        return -1;
    }

    public int salarySum(Worker [] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += arr[i].getSalary();
            }
        return result;
        }

    public int findMaxSalary(Worker [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i].getSalary()){
                max = arr[i].getSalary();
            }
        }
        return max;
    }

    // my code for minSalary, minNumberOfEmployees, maxNumberOfEmployees, maxIncrement, minIncrement
    public static int findMinSalary(Manager[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getSalary()) {
                min = arr[i].getSalary();
            }
        }
        return min;
    }

    public static int findMinNumberOfSubordinates(Director[] arr){
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (minNum > arr[i].getNumberOfSubordinates()){
                minNum = arr[i].getNumberOfSubordinates();
            }
        }
        return minNum;
    }

    public static int findMaxNumberOfSubordinates(Manager[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i].getNumberOfSubordinates()) {
                maxNum = arr[i].getNumberOfSubordinates();
            }
        }
        return maxNum;
    }

    public static int findMaxIncrement(Manager[] arr) {
        int maxInc = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (maxInc < arr[i].getSalary() - arr[i].getBaseSalary()){
                maxInc = arr[i].getSalary() - arr[i].getBaseSalary();
            }
        }
        return maxInc;
    }

    public static int findMinIncrement(Manager[] arr) {
        int minInc = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (minInc > arr[i].getSalary() - arr[i].getBaseSalary()){
                minInc = arr[i].getSalary() - arr[i].getBaseSalary();
            }
        }
        return minInc;
    }

    public static int findSumOfSalaries(Employee[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i].getSalary();
        }
        return sum;
    }
}

