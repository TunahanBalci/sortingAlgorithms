import java.util.Arrays;
import java.util.Random;

public class Tester {

    private static final int carAmount = 10;
    private static Car [] cars = new Car[carAmount];

    private static String [] brandNames = {"Ford", "Aston Martin", "Bugatti", "Koenigsegg", "Fiat", "Audi", "BMW", "Mercedes",
    "Renault", "Ferrari", "Lamborghini", "Tofaş"}; // brand name pool for testing

    private static String [] modelNames = {"Nebula", "Jesko", "Asimi", "Veyron", "Roadster", "Runner", "Avosa", "Glider", "Crimson",
    "Quantum", "Mirage", "Falcon", "Nova", "Nimbus", "Megan", "Daoma", "Kellen"}; // model name pool for testing


    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < carAmount; i++) {
            Car car = new Car();
            car.setBrand(brandNames[random.nextInt(0, brandNames.length - 1)]); // assign a brand name from pool
            car.setModelName(modelNames[random.nextInt(0, modelNames.length - 1)]); // assign a model name from pool
            car.setModelyear(random.nextInt(1990, 2024)); // assign a random model year
            cars[i] = car;
        }

        QuickSort.sort(cars);
        Utils.printInfo("Testing quicksort via model years (descending order):");
        System.out.println(Arrays.toString(cars)); // test Quicksort with cars

        File_Writer.randomInt("integers.txt", 50);
        int [] initialArray = FileReader.getArray("integers.txt");

        Utils.printInfo("INITIAL ARRAY: " + Arrays.toString(initialArray));
        int [] randomArray = FileReader.shuffleArray(initialArray);
        Utils.printInfo("RANDOM ARRAY: " + Arrays.toString(randomArray));

        //-------------- INSERTION SORT

        Utils.printInfo("Testing insertion sort (descending): ");
        System.out.println("BEFORE: \n" + Arrays.toString(randomArray));
        int [] temp_insertionSort_INT = randomArray.clone();
        float [] temp_insertionSort = toFloat(temp_insertionSort_INT);

        InsertionSort.sort(temp_insertionSort);
        System.out.println("AFTER: \n" + Arrays.toString(temp_insertionSort));

        //-------------- MERGE SORT

        Utils.printInfo("Testing merge sort (descending): ");
        System.out.println("BEFORE: \n" + Arrays.toString(randomArray));
        int [] temp_mergeSort = randomArray.clone();

        MergeSort.sort(temp_mergeSort);
        System.out.println("AFTER: \n" + Arrays.toString(temp_mergeSort));

    }


    public static float [] toFloat(int [] array){
        float [] result = new float[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
