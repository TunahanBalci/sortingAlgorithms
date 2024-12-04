import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class FileReader {
    public static int[] shuffleArray(int[] a) {
        Random random = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            exch(a, i, j);
        }
        return a;
    }

    private static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static int[] getArray(String filePath) {

        File toRead = new File(filePath);
        Scanner reader = null;

        try {
            reader = new Scanner(toRead);
        } catch (Exception e) {
            Utils.printError("Could not read file in getArray method");
            return null;
        }

        if (!reader.hasNextInt()) {
            Utils.printError("File is empty or does not contain a valid integer for array length.");
            return null;
        }

        int arrayLength = reader.nextInt();
        int[] array = new int[arrayLength];

        int index = 0;
        while (reader.hasNextInt()) {
            if (index >= arrayLength) {
                Utils.printError("File contains more integers than specified length.");
                break;
            }
            array[index++] = reader.nextInt();
        }

        if (index < arrayLength) {
            Utils.printError("File contains fewer integers than specified length.");
            return null;
        }

        reader.close();
        return array;
    }


    public static int[] loadArray(String filePath) {

        File toRead = new File(filePath);

        Scanner sc = null;

        try {
            sc = new Scanner(toRead);
        } catch (Exception e) {
            Utils.printError("Could not read file in loadArray method");
            e.printStackTrace();
        }

        int length = sc.nextInt();
        int[] array = new int[length];

        int index = 0;
        while (sc.hasNextInt()) {
            array[index] = sc.nextInt();
            index++;
        }

        return array;
    }

}