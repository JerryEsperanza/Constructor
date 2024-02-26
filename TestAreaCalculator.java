public class TestAreaCalculator{
    public static void main(String[] args){
        AreaCalculator square = new AreaCalculator();
    
        System.out.println("Area is " + square.computeArea(12.0) );

        System.out.println();

        AreaCalculator rectangle = new AreaCalculator();
        System.out.println("Area is " + rectangle.computeArea(12.0, 10.0) );

        System.out.println();
        AreaCalculator circle = new AreaCalculator();
        System.out.println("Area is " + circle.computeArea("circle", 10.0) );


    }
}