public abstract class Shape2D {
    static final double PI = 3.14;
    double height;
    double radius;
    double width;

    public Shape2D(double height , double width ){
        this.height=height;
        this.width=width;

    }
    public Shape2D(double radius ){
        this.radius=radius;
    }

    abstract double getArea();
    @Override
    abstract public String toString();


}
