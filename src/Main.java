public class Main {

    public static void main(String[] args){

        String inputFileName = "input.txt";
        String outputFileName = "output.txt";


        FileManagement fileManagement = new FileManagement();
        Logic logic  = new Logic();

        fileManagement.loadFile(inputFileName);

        logic.calculate(0, fileManagement.baseNum, fileManagement.numbers, "");
        fileManagement.writeToFile(outputFileName, logic.result);
        System.out.println("\nResult: " + logic.result);


    }

}
