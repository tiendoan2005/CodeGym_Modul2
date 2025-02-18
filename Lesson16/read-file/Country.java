public class Country {
    private int id;
    private String code;
    private String name;

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Code: " + code + ", Name: " + name);
    }
}
