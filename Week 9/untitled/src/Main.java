//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape2D Circle1=new Circle(2.4);
        Shape2D Square1=new Square(5);
        Shape2D Rectangle1=new Rectangle(8.3,6);

        Shape2D[] arrayShape2D=new Shape2D[]{Circle1,Square1,Rectangle1};

        Shape3D Cone1=new Cone(4.2,4.5);
        Shape3D Cylinder1=new Cylinder(8.6,4);
        Shape3D Pyramid1=new Pyramid(3.1,9);
        Shape3D[] arrayShape3D=new Shape3D[]{Cone1,Cylinder1,Pyramid1};
        for (Shape3D shape:arrayShape3D){
            System.out.println(shape);
        }

        for (Shape2D shape: arrayShape2D){
            System.out.println(shape);
        }
    }
}