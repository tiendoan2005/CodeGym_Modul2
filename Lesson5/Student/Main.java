public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        // Lỗi vì private chỉ truy cập đc trong class Student
        // student.setClasses("C01");
        // student.setName("Alex");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
