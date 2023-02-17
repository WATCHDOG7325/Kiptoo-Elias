package CalculateG;

public class CalculateG {
    public static double multiply(double a, double z){
        //method for multiplication
        return a * z;

    }
    public static double addition(double a, double z){
        // add 2 more methods for powering to square and addition (similar to multiplication)
        return a + z;
    }

    public static double squre(double a){
        // add 2 more methods for powering to square and addition (similar to multiplication)
        return Math.pow(a,2);
    }
    public static void outline(String message, double result){
        
        // method for printing out a result
        System.out.println(message + result);
    }

    public static void main(String[] args){
        // compute the position and velocity of an object with defined methods and print out the result
        double gravity =-9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;

// Add the formulas for position and velocity

// Add output line for velocity (similar to position)

        double finalPosition = addition(multiply(0.5, gravity), multiply(squre(fallingTime),gravity));
        finalPosition = addition(multiply(initialVelocity, fallingTime),addition(initialPosition, finalPosition));
        String positionMessage = "The object's postion after" + fallingTime + "second is";
        outline(positionMessage, finalPosition);

        double finalVelocity = multiply(gravity, fallingTime) + initialVelocity;
        String velocityMessage = "The object's velocity after" + fallingTime + "second is";
        outline(velocityMessage, finalVelocity);

    }
}