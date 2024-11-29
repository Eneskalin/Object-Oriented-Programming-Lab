public class Pyramid extends Shape3D {

    public Pyramid(double height,double width){
        super(height,width);

    }

    @Override
    public double getArea() {
        double baseArea = width * depth;
        // Calculate slant heights
        double slantHeightAlongWidth = Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
        double slantHeightAlongDepth = Math.sqrt(Math.pow(depth / 2, 2) + Math.pow(height, 2));

        // Lateral Surface Area
        double lateralSurfaceArea = (width * slantHeightAlongDepth) + (depth * slantHeightAlongWidth);

        // Total Surface Area
        return baseArea + lateralSurfaceArea;
    }

    @Override
    public double getVolume() {
        double baseArea = width * depth;
        return (1.0 / 3) * baseArea * height;
    }

    @Override
    public String toString() {
        return "Pyramid [Height = " + height + ", Width = " + width + ", Depth = " + depth +
                ", Volume = " + getVolume() + ", Surface Area = " + getArea() + "]";
    }

}
