package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reading_File {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:/Users/Hp/OneDrive/Desktop/Program files/Java/IO/input.txt");

            int content = fis.read();

            while (content != -1) {
                System.out.print((char) content);
                content = fis.read();

            }

            fis.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            FileOutputStream fos = new FileOutputStream(
                    "C:/Users/Hp/OneDrive/Desktop/Program files/Java/IO/output.txt");
            String text = "Hello I am Aritra";

            fos.write(text.getBytes());
        } catch (IOException e) {
            System.out.println(e);

        }

    }

}
