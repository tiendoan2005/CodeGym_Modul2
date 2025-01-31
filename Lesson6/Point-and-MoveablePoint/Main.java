public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 2, 1);
        System.out.println(moveablePoint); // Before moving

        moveablePoint.move();
        System.out.println(moveablePoint); // After moving
    }
}
