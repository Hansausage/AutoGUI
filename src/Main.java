import java.io.IOException;

public class Main {
static Writer writer;
	public static void main(String[] args) throws IOException {
		writer = new Writer();
		writer.writeFile(writer.getFile());
	}

}
