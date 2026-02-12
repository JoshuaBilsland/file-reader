import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextFileReader extends BaseFileReader {
    public String readAllText(String filePath) throws Exception {
        validatePath(filePath);
        return Files.readString(Path.of(filePath));
    }

    public List<String> readLines(String filePath) throws Exception {
        validatePath(filePath);
        return Files.readAllLines(Path.of(filePath));
    }
}
