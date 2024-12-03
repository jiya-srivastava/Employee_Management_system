
package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Splash extends JFrame implements ActionListener{
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(60,20,1100,50);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(40,80, 1000, 400);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(320,320,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        setSize(1100,600);
        setLocation(150,50);
        setVisible(true);
        
        while (true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
            
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String args[]){
        new Splash();
        
    }
    
}
