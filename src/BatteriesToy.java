public class BatteriesToy extends ElectronicToy{
    private int batteriesCount;

    public int getBatteriesCount() {
        return batteriesCount;
    }

    public void setBatteriesCount(int batteriesCount) {
        this.batteriesCount = batteriesCount;
    }

    public BatteriesToy(String name, String baseColor, int funRate, int batteriesCount) {
        super(name, baseColor, funRate);
        setBatteriesCount(batteriesCount);
    }
    public BatteriesToy() {
        super();
        setBatteriesCount(4);
    }

    @Override
    public void play(int minutes) {
        System.out.println("The child pleasure level from " + super.name + " reached " + ((minutes / 60)*funRate));
    }

    @Override
    public void turnOn() {
        System.out.println("The battery powered toy " + super.name + " is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The battery powered toy " + super.name + " is turned off");
    }

    @Override
    public String toString() {
        return "BatteriesToy{" +
                "batteriesCount=" + batteriesCount +
                ", name='" + name + '\'' +
                ", baseColor='" + baseColor + '\'' +
                ", funRate=" + funRate +
                '}';
    }
}
