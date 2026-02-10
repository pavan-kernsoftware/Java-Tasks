package feb_9;

public class Rectangle {
    int length;
    int width;
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    int calculateArea() {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}
 