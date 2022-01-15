// Write a program with multiple catch clauses to handle exceptions like ArithmeticException,IOException and ArrayIndexOutofBoundsException.

public class Program05 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            System.out.println(num1 / 0);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutofBoundsException caught");
        }
    }
}
