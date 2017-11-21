package pojo;

import java.util.List;

public class Board {

    List<Rectangle> rectangles;

    public Board(List<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public List<Rectangle> getRectangles() {
        return rectangles;
    }
}
