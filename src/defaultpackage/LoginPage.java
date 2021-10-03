package defaultpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    //here as we want to use them throughout the class
    private static JLabel userIDLabel;
    private static JTextField userIDField;
    private static JLabel passwordLabel;
    private static JPasswordField passwordField;
    private static JButton loginButton;
    private static JButton resetButton;
    private static JLabel messageLabel;
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();

    HashMap<String, String> logininfo = new HashMap<String, String>();

    //constructor to recieve the hashmap
    LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit when we close out of
        frame.add(panel);

        panel.setLayout(null);

        userIDLabel = new JLabel("UserID");
        //10 to the right, 20 down, width and height of the area of the label
        userIDLabel.setBounds(10, 20, 80, 25);
        panel.add(userIDLabel);

        userIDField = new JTextField();
        userIDField.setBounds(100, 20, 165, 25);
        panel.add(userIDField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        //this is unique as we need to hid the password
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(100, 80, 80, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        panel.add(resetButton);

        messageLabel = new JLabel("");
        messageLabel.setBounds(10, 110, 300, 25);
        panel.add(messageLabel);

        frame.setVisible(true);

    }

    @Override //after we implement the action listener
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == resetButton) {
            userIDField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(passwordField.getPassword());
            //gets the password and converts it to a string and stores it in password

            //verify username and password
            //loginInfo is the name of the hashmap
            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");

                    frame.dispose();//gets rid of the frame as we switch to the new one
                    //I've put in userID so that we can send it over to the welcome page
                    AppFrame appFrame = new AppFrame();
                }
            }
        }
    }
}

