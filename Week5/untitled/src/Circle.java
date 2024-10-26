public class Circle {
    private final static double PI=3.141519;
    private int radius;

    int getRadius(){
        return radius;
    }

    public Circle(int radius){
        this.radius=radius;

    }
    double computeArea(int radius){
        return PI*Math.pow(radius,2);
    }


}
