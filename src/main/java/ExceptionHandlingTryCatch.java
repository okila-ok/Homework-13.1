public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        System.out.println("Before problem");
        try {
            System.out.println("inside try block before problem");
            Thread.sleep(1000/0);
            System.out.println("inside try block after problem.");
        } catch (ArithmeticException | InterruptedException e) {
            System.out.println("inside catch block. Do not divide by zero");
            System.out.println(e.getMessage());
            throw new RuntimeException("we just threw RuntimeException");
        } finally{
            System.out.println("Inside finally block");
        }
        System.out.println("After problem");
    }
}
