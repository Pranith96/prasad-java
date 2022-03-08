import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ramannpr\\support_works\\prasad\\index.txt");
		int i;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
	}
}