public class MathMagic {
    public static void main(String[] args) {

        int myNumber = 62; // This is the original number
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive - 6;

        // This will always result in the number 12
        System.out.println(stepSix);

        // Challenge time: only using two variables
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber -= 6;

        System.out.println(magicNumber);

        // Testing a formula my husband came up with
        double testNumber = 128946743568377.98;
        boolean husbandMath = (testNumber - 1)*(testNumber + 1) == testNumber * testNumber - 1;

        System.out.println(husbandMath);

    }
}