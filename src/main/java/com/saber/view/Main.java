package com.saber.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame= new JFrame("App 1");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        JLabel label = new JLabel("Name : ");
        Font font=  new Font(Font.SERIF,Font.BOLD,18);
        label.setFont(font);

        JTextField textName = new JTextField(25);
        textName.setFont(font);

        JButton button = new JButton("Show Name ");

button.addActionListener(e -> {
    if (textName.getText().isEmpty()){
        JOptionPane.showMessageDialog(panel,"Error Please Enter Your Name");
    }else{
        String name = textName.getText();
        String result = "Welcome  "+ name+ " To MyProgram";
        JOptionPane.showMessageDialog(panel,result,"Welcome",JOptionPane.INFORMATION_MESSAGE);
    }
});



        panel.add(label);
        panel.add(textName);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
