import java.util.*;

class MissingElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = arr.length;
        int maxi = arr[sum - 1];
        int[] mis_array = new int[maxi];

        // Mark all the numbers in the array as present
        for (int a = 0; a < sum; a++) {
            mis_array[arr[a] - 1] = 1;
        }

        // Find the missing numbers
        for (int m = 0; m < maxi; m++) {
            if (mis_array[m] == 0) {
                System.out.print((m + 1) + " ");
            }
        }
    }
}
