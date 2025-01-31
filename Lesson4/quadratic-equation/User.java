public class User {
    private double x;
    private double y;
    private double z;

    public void getValues(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDiscriminant() {
        return y * y - 4 * x * z;
    }


    public double getRoot1() {
        double g = getDiscriminant();
        return (-y + Math.pow(g, 0.5)) / (2 * x);
    }

    public double getRoot2() {
        double g = getDiscriminant();

        return (-y - Math.pow(g, 0.5)) / (2 * x);
    }

    public double getRoot3() {
        return -y / (2 * x);
    }
}
