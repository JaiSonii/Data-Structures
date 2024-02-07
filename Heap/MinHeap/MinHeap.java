package Heap.MinHeap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    // WRITE THE INSERT METHOD HERE //
    // //
    // //
    // //
    // //
    //////////////////////////////////

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void sinkDown(int index) {
        int minIndex = index;

        int leftIndex = leftChild(index);
        int rightIndex = rightChild(index);

        if (heap.get(leftIndex) < heap.get(minIndex) && leftIndex < heap.size() - 1)
            minIndex = leftIndex;

        if (heap.get(rightIndex) < heap.get(minIndex) && rightIndex < heap.size() - 1) {
            minIndex = rightIndex;
        }

        if (minIndex != index) {
            swap(index, minIndex);
            index = minIndex;

        } else {
            return;
        }
    }

    public Integer remove() {
        if (heap.size() == 0)
            return null;
        if (heap.size() == 1)
            return heap.remove(0);
        int minValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return minValue;
    }

}
