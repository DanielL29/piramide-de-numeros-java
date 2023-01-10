public class App {
    public static void main(String[] args) throws Exception {
        insertNumberPyramid();
    }

    public static void insertNumberPyramid() {
        String rangeNumber = System.console().readLine("Insira um número maior que 0 para ver a piramide: ");
        int number = Integer.parseInt(rangeNumber);

        verifyPositiveNumber(number);
    }

    public static void verifyPositiveNumber(int number) {
        if (number <= 0) {
            insertNumberPyramid();
        } else {
            System.out.println("");

            printNumberLines(number);
        }
    }

    public static void printNumberLines(int number) {
        for (int i = 1; i <= number; i++) {
            String line = String.valueOf(i);

            for (int j = 1; j < i; j++) {
                line += String.valueOf(i);
            }

            System.out.println(line);
        }
    }
}
