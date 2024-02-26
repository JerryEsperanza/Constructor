public class AreaCalculator{
    
    // area for a rectangle
    public Double computeArea(Double side1, Double side2){

        Double rectangle = 0.0;
        rectangle = side1 * side2;
        return rectangle;

    }

    //overload computeArea for square
    public Double computeArea(Double side){
        return side*side;

    }

    //overlaod computeArea for circle
    public Double computeArea(String circle, Double radius){
        if (circle.equals("circle"))
            return 3.1416 * radius;
        else 
            return 0.0;
    }

}