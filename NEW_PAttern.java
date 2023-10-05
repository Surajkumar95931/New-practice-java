public class NEW_PAttern {
    public static void main(String[] args) {
        int n = 5;
//        square_pattern(4, 4);
        displayUpperPart(n);
    }
    public static void square_pattern(int row, int col) {
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 0 || i == row || j == 0 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void leftangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAngle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void displayUpperPart(int size) {

        // Declaring variables for rows and columns
        // respectively
        int i, j;

        // Outer loop for rows
        for (i = size - 1; i >= 0; i--) {

            // Inner loop 1
            // to print triangle 1
            for (j = 0; j < i; j++) {

                // Printing whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            // to print triangle 2
            for (j = i; j <= size - 1; j++) {

                // Printing star with whitespace
                System.out.print("* "
                );
            }

            // By now done with one row so next line
            System.out.println();
        }


//ineeeeeeeeeeeeer parttttttttttttttttttttt
        for (i = 0; i <= size; i++) {

            // Inner loop 1
            // to print triangle 1
            for (j = 0; j < i; j++) {

                // Printing whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            // to print triangle 2
            for (j = i; j <= size - 1; j++) {

                // Printing star with whitespace
                System.out.print("* "
                );
            }

            // By now done with one row so next line
            System.out.println();
        }

    }
}



