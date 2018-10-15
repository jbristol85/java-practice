package com.joshbristol;

public class Main {

    public static void main(String[] args) {
    double centimeters = calcFeetAndInchesToCentimeters(6, 11);
    calcFeetAndInchesToCentimeters(-10);

    if(centimeters < 0.0){
        System.out.println("invalid parameters");
    }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            System.out.println("invalid feet or inches");
            return -1;
        }else{
            double totalInches = inches + (feet * 12);
            double centimeters = totalInches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
            return(centimeters);
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("invalid inches");
            return -1;
        }else {
            int feetInInches = (int) (inches / 12);
            double remainingInches = inches % 12;
            System.out.println(inches + " inches is equal to "+ feetInInches +"feet and " + remainingInches+" inches");
            return (calcFeetAndInchesToCentimeters(feetInInches, remainingInches));

        }
    }

}
