
public class Cylinder extends Shape3D {

    private double radius;
    private double height;
    public String name;
    public String color;
    public Location loc;


    public Cylinder(String name, String color, Location loc, double radius, double height) {
        super(name, color, loc);
        this.radius = radius;
        this.height = height;

    }


    @Override
    public double calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }


    @Override
    public double calculateSurfaceArea() {
        double surfacearea = Math.PI * 2 * radius * height + 2 * Math.PI * radius * radius;
        return surfacearea;
    }

    public Cylinder(String name, String color, Location loc) {
        this.name = name;
        this.color = color;
        this.loc = loc;
    }

    public Cylinder(String name, String color, Location loc, String name1, String color1, Location loc1) {
        super(name, color, loc);
        this.name = name1;
        this.color = color1;
        this.loc = loc1;
    }



}
