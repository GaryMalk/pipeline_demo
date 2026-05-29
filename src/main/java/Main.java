public class Main {
    static void main() {

        String greeting = "Hello & welcome to the pipeline demo!";
        IO.println(greeting);
        IO.println(truncateString(greeting, 17));
    }

    /**
     * Truncates a string to the limit allowed
     * @param text string to be truncated
     * @param limit maximum number of characters after truncation
     * @return truncated string
     */
    public static String truncateString(String text, int limit) {
        if (text.length() <= limit) {
            return text;
        }

        return text.substring(0, limit);
    }

}
