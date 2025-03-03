import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MovieService implements MovieServiceInterface {
    private List<Movie> movies = new ArrayList<>();

    @Override
    public void addMovie(Movie movie) {
        for (Movie m : movies) {
            if (m.getId().equals(movie.getId())) {
                System.out.println("❌ ID phim đã tồn tại! Vui lòng nhập ID khác.");
                return;
            }
        }
        movies.add(movie);
        System.out.println("✅ Đã thêm phim thành công!");
        displayMovies();
    }

    @Override
    public boolean deleteMovie(String id) {
        Movie movieToDelete = findMovieById(id);
        if (movieToDelete == null) {
            System.out.println("❌ Không tìm thấy phim với ID: " + id);
            return false;
        }

        System.out.println("🔎 Tìm thấy phim: " + movieToDelete.getName() + " có ID: " + id);
        System.out.print("Bạn có muốn xóa phim này? (Y/N): ");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().trim();

        if (answer.equalsIgnoreCase("y")) {
            movies.remove(movieToDelete);
            System.out.println("✅ Phim đã được xóa thành công!");
            return true;
        } else {
            System.out.println("❌ Hủy xóa phim!");
            return false;
        }
    }

    @Override
    public boolean editMovie(String id, String newName, String newGenre, int newDuration) {
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) {
                movie.setName(newName);
                movie.setGenre(newGenre);
                movie.setDuration(newDuration);
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayMovies() {
        if (movies.isEmpty()) {
            System.out.println("📭 Danh sách phim trống.");
            return;
        }

        System.out.println("\n🎬 DANH SÁCH PHIM 🎬");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("| %-8s | %-20s | %-15s | %-8s |\n", "ID", "Tên phim", "Thể loại", "Thời lượng");
        System.out.println("----------------------------------------------------------------");

        for (Movie movie : movies) {
            System.out.printf("| %-8s | %-20s | %-15s | %-8d |\n",
                    movie.getId(), movie.getName(), movie.getGenre(), movie.getDuration());
        }
        System.out.println("----------------------------------------------------------------");
    }

    @Override
    public Movie findMovieById(String movieId) {
        for (Movie movie : movies) {
            if (movie.getId().equals(movieId)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public List<Movie> searchMovieByName(String name) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(movie);
            }
        }

        // In kết quả trực tiếp trong phương thức
        if (result.isEmpty()) {
            System.out.println("❌ Không tìm thấy phim nào có tên chứa: " + name);
        } else {
            System.out.println("\n🎬 KẾT QUẢ TÌM KIẾM 🎬");
            System.out.println("---------------------------------------------------------------");
            System.out.printf("| %-8s | %-20s | %-15s | %-8s |\n", "ID", "Tên phim", "Thể loại", "Thời lượng");
            System.out.println("---------------------------------------------------------------");
            for (Movie movie : result) {
                System.out.printf("| %-8s | %-20s | %-15s | %-8d |\n",
                        movie.getId(), movie.getName(), movie.getGenre(), movie.getDuration());
            }
            System.out.println("---------------------------------------------------------------");
        }

        return result;
    }

    @Override
    public void sortMovies(int option) {
        if (movies.isEmpty()) {
            System.out.println("📭 Danh sách phim trống, không thể sắp xếp.");
            return;
        }

        switch (option) {
            case 1:
                movies.sort(Comparator.comparing(Movie::getName)); // Tên A-Z
                break;
            case 2:
                movies.sort(Comparator.comparing(Movie::getName).reversed()); // Tên Z-A
                break;
            case 3:
                movies.sort(Comparator.comparingInt(Movie::getDuration)); // Thời lượng tăng dần
                break;
            case 4:
                movies.sort(Comparator.comparingInt(Movie::getDuration).reversed()); // Thời lượng giảm dần
                break;
            case 5:
                movies.sort(Comparator.comparing(Movie::getGenre)); // Thể loại A-Z
                break;
            case 6:
                movies.sort(Comparator.comparing(Movie::getGenre).reversed()); // Thể loại Z-A
                break;
            default:
                System.out.println("❌ Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 6.");
                return;
        }
        System.out.println("✅ Danh sách phim đã được sắp xếp!");
        displayMovies();
    }

    @Override
    public void exportMoviesToCSV(String filename) {
        if (movies.isEmpty()) {
            System.out.println("❌ Không có phim nào để xuất!");
            return;
        }

        try (FileWriter writer = new FileWriter(filename, false)) {
            writer.append("ID,Tên phim,Thể loại,Thời lượng\n");
            for (Movie movie : movies) {
                writer.append(String.format("\"%s\",\"%s\",\"%s\",%d\n",
                        movie.getId(),
                        movie.getName().replace("\"", "'"),  // Tránh lỗi nếu có dấu `"`
                        movie.getGenre().replace("\"", "'"),
                        movie.getDuration()));
            }
            System.out.println("✅ Xuất file CSV thành công: " + filename);
        } catch (IOException e) {
            System.out.println("❌ Lỗi khi xuất file: " + e.getMessage());
        }
    }
    @Override
    public void importMoviesFromCSV(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("❌ File không tồn tại: " + filename);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Bỏ qua dòng tiêu đề
                    continue;
                }

                // Xử lý dữ liệu bị thiếu hoặc lỗi định dạng
                String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); // Xử lý dấu phẩy trong chuỗi
                if (data.length != 4) {
                    System.out.println("❌ Dòng dữ liệu không hợp lệ: " + line);
                    continue;
                }

                String id = data[0].replace("\"", "").trim();
                String name = data[1].replace("\"", "").trim();
                String genre = data[2].replace("\"", "").trim();
                int duration;

                try {
                    duration = Integer.parseInt(data[3].trim());
                } catch (NumberFormatException e) {
                    System.out.println("❌ Lỗi parse thời lượng: " + data[3]);
                    continue;
                }

                movies.add(new Movie(id, name, genre, duration));
            }

            System.out.println("✅ Đọc file CSV thành công: " + filename);
            displayMovies();
        } catch (IOException e) {
            System.out.println("❌ Lỗi khi đọc file: " + e.getMessage());
        }
    }

}
