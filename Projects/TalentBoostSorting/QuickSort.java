/**
 * Task: There is a bug in the quick sort implementation bellow. Find it and fix
 * it!
 * <p>
 * Then implement the {@link #partialSort(int[], int, int)} method. By passing
 * an array, offset and limit, it should sort only elements from position
 * 'offset' to position 'offset + limit'. Use the {@link #partition(int[], int,
 * int)} method from the quick sort. The order of the elements outside that
 * range is non deterministic.
 * <p>
 * Hint: Quickselect
 */
public class QuickSort {

    /**
     * Sorts the provided array using the quick sort algorithm.
     *
     * @param array Integer array. Cannot be {@code null};
     */
    public static void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("The provided collection is null.");
        }
        sort(array, 0, array.length - 1);
    }

    /**
     * Provided an integer array, offset and limit, sort only elements from
     * position 'offset' to position 'offset + limit'. If 'offset + limit' is
     * bigger than the size of the array, sort all the array from position
     * 'offset' onwards. The order of the elements outside that range is non
     * deterministic.
     *
     * @param array  Integer array. Cannot be {@code null};
     * @param offset non-negative integer. Value must be between 0 and the length
     *               of the provided array.
     * @param limit  non-negative integer.
     */
    public static void partialSort(int[] array, int offset, int limit) {
        // TODO: implement
        //throw new ExecutionControl.NotImplementedException("Empty array");
    }

    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int p = partition(array, left, right);
            sort(array, left, p - 1);
            sort(array, p + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivotIndex = choosePivot(left, right);

        // we put the pivot at the end
        swap(array, pivotIndex, right);

        int pivotIndexAfterPartition = left;
        for (int i = left; i <= right; i++) {
            if (array[i] < array[pivotIndex]) {
                swap(array, i, pivotIndexAfterPartition);
                pivotIndexAfterPartition++;
            }
        }

        // put the pivot at it's right place
        swap(array, pivotIndexAfterPartition, right);
        return pivotIndexAfterPartition;
    }

    private static int choosePivot(int left, int right) {
        return left + (right - left) / 2;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}