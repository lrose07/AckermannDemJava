public class Ackermann {
    public static void main(String[] args) {

        boolean stackOverflowFlag = false;

        for (int i = 0; i < 5 && !stackOverflowFlag; i++) {
            for (int j = 0; j < 5 && !stackOverflowFlag; j++) {
                try {
                    System.out.println("ack(" + i + ", " + j + "): " + ack(i, j));
                } catch (StackOverflowError e) {
                    System.out.println("Reached the end of program capabilities.");
                    stackOverflowFlag = true;
                }
            }
        }
    }

    private static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }
}
