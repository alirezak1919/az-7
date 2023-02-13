package errorHandler;

/**
 * Created by Alireza on 6/28/2015.
 */

public class ErrorHandler {
    private static boolean hasError = false;

    public static void reportAndPrintError(String msg) {
        hasError = true;
        printError(msg);
    }

    private static void printError(String msg) {
        System.out.println(msg);
    }

    public static boolean hasError() {
        return hasError;
    }
}
