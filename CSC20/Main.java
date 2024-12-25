public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= a.length; i++)
                a[i]++;

            int ac = 10;

            int b = ac / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Index out of bound ");
        } catch (Exception e) {
            System.out.print("division by zero ");
        }
    }
}