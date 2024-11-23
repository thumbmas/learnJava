class GravityCalculator {
    public static void main (String[] arguments){
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        
        finalPosition = 0.5 * gravity*fallingTime*fallingTime + 
                initialVelocity*fallingTime + initialPosition;
        
        System.out.println("The objects position after falling  " + fallingTime + 
                " seconds is " + finalPosition + "m");   
    }
}