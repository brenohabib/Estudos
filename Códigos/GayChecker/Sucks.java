package GayChecker;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Sucks extends JFrame implements ActionListener{
JButton yesButton;
JButton noButton;
JLabel label;


    Sucks(){

        label = new JLabel();
        yesButton = new JButton("Sim");
        noButton = new JButton("Não");
        

        label.setText("Você é gay?");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));


        this.setTitle("Gay Checker");
        this.setSize(800, 800);
        this.setVisible(true);

        yesButton.setBounds(550, 400, 100, 50);
        noButton.setBounds(100, 400, 100, 50);

        yesButton.setSize(150, 50);
        noButton.setSize(150, 50);

        yesButton.setVisible(true);
        noButton.setVisible(true);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(noButton);
        this.add(yesButton);
        this.add(label);
        noButton.addActionListener(this);
        yesButton.addActionListener(this);

    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == noButton){
            int xRandom = (int)(Math.random()*601);
            int YRandom = (int)(Math.random()*601);
            noButton.setBounds(xRandom, YRandom, 150, 50);
        }
        if(event.getSource() == yesButton){
            label.setText("Realmente, tu é");
            label.setFont(new Font("MV Boli", Font.PLAIN, 75));
        }
    }
    
}
