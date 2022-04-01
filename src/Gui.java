import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui implements ActionListener {

    private static JLabel label;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JLabel success;
    private static JPasswordField passwordField;
    private static JButton sendButton;


    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame =new JFrame();
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
// ===============================
        panel.setLayout(null);

        label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);

         userText = new JTextField();
         userText.setBounds(100,20,165,25);
         panel.add(userText);

         passLabel = new JLabel("Password");
         passLabel.setBounds(10,50,80,25);
         panel.add(passLabel);

          passwordField = new JPasswordField();
         passwordField.setBounds(100,50,165,25);
         panel.add(passwordField);

         sendButton = new JButton("Login");
         sendButton.setBounds(10,80,80,25);
         sendButton.addActionListener(new Gui());
         panel.add(sendButton);

         success = new JLabel("");
         success.setBounds(10,110,300,25);
         panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = String.valueOf(passwordField.getPassword());
       if(user.equals("victor") && password.equals("vi123")){
           success.setText("Deu certo");
        //   System.out.println("A senha é: " + password);
       }
    }
}
