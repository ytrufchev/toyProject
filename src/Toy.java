public abstract class Toy implements Playable{
    protected String name;
    protected String baseColor;
    protected int funRate;

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseColor(String baseColor) {
        this.baseColor = baseColor;
    }

    public void setFunRate(int funRate) {
        this.funRate = funRate;
    }

    public Toy(String name, String baseColor, int funRate) {
        setName(name);
        setBaseColor(baseColor);
        setFunRate(funRate);
    }
    public Toy() {
        setName("Elmo");
        setBaseColor("red");
        setFunRate(10);
    }

    @Override
    public abstract void play(int minutes);
}
