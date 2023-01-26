package JavaDSA.Heap;

/*
 * Basics of heap data structure
 * Number of Node 
 * (N)
 * Height of the heap is 
 * (log N)
 * for an (i th) node in the heap
 * its parent is 
 * (|i/2|)
 * it's children are 
 * left child = (i*2)
 * right child = (i*2 + 1)
 * 
 * Leaf nodes start from the index 
 * (N/2)
 */
public class Heap1 {

    public static void add(int[] a, int size, int n) {
        size++;
        a[size] = n;
        int i = size;
        while (i > 1) {
            int parent = i / 2;
            if (a[parent] < a[i]) {
                a[parent] = a[parent] ^ a[i];
                a[i] = a[parent] ^ a[i];
                a[parent] = a[parent] ^ a[i];
                i = parent;
            } else
                return;
        }
    }

    public static void remove(int[] a, int size) {
        a[1] = a[size];
        a[size] = 0;
        size--;
        int i = 1;
        while (i < size) {
            int max = (a[i * 2] > a[(i * 2) + 1]) ? i * 2 : i * 2 + 1;
            if (a[i] < a[max]) {
                a[i] = a[i] ^ a[max];
                a[max] = a[i] ^ a[max];
                a[i] = a[i] ^ a[max];
                i = max;
            }
            else
                return;
        }
    }

    public static void print(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // maximum size of the array
        int MAX = 10;
        int[] arr = new int[MAX];

        // initializing some values
        arr[1] = 10;
        arr[2] = 5;
        arr[3] = 3;
        arr[4] = 2;
        arr[5] = 4;

        // this type of intialization is used generally when the size of the heap is not
        // known
        System.out.println("Adding");
        add(arr, 5, 7);
        print(arr);
        System.out.println("Removing");
        remove(arr, 6);
        print(arr);
        System.out.println("Adding");
        add(arr, 5, 10);
        print(arr);
    }
}
// Final Heap will be:
// 10
// / \
// 5 7
// / \ /
// 2 4 3
// 7
// / \
// 5 3
// / \ /
// 2 4
