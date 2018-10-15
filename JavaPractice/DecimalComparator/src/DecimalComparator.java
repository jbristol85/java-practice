public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        double num1Thousand = num1 * 1000;
        double num2Thousand = num2 * 1000;

        int num1ToInt = (int) num1Thousand;
        int num2ToInt = (int) num2Thousand;

        return num1ToInt == num2ToInt;
    }
}
