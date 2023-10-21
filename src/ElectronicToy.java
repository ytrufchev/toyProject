public abstract class ElectronicToy extends Toy implements Powerable{

    public ElectronicToy(String name, String baseColor, int funRate) {
        super(name, baseColor, funRate);
    }
    public ElectronicToy() {
        super();
    }

    @Override
    public abstract void play(int minutes);

    @Override
    public abstract void turnOn();

    @Override
    public abstract void turnOff();

}
