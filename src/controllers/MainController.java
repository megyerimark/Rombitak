
/*
* File: MainController.java
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
import views.MainView;


public class MainController{
    

   MainView mainView;

    public MainController(){
        this.mainView = new MainView();
        this.handleEvents();
    }

    private void handleEvents() {
        JButton calcButton = this.mainView.buttonPanel.calcButton;
        JButton aboutButton = this.mainView.buttonPanel.aboutButton;
        JButton refreshButton = this.mainView.buttonPanel.refreshButton;
        JButton exiButton = this.mainView.buttonPanel.exitButton;
        
       
        calcButton.addActionListener(e -> onClickCalcButton());
        aboutButton.addActionListener(e ->onClickCalcButton());
        refreshButton.addActionListener(e ->onClickCalcButton());
        exiButton.addActionListener(e -> onClickCalcButton());
       
      
    }

    public void onClickCalcButton() {
        String asiteStr = this.mainView.asidepanel.getValue();
        String alfaStr = this.mainView.alfapanel.getValue();

        double alfa = Double.parseDouble(alfaStr);
        double aside = Double.parseDouble(asiteStr);

        Double volume = 4* aside;
        Double radian = alfa * Math.PI/180;
        Double area = Math.pow(aside, 2)*Math.sin(radian);

        this.mainView.volumePanel.setValue(volume.toString());
        this.mainView.areaPanel.setValue(area.toString());
        
    }
    public void onClickAboutButton(){
        JOptionPane.showMessageDialog(mainView, "Rombitak");
    }
    public void onClickRefreshButton(){
        this.mainView.asidepanel.setValue(null);
        this.mainView.alfapanel.setValue(null);
        this.mainView.volumePanel.setValue(null);
        this.mainView.areaPanel.setValue(null);
    }
    public void OnClickExit(){
        System.out.println("Kilépés");
    }
}