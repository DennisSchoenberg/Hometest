package homework25;

public class Main01 {
    public static void main(String[] args) {
        Human Johaness = new Human();
        Johaness.name = "Johaness";
        Johaness.age = 43;

        Human Eva = new Human();
        Eva.name = "Eva";
        Eva.age = 25;

        Johaness.introduce();
        Eva.introduce();
    }
}
