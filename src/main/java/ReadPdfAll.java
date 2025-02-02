import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadPdfAll {
    public static void main(String[] args) {
        String filePath = "src/main/resources/large_data.pdf";

        try {
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
            System.out.println("파일 크기: " + fileBytes.length + " bytes");

            System.out.print("파일 데이터 (앞 20바이트): ");
            for (int i = 0; i < Math.min(20, fileBytes.length); i++) {
                System.out.printf("%02X ", fileBytes[i]);
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
