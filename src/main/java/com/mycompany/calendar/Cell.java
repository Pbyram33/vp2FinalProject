
package com.mycompany.calendar;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author pbyra
 */

//code taken from: https://www.youtube.com/watch?v=YivaMCfichQ&t=69s
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
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (title) {
            grphcs.setColor(new Color(213,213,213));
            grphcs.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
        }
        super.paintComponent(grphcs);
    }
}
// code end
