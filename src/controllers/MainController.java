/*
* File: App.java
* Author: Megyeri Márk Máté
* Copyright: 2022, Megyeri Márk Máté
* Group: SZOFT II/N
* Date: 2022-12-18
* Github: https://github.com/megyerimark
* Licenc: GNU GPL
*/
package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MainController 
{
    MainView mainView;

    public MainController() 
    {
        this.mainView = new MainView();
        this.handleEvents();
    }

    public void handleEvents()
    {
        JButton calcButton = this.mainView.buttonsPanel.calcButton;
        JButton aboutButton = this.mainView.buttonsPanel.aboutButton;
        JButton copyrightButton = this.mainView.buttonsPanel.copyrightButton;
        JButton refreshButton = this.mainView.buttonsPanel.refreshButton;
        JButton exitButton = this.mainView.buttonsPanel.exitButton;

        calcButton.addActionListener(e -> onClickCalcButton());
        aboutButton.addActionListener(e -> onClickABoutButton());
        copyrightButton.addActionListener(e -> onClickCopyRightButton());
        refreshButton.addActionListener(e -> onClickRefreshButton());
        exitButton.addActionListener(e -> onClickExitButton());
    }

    public void onClickCalcButton()
    {
        String asiteStr = this.mainView.asitePanel.getValue();
        String alphaStr = this.mainView.alphaPanel.getValue();

        double alpha = Double.parseDouble(alphaStr);
        double asite = Double.parseDouble(asiteStr);

        Double volume = 4 * asite;
        Double radian = alpha * Math.PI/180;
        Double area = Math.pow(asite, 2) * Math.sin(radian);

        this.mainView.volumePanel.setValue(volume.toString());
        this.mainView.areaPanel.setValue(area.toString());
        
    }
    
    public void onClickABoutButton()
    {JOptionPane.showMessageDialog(mainView, "Rombitak  \n  Version: 0.0.1  \n  Szoft II N \n 2022-12-15 ");}

    public void onClickCopyRightButton()
    {JOptionPane.showMessageDialog(mainView, "Copyright© Juhász Roland");}
    

    public void onClickRefreshButton()
    {
        this.mainView.asitePanel.setValue(null);
        this.mainView.alphaPanel.setValue(null);
        this.mainView.volumePanel.setValue(null);
        this.mainView.areaPanel.setValue(null);
    }

    public void onClickExitButton()
    {System.exit(0);}

}