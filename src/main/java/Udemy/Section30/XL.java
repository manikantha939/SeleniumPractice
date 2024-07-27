package Udemy.Section30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class XL {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("testData/DataDriven.xlsx")) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
