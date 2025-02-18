import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    public static List<Country> readFile(String filePath) {
        List<Country> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Kiểm tra dòng trống
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Tách dữ liệu theo dấu tab "\t"
                String[] data = line.split("\t");

                // Kiểm tra xem có đủ 3 cột không
                if (data.length < 3) {
                    System.err.println("⚠ Lỗi định dạng dòng: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(data[0].trim()); // Chuyển đổi id thành số nguyên
                    String code = data[1].trim();
                    String name = data[2].trim();

                    Country country = new Country(id, code, name);
                    countries.add(country);
                } catch (NumberFormatException e) {
                    System.err.println("⚠ Lỗi dữ liệu id không hợp lệ: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("❌ Tệp tin không tồn tại: " + filePath);
        } catch (IOException e) {
            System.err.println("❌ Lỗi khi đọc tệp: " + e.getMessage());
        }
        return countries;
    }
}
