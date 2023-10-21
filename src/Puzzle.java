public class Puzzle extends Toy implements Puzzleable{
    protected int piecesCount;
    protected String picture;

    public int getPiecesCount() {
        return piecesCount;
    }

    public void setPiecesCount(int piecesCount) {
        this.piecesCount = piecesCount;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Puzzle(String name, String baseColor, int funRate, int piecesCount, String picture) {
        super(name, baseColor, funRate);
        setPiecesCount(piecesCount);
        setPicture(picture);
    }

    public Puzzle() {
        super();
        setPicture("Tulip");
        setPiecesCount(1200);
    }

    @Override
    public void play(int minutes) {
        System.out.println("The child pleasure level from the puzzle with " + getPicture() + " reached " + ((minutes / 60)*funRate));
    }

    @Override
    public void arrange() {
        System.out.println("The puzzle with " + getPicture() + " is arranged");
    }

    @Override
    public void shuffle() {
        System.out.println("The puzzle with " + getPicture() + " is shuffled");
    }

    @Override
    public String toString() {
        return "Puzzle{" +
                "picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                ", baseColor='" + baseColor + '\'' +
                ", funRate=" + funRate +
                '}';
    }
}
