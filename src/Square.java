public class Square extends Shape{
    @Override
    public double getPerimeter(int length) {
        return length * length;
    }

    @Override
    public double getCircumference(int length) {
        return length*4;
    }
}
