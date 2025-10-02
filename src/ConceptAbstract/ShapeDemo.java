package ConceptAbstract;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle("Blue", 4);
        Shape s2 = new Rectangle("Blue", 3, 5);

        System.out.println(s1.getColor() + " circle area: " + s1.area());
        System.out.println(s2.getColor() + " rectangle area: " + s2.area());

        System.out.println(s1.getColor() + " circle perimeter: " + s1.perimeter());
        System.out.println(s2.getColor() + " rectangle perimeter: " + s2.perimeter());
    }
}
