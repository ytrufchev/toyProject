public class Main {
    public static void main(String[] args) {
        Playable[] playables = new Playable[4];
        playables[0] = new BatteriesToy();
        playables[1] = new Puzzle();
        playables[2] = new BatteriesToy("Talking Smurf", "Blue", 9,6);
        playables[3] = new Puzzle("Paris Puzzle", "white", 3, 500, "Paris");
        for(Playable playable : playables){
            playable.play(180);
        }
        System.out.println("-------------------------------------------");
        Powerable[] powerables = new Powerable[2];
        powerables[0] = new BatteriesToy();
        powerables[1] = new BatteriesToy("Talking Smurf", "Blue", 9,6);
        for(Powerable powerable : powerables){
            powerable.turnOn();
            powerable.turnOff();
        }
        System.out.println("-------------------------------------------");
        Puzzleable[] puzzleables = new Puzzleable[2];
        puzzleables[0] = new Puzzle();
        puzzleables[1] = new Puzzle("Paris Puzzle", "white", 3, 500, "Paris");
        for(Puzzleable puzzleable : puzzleables){
            puzzleable.arrange();
            puzzleable.shuffle();
        }
    }
}