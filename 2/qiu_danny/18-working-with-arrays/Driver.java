public class Driver {

    public static void main(String[] args) {
        ArraysFun a = new ArraysFun();

        int[] array = a.revFill(10);
        a.printArray(array);

        array = a.makeRandom(20, 10, 100);
        a.printArray(array);
    }
}
