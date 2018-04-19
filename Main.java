import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static Vector enterVector(){

        return new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());
    }

    public static void main(String[] args){

        while (true) {

            System.out.println("Введите команду");
            String command = in.next();

            if (command.equals("exit")) {
                break;
            }

            System.out.println("Введите координаты вектора");
            Vector vector1 = enterVector();
            System.out.println("v1=" + vector1.toString());

            if (command.equals("len")) {
                double res = vector1.findToLengthOfVector();
                System.out.println("Ответ: " + res);
            }
            else{
                System.out.println("Введите координаты вектора");
                Vector vector2 = enterVector();
                System.out.println("v2=" + vector2.toString());
                if (command.equals("add")) {
                    Vector res = vector1.add(vector2);
                    System.out.println("Ответ: " + res.toString());
                }
                else if (command.equals("sub")) {
                    Vector res = vector1.subtract(vector2);
                    System.out.println("Ответ: " + res.toString());
                }
                else if (command.equals("scal")) {
                    double res = vector1.scalarToMultiply(vector2);
                    System.out.println("Ответ: " + res);
                }
            }
        }

    }
}
