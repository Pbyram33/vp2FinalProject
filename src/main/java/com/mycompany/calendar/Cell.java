/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calendar;

import java.awt.Color;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author pbyra
 */
public class Cell extends JButton {
    private Date date;
    private boolean title;
    
    public Cell() {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }
    public void asTitle() {
        title = true;
    }
    
    public boolean getTitle() {
        return title;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void currMonth(boolean act) {
        if (act) {
            setForeground(new Color(68, 68, 68));
        }
        else {
            setForeground(new Color(169, 169, 169));
        }
    }
}
