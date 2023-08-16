import java.io.*;
import java.util.*;
import java.util.zip.*;

public class Zip {
    public static void main(String[] args) {
        String[] fileNames = new String[] { "input.txt", "output.txt" };
        byte[] buf = new byte[1024];
        try {
            String zipFile = "zipFile.zip";
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));
            for (int i = 0; i < fileNames.length; i++) {
                FileInputStream in = new FileInputStream(fileNames[i]);
                out.putNextEntry(new ZipEntry(fileNames[i]));
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                out.closeEntry();
                in.close();
            }
            out.close();
        } catch (IOException e) {
        }
    }
}