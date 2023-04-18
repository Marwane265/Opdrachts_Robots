package be.intecbrussel;

public class Robot {

    private String unitName;




    public String getUnitName() {
        return unitName;
    }


    // 2 constructors

    public Robot() {
        this("nameless Robot");
    }

    public Robot(String unitName) {

        this.unitName = unitName;
    }
    public void boot() {
        System.out.println("Robot is aan het opstarten");

        System.out.println(unitName);
    }


    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
