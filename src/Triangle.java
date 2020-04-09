import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Scanner scanner = new Scanner(System.in);

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean notASide(double side) {
        return side <= 0;
    }

    public void checkSide(double side) throws IllegalTriangleException {
        if (notASide(side)) {
            throw new IllegalTriangleException(side);
        }
    }

    boolean needToInputSideAgain = false;
    public void inputSide1() {
        do{
            needToInputSideAgain = false;
            try {
                System.out.print("Input side 1 :");
                setSide1(scanner.nextDouble());
                checkSide(getSide1());

            } catch (IllegalTriangleException ex){
                System.out.print(ex.getMessage());
                needToInputSideAgain = true;
            }
        }while (needToInputSideAgain);
    }

    public void inputSide2() {
        do{
            needToInputSideAgain = false;
            try {
                System.out.print("Input side 2 :");
                setSide2(scanner.nextDouble());
                checkSide(getSide2());

            } catch (IllegalTriangleException ex){
                System.out.print(ex.getMessage());
                needToInputSideAgain = true;
            }
        }while (needToInputSideAgain);
    }

    public void inputSide3() {
        do{
            needToInputSideAgain = false;
            try {
                System.out.print("Input side 3 :");
                setSide3(scanner.nextDouble());
                checkSide(getSide3());
            } catch (IllegalTriangleException ex){
                System.out.print(ex.getMessage());
                needToInputSideAgain = true;
            }
        }while (needToInputSideAgain);
    }

    public void checkATriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 ||
            side1 + side3 <= side2 ||
            side2 + side3 <= side1)
                throw new IllegalTriangleException(side1, side2, side3);
    }

    boolean needToInputTriangleAgain = false;
    public void inputTriangle() {
        do {
            needToInputTriangleAgain = false;
            try {
                inputSide1();
                inputSide2();
                inputSide3();
                checkATriangle(getSide1(), getSide2(), getSide3());
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                needToInputTriangleAgain = true;
            }
        }while (needToInputTriangleAgain);
    }
}
