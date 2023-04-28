
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author virulnirmala
 */
class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    TextField tf;

    String fv, sv, op;
    double fdv, sdv, tot;

    Color c1 = new Color(255, 0, 0);
    Color c2 = new Color(43, 43, 43);
    Color c3 = new Color(238, 183, 107);

    cal() {
        Frame f1 = new Frame();
        f1.setBackground(Color.WHITE);
        f1.setBounds(600, 200, 400, 500);
        f1.addWindowListener(new close());
        f1.setTitle("My calculator");

        MenuBar mbar = new MenuBar();

        MenuItem mi1 = new MenuItem("History");
        MenuItem mi2 = new MenuItem("Standed");
        MenuItem mi3 = new MenuItem("Sicentific");
        MenuItem mi4 = new MenuItem("Tools");
        MenuItem mi5 = new MenuItem("Windows");
        MenuItem mi6 = new MenuItem("History");
        MenuItem mi7 = new MenuItem("Dark");
        MenuItem mi8 = new MenuItem("Light");


        Menu m1 = new Menu("Viwe");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Help");
        Menu m4 = new Menu("Theme");

        m1.add(mi1);
        m1.add(mi2);

        m2.add(mi3);
        m2.add(mi4);

        m3.add(mi6);
        m3.add(mi5);

        m4.add(mi7);
        m4.add(mi8);
        
        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        mbar.add(m4);

        f1.setMenuBar(mbar);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button(".");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("*");
        b15 = new Button("/");
        b16 = new Button("c");
        b17 = new Button("=");
        b18 = new Button("√ ");

        Font font1 = new Font("Cambria Math", Font.BOLD, 20);

        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font1);
        b12.setFont(font1);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font1);
        b17.setFont(font1);
        b18.setFont(font1);

        b11.setForeground(c3);
        b12.setForeground(c3);
        b13.setForeground(c3);
        b14.setForeground(c3);
        b15.setForeground(c3);
        b18.setForeground(c3);
        b7.setForeground(c2);
        b8.setForeground(c2);
        b9.setForeground(c2);
        b4.setForeground(c2);
        b5.setForeground(c2);
        b6.setForeground(c2);
        b1.setForeground(c2);
        b2.setForeground(c2);
        b3.setForeground(c2);
        b10.setForeground(c2);
        b17.setForeground(c1);
        b16.setForeground(c1);
        
        tf = new TextField(12);

        Font font2 = new Font("Cambria Math", Font.BOLD, 50);

        tf.setFont(font2);
        tf.setEditable(false);
        tf.setForeground(Color.black);
        tf.setBackground(Color.gray);

        Panel p1 = new Panel();
        Panel p2 = new Panel();

        GridLayout g1 = new GridLayout(6, 3, 3, 3);

        p1.add(tf);
        p2.setLayout(g1);
        p2.setBackground(Color.gray);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b18);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b17);
        p2.add(b10);
        p2.add(b16);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);

        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b12)) {
            fv = tf.getText();
            tf.setText("");
            op = b12.getLabel();
        } else if (o.equals(b11)) {
            fv = tf.getText();
            tf.setText("");
            op = b11.getLabel();
        } else if (o.equals(b13)) {
            fv = tf.getText();
            tf.setText("");
            op = b13.getLabel();
        } else if (o.equals(b14)) {
            fv = tf.getText();
            tf.setText("");
            op = b14.getLabel();
        } else if (o.equals(b15)) {
            fv = tf.getText();
            tf.setText("");
            op = b15.getLabel();
        } else if (o.equals(b16)) {
            tf.setText("");
        }else if(o.equals(b18)){
            fv = tf.getText();
            tf.setText("");
            op = b18.getLabel();

        }else if (o.equals(b17)) {
            sv = tf.getText();
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");
            } else if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
            } else if (op.equals("/")) {
                tot = fdv / sdv;
                tf.setText(tot + "");
            } else if (op.equals("*")) {
                tot = fdv * sdv;
                tf.setText(tot + "");
            } else if (op.equals("√")){
                fv = tf.getText();
                fdv = Double.parseDouble(fv);
                tot = Math.sqrt(fdv);
                tf.setText(Double.toString(tot));
            }
            
        }

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class calculator {

    public static void main(String[] args) {
        new cal();

    }

}
