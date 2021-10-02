import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCR {
    public static void main(String[] args)throws IOException, TesseractException{
        File file = new File("/Users/admin/workspace/OCRtest");
        BufferedImage img = ImageIO.read(file);

        ITesseract tesseract = new Tesseract();
        tesseract.setDatapath("/Users/admin/workspace"); // 言語ファイル（jpn.traineddata））の場所を指定
        tesseract.setLanguage("jpn"); // 解析言語は「日本語」を指定

        // 解析
        String str = tesseract.doOCR(img);

        // 結果
        System.out.println(str);
    }
}