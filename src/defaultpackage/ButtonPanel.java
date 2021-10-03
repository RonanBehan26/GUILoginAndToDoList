package defaultpackage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel{

    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel(){
        this.setPreferredSize(new Dimension(400, 60));
        //this.setBackground(Color.red);

        //now add the buttons and style them
        addTask = new JButton("Add Task");
        addTask.setBorder(getBorder());
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(addTask);//this brings up the button

        //this is to create a gap between the boxes
        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Clear completed Tasks");
        clear.setBorder(getBorder());
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(clear);
    }

    //getters for some functionality
    public JButton getAddTask(){
        return addTask;
    }

    public JButton getClear(){
        return clear;
    }
}
