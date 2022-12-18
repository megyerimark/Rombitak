/*
* File: ButtonPanel.java
* Author: Megyeri Márk Máté
* Copyright: 2022, Megyeri Márk Máté
* Group: SZOFT II/N
* Date: 2022-12-18
* Github: https://github.com/megyerimark
* Licenc: GNU GPL
*/
package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel 
{
    public JButton calcButton;
    public JButton aboutButton;
    public JButton exitButton;

    public ButtonPanel() 
    {
        calcButton = new JButton("Számít");
        aboutButton = new JButton("Rólam");
        exitButton = new JButton("Bezárás");
        addComponents();
    }

    public void addComponents() 
    {
        add(calcButton);
        add(aboutButton);
        add(exitButton);
    }
    
}