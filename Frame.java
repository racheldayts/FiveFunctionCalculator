import java.awt.*;
import javax.swing.*;
public class Frame extends JFrame
{
    private CalculatorPanel c;
    
    public Frame()
    {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700,500));
        c=new CalculatorPanel();
        add(c);
        
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        Frame f=new Frame();
    }
}

