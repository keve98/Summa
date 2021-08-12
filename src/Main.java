public class Main {

    public static void main(String[] args){

        String inputFileName = "input.txt";

        FileManagement fileManagement = new FileManagement();
        Logic logic  = new Logic();

        fileManagement.loadFile("input.txt");

        logic.calculate(fileManagement.baseNum, fileManagement.numbers);


    }

}
