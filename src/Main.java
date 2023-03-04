import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM:SS MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}
