import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class File_Writer {

    public static void randomInt(String path, int length) {

        Random rand = new Random();

        FileWriter fileWriter = null;
        File file = new File(path);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            fileWriter = new FileWriter(path);
        } catch (Exception e) {
            Utils.printError("Could not write to file in randomInt method. Probably, specified file doesn't exists at path.");
            e.printStackTrace();
        }

        try {
            fileWriter.write(length + "\n");
            System.out.println(length);
        } catch (Exception e) {
            Utils.printError("Could not write the length of array in randomInt method");
            e.printStackTrace();
        }

        for (int i = 0; i < length; i++) {
            try {
                int randomNumber = rand.nextInt(0, 1000);
                fileWriter.write(randomNumber + "\n");
                System.out.println(randomNumber);
            } catch (Exception e) {
                Utils.printError("Error in loop of randomInt method");
                e.printStackTrace();
            }
        }

        try {
            fileWriter.close();
        } catch (Exception e) {
            Utils.printError("Could not close fileWriter");
            e.printStackTrace();
        }
    }

    public static void recordResults(String path, String input) {

        FileWriter fileWriter = null;
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                Utils.printError("Could not create file at path --recordResults");
                e.printStackTrace();
            }
        }
        try {
            fileWriter = new FileWriter(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fileWriter.write(input);
        } catch (Exception e) {
            Utils.printError("Error in recordResults");
            e.printStackTrace();

        }
        try {
            fileWriter.close();
        } catch (Exception e) {
            Utils.printError("Could not close fileWriter");
            e.printStackTrace();
        }
    }


}
