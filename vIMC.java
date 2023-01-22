
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vIMC {
    private JPanel panel1;
    private JButton button1;
    private JTextField altura;
    private JTextField peso;
    private JLabel labelRespuesta;
    private JTextField textField1;
    private JLabel CAlcukos;
    double pe;
    double al;

    public vIMC() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double valor1=0;
                double valor2=0;
                valor1=Double.parseDouble(peso.getText());
                valor2=Double.parseDouble(altura.getText());
                double calIMC =valor1/(Math.pow(valor2,2));

                labelRespuesta.setText("Su IMC es: "+ calIMC);

            }
        });




    }

    public static void main(String[] args) {
        JFrame frame =new JFrame("Calculadora IMC");

        frame.setContentPane(new vIMC().panel1);
        frame.setBounds (new Rectangle(130, 149, 125, 20));
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
