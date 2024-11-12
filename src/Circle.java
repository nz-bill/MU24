public class Circle extends Shape{
    @Override
    public double getPerimeter(int length) {
        return length *length*  Math.PI;
    }

    @Override
    public double getCircumference(int length) {
        return length *2 * Math.PI ;
    }
}
