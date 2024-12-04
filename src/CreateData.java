import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class CreateData {

    public void createFile(String order, int size) {

        int [] array = new int[size];

        switch (order){
            case "ascending":
                for (int i = 0; i < array.length; i++) {
                    array[i] = i;
                }
                break;
            case "descending":
                for (int i = 0; i < array.length; i++) {
                    array[i] = array.length - i - 1;
                }
                break;
            case "random":
                for (int i = 0; i < array.length; i++) {
                    array[i] = i;
                }
                array = randomArray(array);
                break;
        }




        String path = "data" + "_" + order + "_" + String.valueOf(size) + ".txt";
        File dataFile = new File(path);
        if (!dataFile.exists()) {
            try {
                dataFile.createNewFile();
            } catch (Exception e) {
                System.out.println("ERROR: Could not create file at path " + path);
                e.printStackTrace();
            }
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(dataFile);
        } catch (Exception e){
            System.out.println("ERROR: Could not create FileWriter at path " + path);
            e.printStackTrace();
        }

        try {
            fileWriter.write(size + "\n");
        } catch (Exception e){
            System.out.println("ERROR: Could not write to file --first line");
            e.printStackTrace();
        }

        for (int i = 0; i < array.length; i++){
            try {
                fileWriter.write(array[i] + "\n");
            } catch (Exception e){
                System.out.println("ERROR: Could not write to file data.txt --data");
                e.printStackTrace();
            }
        }

        try {
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("ERROR: Could not close FileWriter at path data.txt");
            e.printStackTrace();
        }

        System.out.println("Created data file with " + size + " elements in " + order + " order");
    }

    public int [] randomArray(int[] array){

        Random random = new Random();

        int [] output = new int[array.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            list.add(array[i]);
        }

        if (LibraryTester.debugMode){ // FOR DEBUGGING
            System.out.println("Random Array:");
            System.out.println(list.toString());
        }

        for (int i = 0; i < array.length; i++){

            try{

                int session = list.remove(random.nextInt(0, list.size()));
                if (LibraryTester.debugMode) System.out.println("Number: " + session); // FOR DEBUGGING
                output[i] = session;
            } catch (Exception e){
                System.out.println("ERROR: Could not generate random order array");
                e.printStackTrace();
            }
        }
        return output;
    }

}

