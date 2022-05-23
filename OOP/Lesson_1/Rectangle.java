package OOP.Lesson_1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){
        this.height = 3;
        this.width  = 4;
    }

    public Rectangle (int width, int height){

        this.width  = width;
        this.height = height;

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

