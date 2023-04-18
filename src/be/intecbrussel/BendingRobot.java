package be.intecbrussel;

public class BendingRobot extends Robot {

    private double maxBendAngle;





//constructor

    public BendingRobot(double maxBendAngle, String unitName) {
        super.getUnitName();
        this.maxBendAngle = maxBendAngle;

    }


    public void bend(double angle) {

        if (maxBendAngle> angle || 360 == 0){
            System.out.println("Niet mogelijk");
        }else {
            System.out.println("Buigen is gelukt");
        }
    }


    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}
