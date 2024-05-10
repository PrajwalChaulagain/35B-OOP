public class FunctionClass {
    void printMessage() {
        System.out.println("The function prints");
    }

    /* Method with return type int */
    int returnValue(int defaultValue) {
        return defaultValue;
    }

    /* Method to add two numbers */
    double addNumbers(int a, double b) {
        return a + b;
    }

    boolean areNumbersEqual(double num1, double num2) {
        return num1 == num2;
    }

    public static void main(String[] args) {
        FunctionClass fc = new FunctionClass();

        fc.printMessage();
        fc.printMessage();

        int returnFromFunction = fc.returnValue(10);
        System.out.println("Return from function is " + returnFromFunction);

        double returnFromAdd = fc.addNumbers(10, 20.2);
        System.out.println("Add returns " + returnFromAdd);
    }
}