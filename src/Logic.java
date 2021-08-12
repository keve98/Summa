import java.util.ArrayList;

public class Logic {

    String result = "";
    int calculated = 0;
    ArrayList<Integer> resultArray = new ArrayList<>();
    boolean isFailed = false;

    public void calculate(int basenum, ArrayList<Integer> array){
            for(Integer i = 0; i < array.size(); i++){
                    while(array.get(i) <= basenum - calculated) {
                        calculated += array.get(i);
                        resultArray.add(array.get(i));
                    }

                    if(calculated == basenum){
                        printResult();
                        return;
                    }


                    if((array.get(i) > basenum - calculated) && (i.equals(array.size() - 1))){
                        int numToDelete = resultArray.get(0);
                        calculated -= numToDelete;
                        for (int k = 0; k < array.size(); k++) {
                            if (array.get(k) == numToDelete) {
                                i = k;
                                if(i.equals(array.size() - 1)){
                                    isFailed = true;
                                }
                            }
                        }
                        resultArray.remove(0);
                    }

                if(isFailed){
                    System.out.println("There is no available sum of the given numbers");
                }
            }
    }

    public void printResult(){
        for (Integer k: resultArray) {
            result += k.toString() + "+";
        }

        result = result.substring(0, result.length() - 1);

        System.out.println(result);

    }


}
