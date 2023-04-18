package be.intecbrussel;

public class RobotApp {
    public static void main(String[] args) {
        CrazyRobot crazyRobot = new CrazyRobot();

        crazyRobot.boot();



        LiftingRobot robot = new LiftingRobot(500, "Lift");

        robot.lift(200);
        BendingRobot br = new BendingRobot(300, "brrrrrr");


        br.bend(500);

    }
}
