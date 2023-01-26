package JavaDSA.Heap;

public class Heap2 {
    public static void heapify(int[] ar, int index, int n) {
        int largest = index;
        int l = 2 * index, r = (2 * index) + 1;
        if ((l <= n) && ar[l] > ar[largest])
            largest = l;
        if ((r <= n) && ar[r] > ar[largest])
            largest = r;

        if (largest != index) {
            int temp = ar[largest];
            ar[largest] = ar[index];
            ar[index] = temp;
            heapify(ar, largest, n);
        }
    }
    public static void buildHeaf(int[] a, int n){
        for (int i = n/2; i > 0; i--) {
            heapify(a, i, n);
        }
    }
    public static void print(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] ar = { 0, 50, 20, 30, 10, 60, 40 };
        buildHeaf(ar, 6);        
        print(ar);
    }
}
/*
 *       50
 *     /    \
 *    20    30
 *   / \    / \
 *  10 60  40
 */
/*
 *       60
 *     /    \
 *    50    40
 *   / \    / \
 *  10 20  30
 * 
 * 60  50  40  10  20  30
 * 1   2   3   4   5   6
 */