package OOP.Lesson_1.L_Furnitur;

public class Furniture {
    private int Weight;
    private int Height;
    private String Color;

    public int getWeight() {
        return Weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public Furniture(int weight, int height) {
        Weight = weight;
        Height = height;
        Color = "White";
    }

    public int ReturnPerimeter(){

        int p = (this.Height  + this.Height)*2;

        return p;

    }

    public void setColor(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void ReturnColor(){

        System.out.println(this.Color);
    }
}




