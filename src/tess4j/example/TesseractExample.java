package tess4j.example;

import java.io.File;
import net.sourceforge.tess4j.*;

public class TesseractExample {

    public static void main(String[] args) {
//        File imageFile = new File("C:\\codebase\\ws\\OCR_Java\\eurotext.tif");
//        File imageFile = new File("eurotext.tif");
//        File imageFile = new File("NeutraText.tif");
//        File imageFile = new File("NeutraText.gif");
//        File imageFile = new File("phototest.tif");
//        File imageFile = new File("factura.png");
//        File imageFile = new File("ej_imagen.png");
//        File imageFile = new File("ej_imagen.tif");
//        File imageFile = new File("1.tif");
//        File imageFile = new File("2.tif");
        File imageFile = new File("fac_1.jpg");
//        File imageFile = new File("fac_2.jpg");
//        File imageFile = new File("fac_3.jpg");
//        File imageFile = new File("fac_4.jpg");
//        File imageFile = new File("Scan0008.jpg");
//        File imageFile = new File("factura.tif");
        Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}

