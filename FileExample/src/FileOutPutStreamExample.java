import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ramannpr\\support_works\\prasad\\index.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String str = "Hello world";
		byte[] b = str.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Successfully written");
	}
}
