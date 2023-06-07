import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
	private List<Integer> heap;
	private int childCount;

	public PowerOfTwoMaxHeap(int childCount) {
		this.heap = new ArrayList<>();
		this.childCount = childCount;
	}

	public void insert(int value) {
		heap.add(value);
		bubbleUp(heap.size() - 1);
	}

	public int popMax() {
		if (heap.isEmpty()) {
		    throw new IllegalStateException("Heap is empty");
		}

		int max = heap.get(0);
		int lastIdx = heap.size() - 1;
		heap.set(0, heap.get(lastIdx));
		heap.remove(lastIdx);

		bubbleDown(0);
		return max;
	}
	
	private void bubbleUp(int index) {
	       int parentIndex = (index - 1) / childCount;

		while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
			swap(index, parentIndex);
			index = parentIndex;
			parentIndex = (index - 1) / childCount; 
	      }
	}
	
	private void bubbleDown(int index) {
		int maxChildIndex = getMaxChildIndex(index);

		while (maxChildIndex != -1 && heap.get(index) < heap.get(maxChildIndex)) {
	             swap(index, maxChildIndex);
		     index = maxChildIndex;
		     maxChildIndex = getMaxChildIndex(index);
		}
	}
	private int getMaxChildIndex(int index) {
		int startChildIndex = index * childCount + 1;
		int endChildIndex = Math.min(startChildIndex + childCount, heap.size());
		if (startChildIndex >= heap.size()) {
			return -1;
		}
		
		int maxChildIndex = startChildIndex;
		for (int i = startChildIndex + 1;i < endChildIndex; i++) {
			if (heap.get(i) > heap.get(maxChildIndex)) {
				maxChildIndex = i;
			}
		}
		
		return maxChildIndex;
	}

	private void swap(int i, int j) {
		    int temp = heap.get(i);
		    heap.set(i, heap.get(j));
		    heap.set(j, temp);
		}
	}
