public class Fan {
    public static void main(String[] args) {
        FanManager fanOne = new FanManager();
        fanOne.setSpeed(SpeedConst.FAST);
        fanOne.setRadius(10);
        fanOne.setColor("yellow");
        fanOne.setOn(true);

        FanManager fanTwo = new FanManager();
        fanTwo.setSpeed(SpeedConst.MEDIUM);
        fanTwo.setRadius(5);
        fanTwo.setColor("blue");
        fanTwo.setOn(false);

        System.out.println(fanOne);
        System.out.println(fanTwo);
    }
}
