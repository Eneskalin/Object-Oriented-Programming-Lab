package Ex1;

public class  Main {
    public static void main(String[] args) {
        Circle Circle1 = new Circle(5);
        Circle Circle3 = new Circle(15);
        Circle Circle2 = new Circle(10);
        Circle[] circles = {Circle1, Circle2, Circle3};


        for (Circle circle : circles){
            System.out.println("Circle radius"+circle.getRadius()+"has area"+ circle.computeArea(circle.getRadius()));
        }
    }
}