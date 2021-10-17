package calculator;

class StringCalculator {

    public int add(String input) {
        String[] arr = input.split(",");
        if (input == null) {
            return 0;
        }
        else {
            for (String element : arr) {
                if (!element.isEmpty()) {
                    Integer.parseInt(element);
                }
            }
        }
        return 1;
    }

}