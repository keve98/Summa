import java.util.ArrayList;

public class Logic {

    String result = "";
    ArrayList<Integer> resultArray = new ArrayList<>();
    ArrayList<ArrayList<Integer>> allResults = new ArrayList<>();


    public int calculate(int start, int basenum, Integer[] numsToSum, String sum) {
        int res = 0;

        if (basenum < 0) {
            return 0;
        }

        if(result != "" && sum.replaceAll("^+", "").length() > result.replaceAll("^+", "").length()){
            return 1;
        }

        if (basenum == 0) {
            sum = sum.substring(0, sum.length() - 1);
            result = sum;

            return 1;
        }

        for (int i = 0; i < numsToSum.length; i++) {
            res += calculate(i, basenum - numsToSum[i], numsToSum, sum + Integer.toString(numsToSum[i]) + "+");
        }
        return res;

    }


}
