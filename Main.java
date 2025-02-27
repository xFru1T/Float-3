import java.util.Scanner;
import java.math.MathContext;
class Float {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print radius for the area of the circle: ");
        float radius = scanner.nextFloat();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle: " + area);
        }
    }

