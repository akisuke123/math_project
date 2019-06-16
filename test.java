import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Test extends JFrame{
  Test(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("test");
    JPanel pn = new JPanel();
    pn.setPreferredSize(new Dimension(100,100));
    add(pn);
    setVisible(true);
  }
  public static void main(String args[]){
    new Test();
  }
}
