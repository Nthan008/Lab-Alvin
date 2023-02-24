public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {
        width = 10;
        height = 5;
    }

    @Override
    void getArea() {
        System.out.println("The area for the shape is " + width * height);
    }
}

