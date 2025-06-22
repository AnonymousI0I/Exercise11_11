package assignments.Exercise11_11;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        sort(list);

        System.out.print("The numbers in increasing order: ");
        for (int number : list) {
            System.out.print(number + " ");
        }

        in.close();
    }

    public static void sort(ArrayList<Integer> list) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    swapElements(list, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    public static void swapElements(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
