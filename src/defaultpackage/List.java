package defaultpackage;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    public List() {
        //here we put in the grid for the tasks
        //10 rows and 1 column
        GridLayout layout = new GridLayout(10, 1);
        //gap inbetween
        layout.setVgap(5);

        this.setLayout(layout);
        //this.setBackground(Color.BLUE);
    }

    //for the numbers, use an array
    public void updateNumbers(){
        Component[] listItems = this.getComponents();

        for(int i = 0; i<listItems.length; i++){

            //this function is in task
            ((Task)listItems[i]).changeIndex(i+1);
        }
    }

    public void removeCompletedTasks() {

    }
}
