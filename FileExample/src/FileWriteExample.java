import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("C:\\Users\\ramannpr\\support_works\\prasad\\index2.txt");
		fileWriter.write("Hello Welcome");
		fileWriter.close();
		System.out.println("Succesfully saved");
	}
}
