
package com.mycompany.calendar;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.prefs.Preferences;
import javax.swing.JColorChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author pbyra
 */
public class Main extends javax.swing.JFrame {
    static Map<LocalDate, LinkedList<Event>> eventList = new HashMap<>();
    private static final Color defColor = Color.BLUE;
    private static CalendarCustom temp;
    private static JPopupMenu settingsMenu = new JPopupMenu("Settings");
    private static JMenuItem colorSchemeOption = new JMenuItem("Color Scheme");
    private static Preferences prefs = Preferences.userRoot().node("CustomizableCalendar");
    private static Color colorScheme = new Color(
    prefs.getInt("colorSchemeRed", defColor.getRed()),
    prefs.getInt("colorSchemeGreen", defColor.getGreen()),
    prefs.getInt("colorSchemeBlue", defColor.getBlue())
  );
    /**
     * Creates new form Main
     */
    public Main() {
        LocalDate firstDayOfMonth = LocalDate.of(2023, 4, 1);
        LocalDate date = firstDayOfMonth.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        settingsMenu.add(colorSchemeOption);
        colorSchemeOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              showColorPicker();
            }
          });
        String colorString = prefs.get("colorScheme", "#0000FF");
        colorScheme = Color.decode(colorString);
        getContentPane().setBackground(colorScheme);

        initComponents();
        temp = calendarCustom1;
    }
    
    public void applyCustomizations() {
    // Change the color of the background
    this.setBackground(colorScheme);

    // Change the color of the font
    this.setFont(new Font("SansSerif", Font.PLAIN, 12));
    this.setForeground(colorScheme.darker());
  }
    
    public void saveCustomizations() {
    prefs.put("colorScheme", colorScheme.toString());
  }

  // Allow the user to modify the color scheme
  public void setColorScheme(Color color) {
    colorScheme = color;
    prefs.putInt("colorSchemeRed", color.getRed());
    prefs.putInt("colorSchemeGreen", color.getGreen());
    prefs.putInt("colorSchemeBlue", color.getBlue());
  }
  
  public static CalendarCustom getUIInstance() {
    return temp;
}

    
    public Color getColorScheme() {
    return colorScheme;
  }
    
    private void showColorPicker() {
    Color initialColor = getColorScheme();
    Color newColor = JColorChooser.showDialog(null, "Select Color Scheme", initialColor);
    setColorScheme(newColor);
    prefs.put("colorScheme", "#" + Integer.toHexString(newColor.getRGB()).substring(2));
    getContentPane().setBackground(newColor); // Set the background color of the calendar component
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendarCustom1 = new com.mycompany.calendar.CalendarCustom();
        settingsBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        settingsBTN.setText("Settings");
        settingsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(calendarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsBTN)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(settingsBTN)
                    .addComponent(calendarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBTNActionPerformed
       settingsMenu.show(settingsBTN, 0, settingsBTN.getHeight());
    }//GEN-LAST:event_settingsBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Map<LocalDate, LinkedList<Event>> eventList = new HashMap<>();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.calendar.CalendarCustom calendarCustom1;
    private javax.swing.JButton settingsBTN;
    // End of variables declaration//GEN-END:variables
}
