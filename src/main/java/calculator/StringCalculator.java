package calculator;

class StringCalculator {

    public int add(String input) {
        String[] arr = input.split(",");
        int sum = 0;
            for (String element : arr) {
                if (!element.trim().isEmpty()) {
                    sum = sum + Integer.parseInt(element);
                }
            }
        return sum;
    }

}
