import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPdfStream {
    public static void main(String[] args) {
        String filePath = "src/main/resources/large_data.pdf";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            byte[] buffer = new byte[1024 * 1024]; // 1MB씩 읽기
            int bytesRead;
            long totalBytes = 0;

            while ((bytesRead = bis.read(buffer)) != -1) {
                totalBytes += bytesRead;
            }

            System.out.println("파일 크기: " + totalBytes + " bytes (스트리밍 방식)");
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
