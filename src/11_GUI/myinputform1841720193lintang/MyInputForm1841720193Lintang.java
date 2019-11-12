/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputform1841720193lintang;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720193Lintang extends JFrame {
    
    private static final int mFRAME_WIDTH = 600;
    private static final int mFRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JPanel mPanel;
    
    public MyInputForm1841720193Lintang(){
        createTextFieldLintang();
        createButtonLintang();
        createPanelLintang();
        setSize(mFRAME_WIDTH, mFRAME_WIDTH);
    }
    
    private void createTextFieldLintang(){
        mALabel = new JLabel ("Nilai A: ");
        mBLabel = new JLabel ("Nilai C: ");
        mCLabel = new JLabel ("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
    }
    
    private void createButtonLintang(){
        mButton = new JButton("Calculate");//untuk membuat tombol "Calculate"
        class AddInteresListener implements ActionListener{
            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(mAField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(mAField.getText());
                int c = a * b;
                mCLabel.setText("Hasil: " + c);
                }
            }
        ActionListener listener =  new AddInteresListener();
        mButton.addActionListener(listener);
        }
    
    public static void main(String [] args){
    // TODO code application logic here
    JFrame frame = new MyInputForm1841720193Lintang();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    }
    
    private void createPanelLintang(){
        mPanel=new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mCLabel);
        add(mPanel);
    }
}
