package common;

// Prints result if approval is valid or invalid



public class ConsolePrinter {

    public void isValid(String className, int id, double cost) {
        System.out.printf("%s approved purchase with id %d that costs %.2f.\n", className, id, cost);
    }

    public void isInvalid(int id, String className) {
        System.out.printf("Purchase with id %d needs approval from higher position than %s.\n", id, className);
    }


}
