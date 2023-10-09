public class FizzBuzz {
    /*
    Build a program that prints a list from 1 to 100
    BUT prints Fizz when the number is dividable by 3
    prints Buzz when the number is dividable by 5
    and prints FizzBuzz when the number is dividable by both 3 and 5.
     */

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
