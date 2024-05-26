package modul5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class loginForm extends JFrame implements ActionListener{
    JPanel panel;
    JLabel username, password, pesan;
    JTextField teks1;
    JPasswordField teks2;
    JButton button;

    loginForm(){
        username = new JLabel();
        username.setText("Username");
        teks1 = new JTextField();

        password = new JLabel();
        password.setText("Password");
        teks2 = new JPasswordField();

        button = new JButton("SUBMIT");
        panel = new JPanel(new GridLayout(3, 1));
        panel.add(username);
        panel.add(teks1);
        panel.add(password);
        panel.add(teks2);
        pesan = new JLabel();
        panel.add(pesan);
        panel.add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Hi Login dulu !");
        setSize(400, 300);
        setVisible(true);

    }
    public static void main(String[] args) {
        new loginForm();
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String user = teks1.getText();
        String pass = new String(teks2.getPassword());

        if(user.trim().equals("RezaWijaya")&&(pass.trim().equals("Reza123"))){
            pesan.setText("Halo "+user+ "Selamat datang!");
        }else{
            pesan.setText("Terjadi Kesalahan Tolong isi lagi bro !");
        }
    }
}

