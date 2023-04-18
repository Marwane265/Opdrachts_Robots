package be.intecbrussel;

public class LiftingRobot extends Robot {


    private double maxLiftHeight;


    public LiftingRobot(double maxLiftHeight, String unitName) {
        super("another name");
        this.maxLiftHeight = maxLiftHeight;
    }


    public void lift(double height) {

        if (height > maxLiftHeight) {
            System.out.println("niet mogelijk");
        } else {
            System.out.println("Gelukt =>" + height);
        }
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                '}';
    }
}
