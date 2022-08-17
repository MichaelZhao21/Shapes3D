public class Main {
    public static void main(String[] args) {
        Cone a = new Cone(5, 5, "ahsb", "blue", new Location(1, 1, 1));
        System.out.println(a.calculateVolume());
        System.out.println(a.calculateSurfaceArea());

    }
}
