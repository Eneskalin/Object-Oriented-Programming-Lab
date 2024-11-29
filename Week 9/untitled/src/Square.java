public class Square extends Shape2D {

    public Square(double width){
        super(width);
    }

    public double getArea(){
        return width*width;
    }
    public String toString(){
        return "Circle with width" + width +" has area" + getArea();
    }

}
