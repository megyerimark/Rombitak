/*
* File: TitlePanel.java
* Author: Megyeri Márk Máté
* Copyright: 2022, Megyeri Márk Máté
* Group: SZOFT II/N
* Date: 2022-12-18
* Github: https://github.com/megyerimark
* Licenc: GNU GPL
*/
package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class TitlePanel extends JPanel 
{
    JLabel mainLabel;
   

    public TitlePanel() 
    {
        this.mainLabel = new JLabel("Rombusz területe és kerülete");  
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 10, 100));
        this.add(this.mainLabel);
     
    }
    
}