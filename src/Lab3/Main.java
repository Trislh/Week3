package Lab3;

public class Main {
    public static void main(String[] args) {
        LinearEquation LE = new LinearEquation(1,2,0,0,5,6);
        if (LE.getA()*LE.getD() - LE.getB()*LE.getC() == 0) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("X = " + LE.getX() + "\n" +
                                "Y = " + LE.getY());
        }
    }
}
