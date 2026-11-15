/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Ji An Leong
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {

        int twoNumTotal = add(3, 8);
        System.out.println(twoNumTotal);

        int fourNumTotal = add(3, 8, 4, 9);
        System.out.println(fourNumTotal);

        String greetMorning = morningGreeting("Toby Fox");
        System.out.println(greetMorning);

        String greetAfternoon = afternoonGreeting("Mac Miller");
        System.out.println(greetAfternoon);

        String repeatedWord = triple("oohbaby");
        System.out.println(repeatedWord);

        double numberSplit = half(8);
        System.out.println(numberSplit);

        int nearestPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(nearestPositive);

        int nearestNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(nearestNegative);
    }

     // 1. add
    public static int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }



    // 2. add
    public static int add(int firstNum, int secondNum, int thirdNum, int fourthNum) {
        int firstPair = add(firstNum, secondNum);
        int firstTrio = add(firstPair, thirdNum);
        int fullTotal = add(firstTrio, fourthNum);

        return fullTotal;
    }

    // 3. morningGreeting
    public static String morningGreeting(String userName) {
        return "早上好, " + userName + "!";
    }




    // 4. afternoonGreeting
    public static String afternoonGreeting(String userName) {
        return "下午好, " + userName + "!";
    }

    // 5. triple
    public static String triple(String word) {
        return word + word + word;
    }


    // 6. half
    public static double half(int wholeNumber) {
        return wholeNumber / 2.0;
    }


    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double positiveDecimal) {
        return (int) (positiveDecimal + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negativeDecimal) {
        return (int) (negativeDecimal - 0.5);
    }
}