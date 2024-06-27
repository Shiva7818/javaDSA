import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SimpleCalculator extends Applet implements ActionListener {
   TextField t1, t2, t3;
   Button b1, b2, b3, b4;
   
   public void init() {
      t1 = new TextField(10);
      t2 = new TextField(10);
      t3 = new TextField(10);
      
      b1 = new Button("+");
      b2 = new Button("-");
      b3 = new Button("*");
      b4 = new Button("/");
      
      add(t1);
      add(t2);
      add(t3);
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent ae) {
      String s1 = t1.getText();
      String s2 = t2.getText();
      
      double a = Double.parseDouble(s1);
      double b = Double.parseDouble(s2);
      
      if (ae.getSource() == b1) {
         t3.setText(String.valueOf(a + b));
      } else if (ae.getSource() == b2) {
         t3.setText(String.valueOf(a - b));
      } else if (ae.getSource() == b3) {
         t3.setText(String.valueOf(a * b));
      } else if (ae.getSource() == b4) {
         t3.setText(String.valueOf(a / b));
      }
   }
}