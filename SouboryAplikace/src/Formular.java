import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Formular extends JFrame{
    private JPanel panel1;
    private JButton VlozJButton;
    private Databaze databaze;

    public Formular() {

        setContentPane(panel1);
        setTitle("Databaze");
        setSize(700, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Path path = Paths.get("src/Soubory1/test.txt");

        try {
            Files.createDirectories(path.getParent());
            databaze = new Databaze(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        VlozJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    databaze.pridejUzivatele("Pavel Slavík", 22, LocalDate.of(2000, 3, 21));
                    databaze.pridejUzivatele("Jan Novák", 31, LocalDate.of(2012, 10, 30));
                    databaze.uloz();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Databázi se nepodařilo uložit, zkontrolujte přístupová práva k souboru.");
                }


            }
        });
    }




    public static void main(String[] args) {
        Formular form = new Formular();



    }

}
