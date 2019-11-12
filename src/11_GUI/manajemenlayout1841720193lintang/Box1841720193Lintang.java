/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenlayout1841720193lintang;

/**
 *
 * @author ASUS
 */
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Box1841720193Lintang extends JFrame {
    private static final int mFRAME_WIDTH = 600;
    private static final int mFRAME_HEIGHT = 200;
    private JPanel mPanel;
    
    public Box1841720193Lintang() {
        mPanel = new JPanel();
        mPanel.setLayout(new BoxLayout(mPanel, BoxLayout.Y_AXIS));
        
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        
        add(mPanel);
        setSize(mFRAME_WIDTH, mFRAME_HEIGHT);
        setTitle("Box Layout Demo");
    }
}