public class FanManager {


    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public FanManager() {
        this.speed = SpeedConst.SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        if (on) {
            return "Speed = " + speed + ", Color = " + color + ", Radius = " + radius + " fan is on";
        } else {
            return "Color = " + color + ", Radius = " + radius + " fan is off";
        }
    }
}