

public class Calculator {
    // This is a calculator that can perform simple arithmetic operations on two integers.
    // Practicing methods

    public Calculator(){
    }

    public int add(int a, int b){ return a + b; }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();

        // Add
        System.out.println(calculatorOne.add(1, 3));

        // Subtract
        System.out.println(calculatorOne.subtract(10, 2));

        // Multiply
        System.out.println(calculatorOne.multiply(8, 2));

        // Divide
        System.out.println(calculatorOne.divide(10, 3));

        // Modulus
        System.out.println(calculatorOne.modulo(15, 4));



    }
}