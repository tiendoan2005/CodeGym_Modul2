
public class stopWatch {
    public static void main(String[] args) {
        WatchManager manager = new WatchManager();
        RandomNumber randomNumber = new RandomNumber();
        int arraySize =100000;
        int[] array = randomNumber.generateRandomArray(arraySize);
        manager.start();
        randomNumber.selectionSort(array);
        manager.stop();
        System.out.println(manager.getElapsedTime()/1000.0);
    }
}
