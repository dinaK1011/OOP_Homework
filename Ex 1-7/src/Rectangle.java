public class Rectangle {
    int height;
    int width;

    public Rectangle(){}

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return width * height;
    }
}