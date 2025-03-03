    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MovieService movieService = new MovieService();
            while (true) {
                System.out.println("\n----Cinema----");
                System.out.println("1. Hiển thị danh sách phim");
                System.out.println("2. Thêm phim");
                System.out.println("3. Sửa phim");
                System.out.println("4. Xóa phim");
                System.out.println("5. Tìm kiếm phim");
                System.out.println("6. Sắp xếp phim");
                System.out.println("7. Xuất file phim");
                System.out.println("8. Đọc file phim");
                System.out.println("0. EXIT");
                System.out.print("Chọn chức năng: ");

                String action = scanner.nextLine().trim();
                switch (action) {
                    case "1":
                        movieService.displayMovies();
                        break;
                    case "2":
                        String movieId;
                        do {
                            System.out.print("Nhập ID phim (định dạng MV001): ");
                            movieId = scanner.nextLine().trim();
                            if (!ValidationUtils.isValidMovieId(movieId)) {
                                System.out.println("❌ ID không hợp lệ! Vui lòng nhập lại.");
                            }
                        } while (!ValidationUtils.isValidMovieId(movieId));

                        System.out.print("Nhập tên phim: ");
                        String name = scanner.nextLine().trim();

                        String genre;
                        do {
                            System.out.print("Nhập thể loại: ");
                            genre = scanner.nextLine().trim();
                            if (!ValidationUtils.isValidGenre(genre)) {
                                System.out.println("❌ Vui lòng nhập đúng thể loại phim (chỉ chứa chữ cái)!");
                            }
                        } while (!ValidationUtils.isValidGenre(genre));

                        String time;
                        do {
                            System.out.print("Nhập thời lượng (phút): ");
                            time = scanner.nextLine().trim();
                            if (!ValidationUtils.isValidMovieTime(time)) {
                                System.out.println("❌ Vui lòng chỉ nhập số!");
                            }
                        } while (!ValidationUtils.isValidMovieTime(time));

                        // **Tạo đối tượng Movie và thêm vào danh sách**
                        Movie newMovie = new Movie(movieId, name, genre, Integer.parseInt(time));
                        movieService.addMovie(newMovie);

                        System.out.println("✅ Phim đã được thêm thành công!");
                        break;
                    case "3":
                        do {
                            System.out.print("Nhập ID phim cần sửa (định dạng MV001): ");
                            movieId = scanner.nextLine().trim();
                            if (!ValidationUtils.isValidMovieId(movieId)) {
                                System.out.println("❌ ID không hợp lệ! Vui lòng nhập lại.");
                            }
                        } while (!ValidationUtils.isValidMovieId(movieId));

                        // Kiểm tra xem phim có tồn tại không
                        Movie existingMovie = movieService.findMovieById(movieId);
                        if (existingMovie == null) {
                            System.out.println("❌ Không tìm thấy phim với ID: " + movieId);
                            break;
                        }

                        System.out.print("Nhập tên phim mới: ");
                        name = scanner.nextLine().trim();

                        do {
                            System.out.print("Nhập thể loại mới: ");
                            genre = scanner.nextLine().trim();
                            if (!ValidationUtils.isValidGenre(genre)) {
                                System.out.println("❌ Vui lòng nhập đúng thể loại phim (chỉ chứa chữ cái)!");
                            }
                        } while (!ValidationUtils.isValidGenre(genre));

                        do {
                            System.out.print("Nhập thời lượng mới (phút): ");
                            time = scanner.nextLine().trim();
                            if (!ValidationUtils.isValidMovieTime(time)) {
                                System.out.println("❌ Vui lòng chỉ nhập số!");
                            }
                        } while (!ValidationUtils.isValidMovieTime(time));

                        // Gọi hàm editMovie trong MovieService
                        boolean updated = movieService.editMovie(movieId, name, genre, Integer.parseInt(time));
                        if (updated) {
                            System.out.println("✅ Phim đã được cập nhật thành công!");
                        } else {
                            System.out.println("❌ Cập nhật thất bại! Vui lòng kiểm tra lại.");
                        }
                        break;

                    case "4":
                        do {
                            System.out.print("Nhập ID phim cần xóa: ");
                            movieId = scanner.nextLine().trim();
                            if (!ValidationUtils.isValidMovieId(movieId)) {
                                System.out.println("Vui lòng nhập đúng ID!");
                            }
                        }while (!ValidationUtils.isValidMovieId(movieId));
                        movieService.deleteMovie(movieId);
                        break;
                    case "5":
                        System.out.print("Nhập tên phim cần tìm: ");
                        String findName = scanner.nextLine().trim();
                        movieService.searchMovieByName(findName); // Gọi trực tiếp, không cần xử lý kết quả
                        break;

                    case "6":
                        System.out.println("Chọn tiêu chí sắp xếp:");
                        System.out.println("1. Sắp xếp theo tên (A-Z)");
                        System.out.println("2. Sắp xếp theo tên (Z-A)");
                        System.out.println("3. Sắp xếp theo thời lượng (tăng dần)");
                        System.out.println("4. Sắp xếp theo thời lượng (giảm dần)");
                        System.out.println("5. Sắp xếp theo thể loại (A-Z)");
                        System.out.println("6. Sắp xếp theo thể loại (Z-A)");
                        System.out.print("Nhập lựa chọn: ");
                        int sortOption;
                        try {
                            sortOption = Integer.parseInt(scanner.nextLine().trim());
                            movieService.sortMovies(sortOption);
                        } catch (NumberFormatException e) {
                            System.out.println("❌ Vui lòng nhập một số hợp lệ!");
                        }
                        break;

                    case "7":
                        System.out.print("Nhập tên file CSV để xuất: ");
                        String filename = scanner.nextLine().trim();
                        movieService.exportMoviesToCSV(filename);
                        break;
                    case "8":
                        System.out.print("Nhập tên file CSV để nhập dữ liệu: ");
                        String readFilename = scanner.nextLine().trim();
                        movieService.importMoviesFromCSV(readFilename);
                        break;
                    case "0":
                        System.out.println("Thoát chương trình.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Chức năng không hợp lệ, vui lòng nhập lại!");
                        break;
                }
            }
        }
    }
