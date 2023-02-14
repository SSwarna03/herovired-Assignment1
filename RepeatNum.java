import java.util.Scanner;
import java.util.HashMap;

class RepeatNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int a = 0; a < N; a++) {
            arr[a] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int repeat = 0;
        for (int a = 0; a < N; a++) {
            hm.put(arr[a], a);
        }
        // for (Map.Entry u : hm.entrySet()) {
        System.out.print(hm.keySet() + " ");
        // }
    }
}
