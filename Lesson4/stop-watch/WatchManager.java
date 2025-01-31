public class WatchManager {
    private long startTime;
    private long endTime;

    public void Stopwatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {

        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started!");
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        System.out.println("Stopwatch ended!");
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }


}
