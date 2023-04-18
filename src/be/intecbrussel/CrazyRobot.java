package be.intecbrussel;

public class CrazyRobot extends Robot {


    public CrazyRobot() {
        super.getUnitName();
    }


    public void boot() {
        super.boot();
        String str = "crazyrobot";
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);
        sb.reverse();
        System.out.println(sb);

    }


}
