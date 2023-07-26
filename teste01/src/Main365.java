public class Main365 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, nextNum;

        System.out.print("Série de Fibonacci: " + num1 + " " + num2);

        for (int i = 2; i < 10; ++i) {
            nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }

    }
}
