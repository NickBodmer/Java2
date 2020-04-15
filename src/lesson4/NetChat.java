package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NetChat extends JFrame {

    JPanel jpNorth = new JPanel(new GridLayout());
    JPanel jpSouth = new JPanel(new GridLayout());

    JButton jb = new JButton("Послать");
    JTextArea jt = new JTextArea();
    JScrollPane jsp = new JScrollPane(jt);
    JTextField jtf = new JTextField();

    public NetChat() throws IOException {

        setTitle("Сетевой чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 400, 400);
        setVisible(true);

        jb.addActionListener(e -> {
            sendMessage();
        });
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }
        });
        jpNorth.add(jsp);
        jpSouth.add(jtf);
        jpSouth.add(jb);

        add(jpNorth);
        add("South", jpSouth);
    }

    void sendMessage() {
        String out = jtf.getText();
        jt.append(out + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }

}