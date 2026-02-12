import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.BufferedReader;

public class TextFileReader extends BaseFileReader {
    private BufferedReader reader;

    public String readAllText(String filePath) throws Exception {
        validatePath(filePath);
        return Files.readString(Path.of(filePath));
    }

    public List<String> readLines(String filePath) throws Exception {
        validatePath(filePath);
        return Files.readAllLines(Path.of(filePath));
    }

    public void open(String filePath) throws Exception {
        validatePath(filePath);
        this.reader = Files.newBufferedReader(Path.of(filePath));
    }

    public String nextLine() throws Exception {
        if (reader == null) {
            throw new Exception("File not open! Call open() first.");
        }
        return reader.readLine();
    }

    public void close() throws Exception {
        if (reader != null) {
            reader.close();
            reader = null;
        }
    }
}
