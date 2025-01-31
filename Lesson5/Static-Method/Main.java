public class Main {
    public static void main(String[] args) {
        Student.change();

        Student NumOne = new Student(NumberID.One, "Hoang");
        Student NumTwo = new Student(NumberID.Two, "Khanh");
        Student NumThree = new Student(NumberID.Three, "Nam");

        NumOne.display();
        NumTwo.display();
        NumThree.display();
    }
}
