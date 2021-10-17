package calculator;

class StringCalculator {

    public int add(String input) {
        String delim = ",|n";
        String num = input;
        if (input.startsWith("//")) {
            int delimiterIndex = input.indexOf("//") + 2;
            delim = input.substring(delimiterIndex, delimiterIndex + 1);
            num = input.substring(input.indexOf("n") + 1);
        }
        return add(num, delim);
    }

    private static int add(String num, final String delim) {
        int sum = 0;
        String[] arr = num.split(delim);
        for (String element : arr) {
            if (!element.trim().isEmpty()) {
                sum += Integer.parseInt(element.trim());
            }
        }
        return sum;
    }
}