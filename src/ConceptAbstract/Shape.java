package ConceptAbstract;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // concrete method (already has implementation)
    public String getColor() {
        return color;
    }

    // abstract method (no body → must be implemented by subclasses)
    public abstract double area();

    public abstract double perimeter();
}
