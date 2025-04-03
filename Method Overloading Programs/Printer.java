class Printer {
    public void print(int num) {
        System.out.println("Integer: " + num);
    }
 
    public void print(double num) {
        System.out.println("Double: " + num);
    }
 
    public void print(String text) {
        System.out.println("String: " + text);
    }
 
    public void print(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(10);
        printer.print(10.5);
        printer.print("Hello, Java!");
        printer.print(new int[]{1, 2, 3, 4, 5});
    }
}
