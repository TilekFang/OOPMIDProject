import java.awt.*;
import javax.swing.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");

    WelcomePage(String userID){

        welcomeLabel.setBounds(0,120,800,45);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,12));
        welcomeLabel.setText("Hello "+userID  + ", thanks for checking my login system. TAKE CARE OF YOUR SELF");

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
