public class InsertionSort {
    public static void sort(float[] a) {
        int N = a.length;
        for (int i = N - 2; i >= 0; i--) {
            for (int j = i; j < N - 1 && less(a[j], a[j + 1]); j++)
                exch(a, j, j + 1);
        }
    }

    private static void exch(float[] a, int i, int j) {
        float t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean less(float v, float w) {
        return v < w;
    }

}
