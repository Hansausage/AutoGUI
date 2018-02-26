import java.io.IOException;

public class Main {
static Writer writer;
	public static void main(String[] args) throws IOException {
		Writer write = new Writer();
		String file = write.getFile();
		write.writeFile(file);
	}

}
