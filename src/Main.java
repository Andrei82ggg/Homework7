public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " ");
        }
        System.out.println();
        double[] two = {1.57, 7.654, 9.986};
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i] + " ");
        }
        System.out.println();
        int[] three = {1, 5, 89, 12, 25, 34};
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i] + " ");
        }
        System.out.println();
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
