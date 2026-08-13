
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        ResultCalculator calculator = new ResultCalculator();

        int twoMarks = calculator.getTotal(first, second);
        int threeMarks = calculator.getTotal(first, second, third);

        System.out.println("Two mark total: " + twoMarks);
        System.out.println("Three mark total: " + threeMarks);
    }
}
