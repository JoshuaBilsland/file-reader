import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileReader extends BaseFileReader {
    public String readAllText(String filePath) throws Exception {
        validatePath(filePath);
        return Files.readString(Path.of(filePath));
    }
}
