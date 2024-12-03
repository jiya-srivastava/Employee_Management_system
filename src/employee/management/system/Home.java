
//package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    JButton add, view, update, remove;
    
    Home(){
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(990, 590, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 990, 590);
        add(image);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(620,20,380,40);
        heading.setFont(new Font("TAHOMA",Font.BOLD, 18));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(630, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employees");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(630, 140, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        
        
        setSize(990,590);
        setLocation(250,80);
        setVisible(true);
}
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add){
            setVisible(false);
            new AddEmployee();
    }else if(ae.getSource() == view){
        
    }else if(ae.getSource() == update){
        
    }else {
              
            }
    }
    
    public static void main(String args[]){
        new Home();
    }
}
