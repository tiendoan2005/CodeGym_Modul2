import java.util.List;

public class App {
    public static void main(String[] args) {
        String filePath = "countries.csv"; // Đổi thành đường dẫn file thực tế của bạn

        List<Country> countries = CountryReader.readFile(filePath);

        // Hiển thị danh sách quốc gia
        if (countries.isEmpty()) {
            System.out.println("❌ Không có dữ liệu hợp lệ để hiển thị.");
        } else {
            System.out.println("✅ Danh sách quốc gia:");
            for (Country country : countries) {
                country.display();
            }
        }
    }
}
