package defaultpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {

    private ButtonPanel btnPanel;
    private TitleBar title;
    private List list;

    //adding the functionality to the buttons
    private JButton addTask;
    private JButton clear;

    //note to self just use this class instead of the welcome page
    AppFrame(){
        this.setSize(350, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();
        this.add(title, BorderLayout.NORTH);
        //have another panel on the bottom for buttons
        this.add(btnPanel, BorderLayout.SOUTH);

        this.add(list,BorderLayout.CENTER);

        //here we use the getters from ButtonPanel
        addTask = btnPanel.getAddTask();
        clear = btnPanel.getClear();

        addListeners();
    }

    public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                Task task = new Task();

                list.add(task);
                list.updateNumbers();

                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e){
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();//for it to appear on screen
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                Task task = new Task();
                list.remove(task);
                revalidate();
            }
        });
    }
}
