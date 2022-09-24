import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JLabel label1;
    JLabel label2;
    JTextField textField;
    JPasswordField passwordField;
    JButton button;
    MyFrame(){
        setTitle("Login Form");
        setLocation(100,100);
        setSize(400,300);

        c=getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Username");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        label2 = new JLabel("Password");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        textField = new JTextField();
        textField.setBounds(100,50,130,20);
        c.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(100,100,130,20);
        c.add(passwordField);

        button = new JButton("Login");
        button.setBounds(130,150,70,20);
        c.add(button);

        button.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Username: "+textField.getText());
        System.out.println("Password: "+passwordField.getText());
    }
}

public class LoginForm {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
    }
}
