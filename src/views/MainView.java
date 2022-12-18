
/*
* File: MainView.java
* Author: Megyeri Márk Máté
* Copyright: 2022, Megyeri Márk Máté
* Group: SZOFT II/N
* Date: 2022-12-18
* Github: https://github.com/megyerimark
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainView extends JFrame 
{
    TitlePanel titlePanel;
    public AsidePanel asidepanel;
    public AlfaPanel alfapanel;
    public AreaPanel areaPanel;
    public VolumePanel volumePanel;
    public ButtonPanel buttonPanel;
    public Object buttonsPanel;

    public MainView() 
    {
        this.titlePanel = new TitlePanel();
        this.asidepanel = new AsidePanel();
        this.alfapanel = new AlfaPanel();
        this.volumePanel = new VolumePanel();
        this.areaPanel = new AreaPanel();
        this.buttonPanel = new ButtonPanel();
        this.initWindow();
    }
    
    public void initWindow() 
    {
       
        this.setTitle("rombitak");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void addComponents() 
    {

        this.add(this.titlePanel);
        this.add(this.asidepanel);
        this.add(this.alfapanel);
        this.add(this.volumePanel);
        this.add(this.areaPanel);
        this.add(this.buttonPanel);
        
        
    }

  
    
}