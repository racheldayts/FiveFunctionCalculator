import java.awt.*;
import javax.swing.*;
public class Panel extends JPanel
{
  private JLabel label;
  private JButton button;
  
  public Panel()
  {
      label=new JLabel("Hello World");
      button=new JButton("Click Me");
      display();
  }
  
  public void display()
  {
      add(label);
      add(button);
  }
}

