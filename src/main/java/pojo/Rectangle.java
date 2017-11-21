package pojo;

public class Rectangle {

    int width;
    int height;
    Point start;
    Point end;

    public Rectangle(int width, int height, Point start, Point end) {
        this.width = width;
        this.height = height;
        this.start = start;
        this.end = end;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
