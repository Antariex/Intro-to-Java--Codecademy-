public class Magic {
    public static void main(String[] args) {
        int myNumber = 3;

        // We will refer to myNumber (3) as the original number from now on

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);

        /*
        3 will be printed to the console no matter what integer you choose as the original number!

        Suppose myNumber is x:

( ( ( x² + x ) / x ) + 17 - x ) / 6

= ( ( x + 1 ) + 17 - x ) / 6

= ( x + 18 - x ) / 6

= 18 / 6

= 3
         */
    }
}