

public abstract class Shape3D {
    protected String name;
    protected String color;
    protected Location loc;


    public Shape3D() {
        name = "";
        color = "";
        loc = new Location();
    }

    public Shape3D(String name, String color, Location loc) {
        this.name = name;
        this.color = color;
        this.loc = loc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();


}
