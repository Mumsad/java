import java.awt.*;
import java.awt.event.*;

class awtfactorial extends Frame implements ActionListener {

    TextField t1;
    Label n, l1, r;
    Button mumsad;

    awtfactorial() {
        n = new Label("Welcome to factorial Program ");
        l1 = new Label("Enter the number");
        r = new Label();
        t1 = new TextField();
        mumsad = new Button("Factorial");
        n.setBounds(50, 40, 200, 20);
        l1.setBounds(50, 70, 180, 20);
        t1.setBounds(50, 100, 160, 20);
        mumsad.setBounds(50, 130, 140, 20);
        r.setBounds(50, 160, 120, 20);

        add(n);
        add(l1);
        add(t1);
        add(mumsad);
        add(r);
        setSize(300, 250);
        setLayout(null);
        setVisible(true);

        mumsad.addActionListener(this);

        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            dispose();
        }    
        });
    }
public void actionPerformed(ActionEvent e){
    int num1=Integer.valueOf(t1.getText());
    int fac=1;
    while(num1>0){
        fac=fac*num1;
        num1--;
    }
    r.setText("Factorial is "+fac);
    }
public static void main(String[] args) {
    new awtfactorial();
}

    }
