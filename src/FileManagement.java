import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileManagement {

    int baseNum;
    ArrayList<Integer> numbers = new ArrayList<>();

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

        for (String s: splited) {
            numbers.add(Integer.parseInt(s));
        }

        Collections.sort(numbers, Collections.reverseOrder());
    }


}
