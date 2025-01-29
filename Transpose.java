public class Transpose {
        public static void main(String[] args) {
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("Original array:");
            printArray(array);
            int[][] transpose = transposeArray(array);
            System.out.println("Transposed array:");
            printArray(transpose);
        }
        public static int[][] transposeArray(int[][] array) {
            int rows = array.length;
            int cols = array[0].length;
            int[][] transpose = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = array[i][j];
                }
            }
            return transpose;
        }
        public static void printArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
