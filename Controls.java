import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Controls implements ActionListener
{
    private JTextField display;
    private JButton[] buttons;
    private double x, y;
    private double result;
    private int operation;
    private boolean equals, running, building;
    
    public Controls(JTextField d, JButton[] b)
    {
        display=d;
        buttons=b;
        //addActions();
        equals=false;
        running=false;
        building=true;
        initializeActionListener();
    }
    
    public void initializeActionListener()
    {
        for(int i=0; i<buttons.length; i++)
        {
            buttons[i].addActionListener(this);
        }
    }
    
    
    
    public void equals()
    {
        if (display.getText().equals(""))
        {
            
        }
        else
        {
          y=Double.parseDouble(display.getText());
          if(operation==1)//+
          {
              result=x+y;
          }
          else if(operation==2)//-
          {
              result=x-y;
          }
          else if(operation==3)//*
          {
              result=x*y;
          }
          else if(operation==4)///
          {
              result=x/y;
          }
          else if(operation==5)//MOD
          {
              result=x%y;
          }
          
          if((result-(int)result==0))
          {
              int intResult=(int)result;
              display.setText(""+intResult);
          }
          else
          {
              display.setText(""+result);
          }
        }
        }
    
    public void addActions()
    {
        for(int i=0; i<buttons.length; i++)
        {
            buttons[i].addActionListener(this);
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0; i<10; i++)
        {
            if(e.getSource()==buttons[i])
            {
                if(equals)
                {
                    x=0;
                    y=0;
                    display.setText("");
                    result=0;
                    equals=false;
                }
                display.setText(display.getText()+i);
            }
        }
        //button 10
        if(e.getSource()==buttons[10])//.
            {
                display.setText(display.getText()+".");
            }
        if(e.getSource()==buttons[11])//+
        {
            if(display.getText().equals(""))
            {
            }
            else
            {
            x=Double.parseDouble(display.getText());
            operation=1;
            display.setText("");
            running=true;
            }
        }
         if(e.getSource()==buttons[15])//clear
        {
            x=0;
            y=0;
            display.setText("");
            result=0;
        }
        if(e.getSource()==buttons[16])//=
        {
            equals=true;
            running=false;
            equals();
            x=0;
            y=0;
            result=0;
        }
        if(e.getSource()==buttons[12])//-
        {
            if(display.getText().equals(""))
            {
            }
            else
            {
            x=Double.parseDouble(display.getText());
            operation=2;
            display.setText("");
            running=true;
            }
            }
            
            if(e.getSource()==buttons[13])//*
        {
            if(display.getText().equals(""))
            {
            }
            else
            {
            x=Double.parseDouble(display.getText());
            operation=3;
            display.setText("");
            running=true;
            }
            }
            
            
            if(e.getSource()==buttons[14])///
        {
            if(display.getText().equals(""))
            {
            }
            else
            {
            x=Double.parseDouble(display.getText());
            operation=4;
            display.setText("");
            running=true;
            }
            }
            
            if(e.getSource()==buttons[17])//-\^2
        {
            if(display.getText().equals(""))
            {
            }
            else
            {
            x=Double.parseDouble(display.getText());
            operation=5;
            display.setText("");
            running=true;
            }
            }
        }
    }

