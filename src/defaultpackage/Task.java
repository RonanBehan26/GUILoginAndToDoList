package defaultpackage;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton done;

    private boolean checked;

    public Task() {
        //adding the buttons and styling
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.red);

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        //20 across, 20 high
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        //text fields
        taskName = new JTextField("Your Task Here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.red);

        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());

        this.add(done, BorderLayout.EAST);
    }

    public JButton getDone(){
        return done;
    }

    public void changeIndex(int num){
        this.index.setText(num + "");
        this.revalidate();
    }

    //changes the done tasks to green
    public void changeState(){
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true;
    }


}
