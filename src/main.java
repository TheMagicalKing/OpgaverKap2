import java.util.Scanner;
import java.lang.Math;

public class main {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        //Opgave 2.1

        System.out.println("Hello");
        double a;
        double b = 1.6;
        System.out.println("How many miles have you been driving?");
        double c = input.nextDouble();
        a = c*b;
        System.out.println("This is how many kilometers you've driven " + a);

        //Opgave 2.2

        System.out.println("What is the length of your triangle's sides in centimeters? ");
        double sideLength = input.nextDouble();
        double area = (Math.sqrt(3))/4*(Math.pow(sideLength,2));
        System.out.println("What is the prism's length of your triangle? ");
        double triPrism = input.nextDouble();
        double sqrCenti = area*triPrism;
        System.out.println("The volume of your triangle is " + sqrCenti + " square centimeters. and the area is " + area);

        //Opgave 2.12

        double takeOff;
        double planeAccel;
        System.out.println("What is your planes takeoff speed? ");
        takeOff = input.nextDouble();
        System.out.println("What is your planes acceleration? ");
        planeAccel = input.nextDouble();
        double length = (Math.pow(takeOff, 2)/(2*planeAccel));
        System.out.println("You need at least " + length + " meters of runway.");

        //Opgave 2.17

        double outTemp;
        double windSpeed;
        double windSpeedTemp;

        System.out.println("What is the temperature outside? ");
        outTemp = input.nextDouble();
        System.out.println("What is the wind speed? ");
        windSpeed = input.nextDouble();
        double twc = 35.74+(0.6215*outTemp)-(35.75*Math.pow(windSpeed,0.16))+(0.4275*outTemp*Math.pow(windSpeed, 0.165));
        System.out.println(twc);

        //Opgave 2.23
        double driveDist, milesPerGal, pricePerGal, driveCost;

        System.out.println("How far have you driven?");
        driveDist = input.nextDouble();
        System.out.println("How many miles per gallon can your car go?");
        milesPerGal = input.nextDouble();
        System.out.println("What is the price per gallon at your gas station?");
        pricePerGal = input.nextDouble();
        driveCost=driveDist/milesPerGal*pricePerGal;
        System.out.println("Thank you! the cost of driving your car is $" + driveCost);
    }

}
