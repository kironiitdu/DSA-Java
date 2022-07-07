public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void Insert(int item) {
        items[count++] = item;
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

    }

    public int IndexOf(int item) {
        // Runtime complexity
        // Best Case O(1) if found at the begining
        // Worst case O(n) if found at the end
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int FindMax(int[] array) {
        // Check if the array is empty
        if (array.length == 0)
            return -1;

        // First Consider array[0] means 10 as max
        int isMax = array[0];

        for (int i = 1; i < array.length; i++) {
            // Runtime complexity is O(n) linear of it input size
            // Check if array[0] means 10 is grether than array[i] means next number
            // If array[i] is greter than isMax we need to re assign isMax with latest max
            // value.
            if (array[i] > isMax)
                isMax = array[i]; // assign next max number into isMax
        }
        return isMax;
    }

    public void Print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
