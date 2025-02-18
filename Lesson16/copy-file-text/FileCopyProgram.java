import java.io.*;
import java.util.Scanner;

public class FileCopyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại!");
            return;
        }

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File targetFile = new File(targetPath);
        if (targetFile.exists()) {
            System.out.println("Cảnh báo: Tệp đích đã tồn tại! Bạn có muốn ghi đè không? (Y/N)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("Hủy sao chép.");
                return;
            }
        }

        int charCount = copyFile(sourceFile, targetFile);
        if (charCount >= 0) {
            System.out.println("Sao chép thành công! Số ký tự đã sao chép: " + charCount);
        } else {
            System.out.println("Sao chép thất bại.");
        }
    }

    public static int copyFile(File source, File target) {
        int charCount = 0;
        try (
                FileReader reader = new FileReader(source);
                FileWriter writer = new FileWriter(target)
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi sao chép tệp: " + e.getMessage());
            return -1;
        }
        return charCount;
    }
}
