
public class color {

    // Text color

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Background color

    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";

    String[] disco = { "RED", "YELLOW", "GREEN", "CYAN", "BLUE", "PURPLE" };

    // Simple function
    public String Error(String text) {
        String TextCol = BLACK + RED_BACKGROUND + text + RESET;
        return TextCol;
    }

    public String Red(String text) {
        String TextCol = RED + text + RESET;
        return TextCol;
    }

    public String ErText(String text) {
        String TextCol = YELLOW + text + RESET;
        return TextCol;
    }

    public String Cyan(String text) {
        String TextCol = CYAN + text + RESET;
        return TextCol;
    }

    public String Title(String text) {
        String TextCol = WHITE_BACKGROUND + text + RESET;
        return TextCol;
    }

    public String ThingComplete(String text) {
        String TextCol = GREEN + text + RESET;
        return TextCol;
    }

    public String ThingComplete(int text) {
        String Word = Integer.toString(text);
        String TextCol = GREEN + Word + RESET;
        return TextCol;
    }

    public void PrintCafeName() {
        System.out.print(Title("_______ - Welcome to Chalambin Cafe - _______") + "\n");
    }

    public void Bar() {
        System.out.println(Title("//////////////////////////////////////////") + "\n");
    }

}
