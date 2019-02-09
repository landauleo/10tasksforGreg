//1.22 Вычислить значения функции y = 7x^2 - 3x + 6 при любом значении x


import java.util.Scanner;

public class Task1a {


        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            double x = s.nextInt();
            double sum = getFunction(x);
            System.out.println("y = " + sum);
        }

        public static double getFunction(double x) {
            return 7*x*x-3*x+6;
        }

}
