public class StringManipulatorJukka {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
