public class Cone extends Shape3D{

    public Cone(double height,double radius){
        super(height,radius);
    }
    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        double baseArea = PI * radius * radius;
        double lateralSurfaceArea = PI * radius * slantHeight;
        return baseArea + lateralSurfaceArea;
    }
    @Override
    public double getVolume() {
        return (1.0 / 3) * PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone [Height = " + height + ", Radius = " + radius +
                ", Volume = " + getVolume() + ", Surface Area = " + getArea() + "]";
    }
}
