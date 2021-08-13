public class Main {

    public static void main(String[] args){

        String inputFileName = "input.txt";

        FileManagement fileManagement = new FileManagement();
        Logic logic  = new Logic();

        fileManagement.loadFile(inputFileName);

        logic.calculate(0, fileManagement.baseNum, fileManagement.numbers, "");
        System.out.println(logic.result);


    }

}
