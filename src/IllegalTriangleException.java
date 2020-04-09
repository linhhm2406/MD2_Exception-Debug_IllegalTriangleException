public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("3 sides of Triangle are :"
                +"\n\tSide 1 = "+side1
                +"\n\tside 2 = "+side2
                +"\n\tside 3 = "+side3
                +"\n***Warning : Invalid Triangle side Number\n");
    }

    public IllegalTriangleException(double side) throws IllegalTriangleException{
        super("Inputted : "+side
                + "\n***Warning : Invalid side number\n");
    }
}
