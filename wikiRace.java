import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class wikiRace {
    private String[] titles;
    
    public wikiRace() {
        try {
            File info = new File("info.txt");
            Scanner scanner = new Scanner(info);
            this.titles = new String[1026];
            int i = 0;
            while (scanner.hasNextLine()) {
                titles[i] = scanner.nextLine(); 
                i++;
            }
            scanner.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void start() {
        String startArticle = titles[(int)(Math.random() * (1026))];
        String endArticle = titles[(int)(Math.random() * (1026))];
        JOptionPane.showMessageDialog(null, "Start: " + startArticle + "\nEnd: " + endArticle);
    }
    
    public static void main(String[] args) {
        wikiRace goobsta = new wikiRace();
        goobsta.start();
    }
}