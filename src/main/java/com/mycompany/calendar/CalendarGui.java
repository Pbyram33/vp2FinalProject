
package com.mycompany.calendar;

import java.awt.Component;
import java.util.Calendar;

/**
 *
 * @author pbyra
 */
public class CalendarGui extends javax.swing.JLayeredPane {

    /**
     * Creates new form CalendarGui
     */
    private int month;
    private int year;
    public CalendarGui(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }

    private void init() {
        sun.asTitle();
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        setDate();
    }
    
    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.getTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currMonth(calendar.get(Calendar.MONTH) == month-1);
                calendar.add(Calendar.DATE, 1);
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new com.mycompany.calendar.Cell();
        mon = new com.mycompany.calendar.Cell();
        tue = new com.mycompany.calendar.Cell();
        wed = new com.mycompany.calendar.Cell();
        thu = new com.mycompany.calendar.Cell();
        fri = new com.mycompany.calendar.Cell();
        sat = new com.mycompany.calendar.Cell();
        cell8 = new com.mycompany.calendar.Cell();
        cell9 = new com.mycompany.calendar.Cell();
        cell10 = new com.mycompany.calendar.Cell();
        cell11 = new com.mycompany.calendar.Cell();
        cell12 = new com.mycompany.calendar.Cell();
        cell13 = new com.mycompany.calendar.Cell();
        cell14 = new com.mycompany.calendar.Cell();
        cell15 = new com.mycompany.calendar.Cell();
        cell16 = new com.mycompany.calendar.Cell();
        cell17 = new com.mycompany.calendar.Cell();
        cell18 = new com.mycompany.calendar.Cell();
        cell19 = new com.mycompany.calendar.Cell();
        cell20 = new com.mycompany.calendar.Cell();
        cell21 = new com.mycompany.calendar.Cell();
        cell22 = new com.mycompany.calendar.Cell();
        cell23 = new com.mycompany.calendar.Cell();
        cell24 = new com.mycompany.calendar.Cell();
        cell25 = new com.mycompany.calendar.Cell();
        cell26 = new com.mycompany.calendar.Cell();
        cell27 = new com.mycompany.calendar.Cell();
        cell28 = new com.mycompany.calendar.Cell();
        cell29 = new com.mycompany.calendar.Cell();
        cell30 = new com.mycompany.calendar.Cell();
        cell31 = new com.mycompany.calendar.Cell();
        cell32 = new com.mycompany.calendar.Cell();
        cell33 = new com.mycompany.calendar.Cell();
        cell34 = new com.mycompany.calendar.Cell();
        cell35 = new com.mycompany.calendar.Cell();
        cell36 = new com.mycompany.calendar.Cell();
        cell37 = new com.mycompany.calendar.Cell();
        cell38 = new com.mycompany.calendar.Cell();
        cell39 = new com.mycompany.calendar.Cell();
        cell40 = new com.mycompany.calendar.Cell();
        cell41 = new com.mycompany.calendar.Cell();
        cell42 = new com.mycompany.calendar.Cell();
        cell43 = new com.mycompany.calendar.Cell();
        cell44 = new com.mycompany.calendar.Cell();
        cell45 = new com.mycompany.calendar.Cell();
        cell46 = new com.mycompany.calendar.Cell();
        cell47 = new com.mycompany.calendar.Cell();
        cell48 = new com.mycompany.calendar.Cell();
        cell49 = new com.mycompany.calendar.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setText("Sun");
        sun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunActionPerformed(evt);
            }
        });
        add(sun);

        mon.setText("Mon");
        mon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(mon);

        tue.setText("Tue");
        tue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(tue);

        wed.setText("Wed");
        wed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wedActionPerformed(evt);
            }
        });
        add(wed);

        thu.setText("Thu");
        thu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Fri");
        fri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(fri);

        sat.setText("Sat");
        sat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(sat);

        cell8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell8);

        cell9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell14);

        cell15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sunActionPerformed

    private void wedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.calendar.Cell cell10;
    private com.mycompany.calendar.Cell cell11;
    private com.mycompany.calendar.Cell cell12;
    private com.mycompany.calendar.Cell cell13;
    private com.mycompany.calendar.Cell cell14;
    private com.mycompany.calendar.Cell cell15;
    private com.mycompany.calendar.Cell cell16;
    private com.mycompany.calendar.Cell cell17;
    private com.mycompany.calendar.Cell cell18;
    private com.mycompany.calendar.Cell cell19;
    private com.mycompany.calendar.Cell cell20;
    private com.mycompany.calendar.Cell cell21;
    private com.mycompany.calendar.Cell cell22;
    private com.mycompany.calendar.Cell cell23;
    private com.mycompany.calendar.Cell cell24;
    private com.mycompany.calendar.Cell cell25;
    private com.mycompany.calendar.Cell cell26;
    private com.mycompany.calendar.Cell cell27;
    private com.mycompany.calendar.Cell cell28;
    private com.mycompany.calendar.Cell cell29;
    private com.mycompany.calendar.Cell cell30;
    private com.mycompany.calendar.Cell cell31;
    private com.mycompany.calendar.Cell cell32;
    private com.mycompany.calendar.Cell cell33;
    private com.mycompany.calendar.Cell cell34;
    private com.mycompany.calendar.Cell cell35;
    private com.mycompany.calendar.Cell cell36;
    private com.mycompany.calendar.Cell cell37;
    private com.mycompany.calendar.Cell cell38;
    private com.mycompany.calendar.Cell cell39;
    private com.mycompany.calendar.Cell cell40;
    private com.mycompany.calendar.Cell cell41;
    private com.mycompany.calendar.Cell cell42;
    private com.mycompany.calendar.Cell cell43;
    private com.mycompany.calendar.Cell cell44;
    private com.mycompany.calendar.Cell cell45;
    private com.mycompany.calendar.Cell cell46;
    private com.mycompany.calendar.Cell cell47;
    private com.mycompany.calendar.Cell cell48;
    private com.mycompany.calendar.Cell cell49;
    private com.mycompany.calendar.Cell cell8;
    private com.mycompany.calendar.Cell cell9;
    private com.mycompany.calendar.Cell fri;
    private com.mycompany.calendar.Cell mon;
    private com.mycompany.calendar.Cell sat;
    private com.mycompany.calendar.Cell sun;
    private com.mycompany.calendar.Cell thu;
    private com.mycompany.calendar.Cell tue;
    private com.mycompany.calendar.Cell wed;
    // End of variables declaration//GEN-END:variables
}
