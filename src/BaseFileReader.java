import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class BaseFileReader {
    protected void validatePath(String filePath) throws FileNotFoundException {
        if (filePath == null) {
            throw new FileNotFoundException("File path cannot be null");
        }
        if (!Files.exists(Path.of(filePath))) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
    }
}
