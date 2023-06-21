package objects;

public class Rectangle {

    private double length;
    private double width;
    private int sides = 4;

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    public void setWidth(double i) {
        width = i;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
