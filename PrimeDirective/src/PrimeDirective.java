// Build a program that creates an ArrayList of all prime numbers in an array

// Challenge Time 1: Build a method that filters an array for odd and even numbers
// Challenge Time 2: Build a method that returns an ArrayList of the first n primes in an array
// Challenge Time 3: Build a method that returns an ArrayList of the first n Fibonacci numbers

import java.util.ArrayList;

public class PrimeDirective {

    public boolean isPrime(int number) {
        boolean isPrimeNumber = number >= 2;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }

        }

        return primes;
    }

    public ArrayList<Integer> onlyPrimesMaxed(int[] numbers, int length) {
        // Challenge Time 2: Build a method that returns an ArrayList of the first n primes in an array

        ArrayList<Integer> primesMaxed = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number) && primesMaxed.size() < length) {
                primesMaxed.add(number);
            }
        }

        return primesMaxed;
    }

    public ArrayList<Integer> fibonacci(int length) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(1);
        fibonacciList.add(1);

        if (length < 2) {
            System.out.println("List must be 2 or more numbers");
        }
        else {

            while (fibonacciList.size() < length - 2) {
                int newNumber = fibonacciList.get(fibonacciList.size() -1) + fibonacciList.get(fibonacciList.size()-2);
                fibonacciList.add(newNumber);
            }
        }

        return fibonacciList;
    }

    public ArrayList<Integer> evenOrOdd(int[] numbers, boolean isEven) {
        // Challenge Time 1: Build a method that filters an array for odd and even numbers
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        if (isEven){
            for (int number : numbers) {
                if (number % 2 == 0) {
                    listOfNumbers.add(number);
                }
            }
        }
        else {
            for (int number : numbers) {
                if (number % 2 != 0) {
                    listOfNumbers.add(number);
                }
            }
        }

        return listOfNumbers;
    }

    public ArrayList<ArrayList<Integer>> evenAndOdd(int[] numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
            else {
                oddNumbers.add(number);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(evenNumbers);
        result.add(oddNumbers);

        return result;
    }

        public static void main (String[]args){
            PrimeDirective pd = new PrimeDirective();

            int[] listOfNumbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

            System.out.println("Filter only prime numbers:");
            System.out.println(pd.onlyPrimes(listOfNumbers));
            System.out.println("Filter only prime numbers, limit 3");
            System.out.println(pd.onlyPrimesMaxed(listOfNumbers, 3));
            System.out.println("Filter out the even numbers");
            System.out.println(pd.evenOrOdd(listOfNumbers, true));
            System.out.println("Filter out the odd numbers");
            System.out.println(pd.evenOrOdd(listOfNumbers, false));
            System.out.println("Filter out the even AND the odd numbers");
            System.out.println(pd.evenAndOdd(listOfNumbers));
            System.out.println("Return an Arraylist with the first 15 Fibonacci numbers");
            System.out.println(pd.fibonacci(15));




        }

}
