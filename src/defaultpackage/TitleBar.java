package defaultpackage;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    public TitleBar() {
        this.setPreferredSize(new Dimension(350, 80));
        //this.setBackground(Color.red);

        JLabel titleText = new JLabel("To do list");
        titleText.setPreferredSize(new Dimension(200, 80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}
