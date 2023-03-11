import java.awt.*;
import java.awt.event.*;

class AwtMaths extends Frame implements ActionListener {
    TextField tf1, tf2;
    Button mumsad;

    Label l2, l1, n, r;

    AwtMaths() {
        n = new Label("Awt Basic Maths Calculator");
        l1 = new Label("Enter the first number ");
        l2 = new Label("Enter the Second number ");
        r = new Label();

        tf1 = new TextField();
        tf2 = new TextField();

        mumsad = new Button("ADD");

        n.setBounds(50, 40, 250, 20);
        l1.setBounds(50, 70, 250, 20);
        tf1.setBounds(50, 100, 250, 20);
        l2.setBounds(50, 130, 250, 20);
        tf2.setBounds(50, 160, 250, 20);
        mumsad.setBounds(50, 190, 250, 20);
        r.setBounds(50, 230, 250, 20);

        add(n);
        add(l1);
        add(l2);
        add(tf1);
        add(tf2);
        add(mumsad);
        add(r);

        setSize(500, 500);
        // setLayout(null);// no layout manager
        setVisible(true);// now frame will be visible, by default not visible
        mumsad.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int result;
        if (e.getSource() == mumsad) {
            result = num1 + num2;
            r.setText("Addition is " + result);
        }

    }

    public static void main(String[] args) {

        new AwtMaths();

    }
}
