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

    public void Print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
