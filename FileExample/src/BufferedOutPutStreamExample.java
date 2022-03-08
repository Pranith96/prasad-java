import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutPutStreamExample {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ramannpr\\support_works\\prasad\\index1.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Hello welcome";
		byte[] b = s.getBytes();
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("Successfully written");
	}
}
