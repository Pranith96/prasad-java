import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\ramannpr\\support_works\\prasad\\index2.txt");
		int i;
		while ((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
	}

}
