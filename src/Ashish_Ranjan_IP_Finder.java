import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ashish_Ranjan_IP_Finder {

    public static void main (String[] args)


    {
        JFrame jFrame = new JFrame("IP Finder Program");
        jFrame.setBounds(100,100,1000,1000);
        jFrame.setVisible(true);


        //IP Finder Program

        JLabel label = new JLabel("Enter Web URL:");
        label.setBounds(50,70,150,20);

        JTextField textField = new JTextField();
        textField.setBounds(50,100,200,20);


        JButton button = new JButton( "Find IP");
        button.setBounds(50,150,80,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = textField.getText();
                try {
                    InetAddress ia = InetAddress.getByName(url);
                    String ip = ia.getHostAddress();
                    JOptionPane.showMessageDialog(jFrame,ip);

                }catch (UnknownHostException unknownHostException)
                {
                    unknownHostException.printStackTrace();
                }
            }
        });

        jFrame.add(label);
        jFrame.add(textField);
        jFrame.add(button);

        jFrame.setLayout(null);
    }
}
