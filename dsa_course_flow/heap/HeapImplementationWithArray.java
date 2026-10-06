package heap;

public class HeapImplementationWithArray {
    static class MinHeap {
        int[] arr;
        int size;
        int capacity;

        MinHeap(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.size = 0;
        }

        int left(int i) { return 2 * i + 1; }
        int right(int i) { return 2 * i + 2; }
        int parent(int i) { return (i - 1) / 2; }

        void insert(int value) {
            if (size == capacity) {
                System.out.println("Heap is full");
                return;
            }

            arr[size] = value;
            int current = size;
            size++;

            while (current > 0 && arr[parent(current)] > arr[current]) {
                int temp = arr[current];
                arr[current] = arr[parent(current)];
                arr[parent(current)] = temp;
                current = parent(current);
            }
        }

        int extractMin() {
            if (size == 0) {
                throw new IllegalStateException("Heap is empty");
            }

            int root = arr[0];
            arr[0] = arr[size - 1];
            size--;
            heapify(0);
            return root;
        }

        void heapify(int index) {
            int smallest = index;
            int left = left(index);
            int right = right(index);

            if (left < size && arr[left] < arr[smallest]) {
                smallest = left;
            }

            if (right < size && arr[right] < arr[smallest]) {
                smallest = right;
            }

            if (smallest != index) {
                int temp = arr[index];
                arr[index] = arr[smallest];
                arr[smallest] = temp;
                heapify(smallest);
            }
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        heap.insert(25);

        System.out.println("Extracted min: " + heap.extractMin());
        System.out.println("Extracted min: " + heap.extractMin());
    }
}
