import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the elements of heap : ");
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        int i = 0;
        for( i = 1 ; i <= list.size() ; i++) {
            index.add(i);
        }

        // MinHeap
        MinHeap<Integer> minHeap = new MinHeap<>();
        minHeap.insert(list);

        System.out.println("MinHeap after insertion: " + minHeap.getHeap());
        System.out.println("MinHeap sorted: " + minHeap.heapSort());

        // MaxHeap 

        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.insert(list);

        System.out.println("MaxHeap after insertion: " + maxHeap.getHeap());
        System.out.println("MaxHeap sorted: " + maxHeap.heapSort());


        // keyed heap 

        MinHeap<Integer> keyMinHeap = new MinHeap<>(index , list);
        System.out.println("keyed heap after insertion: " + keyMinHeap.getHeap());
        System.out.println("keyed heap sorted: " + keyMinHeap.heapSort());


        scan.close();
    }
}
