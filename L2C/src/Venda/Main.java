package Venda;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        HTMLEditorKit htmlKit = new HTMLEditorKit();
        HTMLDocument htmlDoc = (HTMLDocument) htmlKit.createDefaultDocument();
        HTMLEditorKit.Parser parser = new ParserDelegator();
        parser.parse(new InputStreamReader(new URL("https://vendarulez.herokuapp.com/").openStream()),
                htmlDoc.getReader(0), true);

        System.out.println(htmlDoc.getProperty(""));
    }
}
