package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

    public int add(String input) {
        String delim = ",|n";
        String num = input;
        if (input.startsWith("//")) {
            int delimiterIndex = input.indexOf("//") + 2;
            delim = input.substring(delimiterIndex, delimiterIndex + 1);
            num = input.substring(input.indexOf("n") + 1);
        }
        return add(num,delim);
    }

    private static int add(String num, final String delim) {
        int sum = 0;
        String[] arr = num.split(delim);
        List negativeNum = new ArrayList();
        for (String element : arr) {
            if (!element.trim().isEmpty()) {
                int number = Integer.parseInt(element.trim());
                if(number < 0){
                    negativeNum.add(number);
                }else if(number <= 1000) {
                    sum += number;
                }
            }
        }
        if (negativeNum.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNum.toString());
        }
        return sum;
    }
}
