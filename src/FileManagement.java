import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FileManagement {

    int baseNum;
    Integer[] numbers;

    public void loadFile(String filename){
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            baseNum = Integer.parseInt(scanner.nextLine());

            fillArray(scanner);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }


    public void fillArray(Scanner scanner){
        String nums = scanner.nextLine();
        String[] splited = nums.split(",");
        numbers = new Integer[splited.length];

        int i = 0;

        for (String s: splited) {
            numbers[i++] = Integer.parseInt(s);
        }
        Arrays.sort(numbers, Collections.reverseOrder());
    }

    public void writeToFile(String filename, String text){
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file: " + filename);
        } catch (IOException e) {
            System.out.println("Could not write in to the file: " + filename);
            e.printStackTrace();
        }
    }



}
