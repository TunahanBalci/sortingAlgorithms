import java.io.Writer;
import java.util.ArrayList;

public class LibraryTester {

    public static final boolean debugMode = false;
    private static final int sortCount = 100;
    private static final int arraySize = 10000;

    private static final ArrayList<int[]> arrays_ascending = new ArrayList<>();
    private static final ArrayList<int[]> arrays_descending = new ArrayList<>();
    private static final ArrayList<int[]> arrays_random = new ArrayList<>();

    public static void main(String[] args) {

        CreateData createData = new CreateData();

        createData.createFile("ascending", arraySize);
        createData.createFile("descending", arraySize);
        createData.createFile("random", arraySize);


        int[] array_descending = FileReader.loadArray("data_descending_" + arraySize + ".txt");
        int[] array_ascending = FileReader.loadArray("data_ascending_" + arraySize + ".txt");
        int[] array_random = FileReader.loadArray("data_random_" + arraySize + ".txt");

        for (int i = 0; i < sortCount * 5; i++) {
            int[] temp_asc = array_ascending.clone();
            arrays_ascending.add(temp_asc);

            int[] temp_desc = array_descending.clone();
            arrays_descending.add(temp_desc);

            int[] temp_rand = array_random.clone();
            arrays_random.add(temp_rand);
        }

        useSort(1, "a");
        useSort(1, "d");
        useSort(1, "r");

        useSort(2, "a");
        useSort(2, "d");
        useSort(2, "r");

        useSort(3, "a");
        useSort(3, "d");
        useSort(3, "r");

        useSort(4, "a");
        useSort(4, "d");
        useSort(4, "r");

        useSort(5, "a");
        useSort(5, "d");
        useSort(5, "r");


    }

    public static void useSort(int sortType, String order) {

        long time = 0;


        if (sortType == 1) {

            if (order.equals("a")){
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_ascending.remove(arrays_ascending.size() - 1);
                    SortingAlgorithms.sort1(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("d")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_descending.remove(arrays_descending.size() - 1);
                    SortingAlgorithms.sort1(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("r")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_random.remove(arrays_random.size() - 1);
                    SortingAlgorithms.sort1(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            }

        } else if (sortType == 2) {

            if (order.equals("a")){
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_ascending.remove(arrays_ascending.size() - 1);
                    SortingAlgorithms.sort2(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("d")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_descending.remove(arrays_descending.size() - 1);
                    SortingAlgorithms.sort2(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("r")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_random.remove(arrays_random.size() - 1);
                    SortingAlgorithms.sort2(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            }
        } else if (sortType == 3) {

            if (order.equals("a")){
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_ascending.remove(arrays_ascending.size() - 1);
                    SortingAlgorithms.sort3(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("d")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_descending.remove(arrays_descending.size() - 1);
                    SortingAlgorithms.sort3(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("r")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_random.remove(arrays_random.size() - 1);
                    SortingAlgorithms.sort3(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            }
        } else if (sortType == 4) {

            if (order.equals("a")){
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_ascending.remove(arrays_ascending.size() - 1);
                    SortingAlgorithms.sort4(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("d")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_descending.remove(arrays_descending.size() - 1);
                    SortingAlgorithms.sort4(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("r")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_random.remove(arrays_random.size() - 1);
                    SortingAlgorithms.sort4(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            }
        } else if (sortType == 5) {

            if (order.equals("a")){
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_ascending.remove(arrays_ascending.size() - 1);
                    SortingAlgorithms.sort5(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("d")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_descending.remove(arrays_descending.size() - 1);
                    SortingAlgorithms.sort5(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            } else if (order.equals("r")) {
                long before = System.currentTimeMillis();
                for (int i = 0; i < sortCount; i++) {
                    int[] temp = arrays_random.remove(arrays_random.size() - 1);
                    SortingAlgorithms.sort5(temp, temp.length);
                }
                long after = System.currentTimeMillis();
                time = after - before;
            }
        } else {
            Utils.printError("Invalid sort type: " + sortType);
        }

        if (sortType > 0 && sortType <= 5) {
            Utils.printInfo("Elapsed time for " + sortCount + " sorts of " + "sort" + sortType + " (order " + order + ", array size " + arraySize + "): " + time + "ms" + ", Average Time: " + (double) time / sortCount + "ms");
            File_Writer.recordResults(sortType + "_" + sortCount + "x", "Order: " + order + ", Total elapsed time: " + time + "ms, Average Time" + (double) time / sortCount + "ms");
        } else {
            Utils.printError("Invalid sort type: " + sortType);
        }

    }
}
