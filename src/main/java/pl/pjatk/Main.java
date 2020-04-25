package pl.pjatk;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws IOException {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(2,3));

        String stringFile = FileUtils.readFileToString(FileUtils.getFile("src/main/testFile.txt"), Charset.defaultCharset());

        System.out.println(stringFile);

        createFile("newFile", "blablabla");
    }

    public static void createFile(String name, String content) throws IOException {
        FileUtils.writeStringToFile(new File("src/main/"+name+".txt"), content, Charset.defaultCharset());
    }
}
