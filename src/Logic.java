import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Logic {

    String result = "";
    int calculated = 0;
    ArrayList<Integer> resultArray = new ArrayList<>();
    Map<Integer, ArrayList<Integer>> resultMap= new HashMap<>();
    boolean isFailed = false;


    public void calculate(int basenum, ArrayList<Integer> array) {
        for (Integer j = 0; j < array.size(); j++) {
            for (Integer i = j; i < array.size(); i++) {
                while (array.get(i) <= basenum - calculated) {
                    calculated += array.get(i);
                    resultArray.add(array.get(i));
                }

                if (calculated == basenum) {
                    resultMap.put(resultArray.size(), resultArray);
                    resultArray = new ArrayList<>();
                    calculated = 0;
                } else {
                    if ((array.get(i) > basenum - calculated) && (i.equals(array.size() - 1))) {
                        int numToDelete = array.get(i-1);
                        calculated -= numToDelete;
                        for (int k = 0; k < array.size(); k++) {
                            if (array.get(k) == numToDelete) {
                                i = k;
                                if (i.equals(array.size() - 1)) {
                                    isFailed = true;
                                }
                            }
                        }
                        resultArray.remove(0);
                    }

                    if (isFailed) {
                        System.out.println("There is no available sum of the given numbers");
                    }
                }

            }
        }

        printResult();

    }



    public void printResult(){
        Integer min = Collections.min(resultMap.keySet());
        resultArray = resultMap.get(min);
         for (Integer k: resultArray) {
            result += k.toString() + "+";
        }

        result = result.substring(0, result.length() - 1);

        System.out.println(result);

    }


}
