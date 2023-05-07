
package com.mycompany.calendar;

import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author pbyra
 */
public class CalendarGui extends javax.swing.JLayeredPane{
    

    /**
     * Creates new form CalendarGui
     */
    
    private int month;
    private int year;
    private static LocalDate currentMonth;
    public static ArrayList<LocalDate> calendarDates;
    public static ArrayList<ArrayList<LocalDate>> calendarDates2D;
    public CalendarGui(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        this.calendarDates = new ArrayList<LocalDate>();
        this.calendarDates2D = new ArrayList<ArrayList<LocalDate>>();
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        this.currentMonth = firstDayOfMonth;
        updateCalendarDates();
        init();
    }

    public static void updateCalendarDates() {
        calendarDates.clear();
        calendarDates2D.clear();

        LocalDate date = currentMonth.withDayOfMonth(1);
        while (date.getMonthValue() == currentMonth.getMonthValue()) {
            calendarDates.add(date);
            date = date.plusDays(1);
        }

        date = currentMonth.withDayOfMonth(1).with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        while (!date.isAfter(currentMonth.plusMonths(1).withDayOfMonth(1).with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY)))) {
            ArrayList<LocalDate> week = new ArrayList<LocalDate>();
            for (int i = 0; i < 7; i++) {
                week.add(date);
                date = date.plusDays(1);
            }
            calendarDates2D.add(week);
        }
    }
    // code taken from https://www.youtube.com/watch?v=YivaMCfichQ&t=69s
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
    // code ends
    
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
        thu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuActionPerformed(evt);
            }
        });
        add(thu);

        fri.setText("Fri");
        fri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(fri);

        sat.setText("Sat");
        sat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(sat);

        cell8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell8ActionPerformed(evt);
            }
        });
        add(cell8);

        cell9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell9ActionPerformed(evt);
            }
        });
        add(cell9);

        cell10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell10ActionPerformed(evt);
            }
        });
        add(cell10);

        cell11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell11ActionPerformed(evt);
            }
        });
        add(cell11);

        cell12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell12ActionPerformed(evt);
            }
        });
        add(cell12);

        cell13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell13ActionPerformed(evt);
            }
        });
        add(cell13);

        cell14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell14ActionPerformed(evt);
            }
        });
        add(cell14);

        cell15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell15ActionPerformed(evt);
            }
        });
        add(cell15);

        cell16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell16ActionPerformed(evt);
            }
        });
        add(cell16);

        cell17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell17ActionPerformed(evt);
            }
        });
        add(cell17);

        cell18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell18ActionPerformed(evt);
            }
        });
        add(cell18);

        cell19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell19ActionPerformed(evt);
            }
        });
        add(cell19);

        cell20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell20ActionPerformed(evt);
            }
        });
        add(cell20);

        cell21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell21ActionPerformed(evt);
            }
        });
        add(cell21);

        cell22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell22ActionPerformed(evt);
            }
        });
        add(cell22);

        cell23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell23ActionPerformed(evt);
            }
        });
        add(cell23);

        cell24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell24ActionPerformed(evt);
            }
        });
        add(cell24);

        cell25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell25ActionPerformed(evt);
            }
        });
        add(cell25);

        cell26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell26ActionPerformed(evt);
            }
        });
        add(cell26);

        cell27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell27ActionPerformed(evt);
            }
        });
        add(cell27);

        cell28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell28ActionPerformed(evt);
            }
        });
        add(cell28);

        cell29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell29ActionPerformed(evt);
            }
        });
        add(cell29);

        cell30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell30ActionPerformed(evt);
            }
        });
        add(cell30);

        cell31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell31ActionPerformed(evt);
            }
        });
        add(cell31);

        cell32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell32ActionPerformed(evt);
            }
        });
        add(cell32);

        cell33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell33ActionPerformed(evt);
            }
        });
        add(cell33);

        cell34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell34ActionPerformed(evt);
            }
        });
        add(cell34);

        cell35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell35ActionPerformed(evt);
            }
        });
        add(cell35);

        cell36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell36ActionPerformed(evt);
            }
        });
        add(cell36);

        cell37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell37ActionPerformed(evt);
            }
        });
        add(cell37);

        cell38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell38ActionPerformed(evt);
            }
        });
        add(cell38);

        cell39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell39ActionPerformed(evt);
            }
        });
        add(cell39);

        cell40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell40ActionPerformed(evt);
            }
        });
        add(cell40);

        cell41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell41ActionPerformed(evt);
            }
        });
        add(cell41);

        cell42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell42ActionPerformed(evt);
            }
        });
        add(cell42);

        cell43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell43ActionPerformed(evt);
            }
        });
        add(cell43);

        cell44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell44ActionPerformed(evt);
            }
        });
        add(cell44);

        cell45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell45ActionPerformed(evt);
            }
        });
        add(cell45);

        cell46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell46ActionPerformed(evt);
            }
        });
        add(cell46);

        cell47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell47ActionPerformed(evt);
            }
        });
        add(cell47);

        cell48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell48ActionPerformed(evt);
            }
        });
        add(cell48);

        cell49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell49ActionPerformed(evt);
            }
        });
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sunActionPerformed

    private void wedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wedActionPerformed

    private void thuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuActionPerformed
        
    }//GEN-LAST:event_thuActionPerformed

    private void cell12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell12ActionPerformed
       int row = 0;
       int col = 4;
        LocalDate selectedDate = calendarDates2D.get(row).get(col);
        if (selectedDate != null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    EventFrame eventCreationFrame = new EventFrame(selectedDate);
                    eventCreationFrame.setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_cell12ActionPerformed

    private void cell8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell8ActionPerformed
        int row = 0;
       int col = 0;
        LocalDate selectedDate = calendarDates2D.get(row).get(col);
        if (selectedDate != null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    EventFrame eventCreationFrame = new EventFrame(selectedDate);
                    eventCreationFrame.setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_cell8ActionPerformed

    private void cell9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell9ActionPerformed
        int row = 0;
           int col = 1;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }
    }//GEN-LAST:event_cell9ActionPerformed

    private void cell10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell10ActionPerformed
        int row = 0;
           int col = 2;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }        
    }//GEN-LAST:event_cell10ActionPerformed

    private void cell11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell11ActionPerformed
        int row = 0;
           int col = 3;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }               // TODO add your handling code here:
    }//GEN-LAST:event_cell11ActionPerformed

    private void cell13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell13ActionPerformed
        int row = 0;
           int col = 5;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                // TODO add your handling code here:
    }//GEN-LAST:event_cell13ActionPerformed

    private void cell14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell14ActionPerformed
        int row = 0;
           int col = 6;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }         
    }//GEN-LAST:event_cell14ActionPerformed

    private void cell15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell15ActionPerformed
        int row = 1;
           int col = 0;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                // TODO add your handling code here:
    }//GEN-LAST:event_cell15ActionPerformed

    private void cell16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell16ActionPerformed
        int row = 1;
           int col = 1;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                // TODO add your handling code here:
    }//GEN-LAST:event_cell16ActionPerformed

    private void cell17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell17ActionPerformed
            int row = 1;
           int col = 2;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell17ActionPerformed

    private void cell18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell18ActionPerformed
            int row = 1;
           int col = 3;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                     // TODO add your handling code here:
    }//GEN-LAST:event_cell18ActionPerformed

    private void cell19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell19ActionPerformed
        int row = 1;
       int col = 4;
        LocalDate selectedDate = null; 
    if (calendarDates2D.size() > row && calendarDates2D.get(row).size() > col) {
        selectedDate = calendarDates2D.get(row).get(col);
    }
    if (selectedDate != null) {
        EventFrame eventCreationFrame = new EventFrame(selectedDate);
        eventCreationFrame.setVisible(true);
    }
    }//GEN-LAST:event_cell19ActionPerformed

    private void cell20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell20ActionPerformed
            int row = 1;
           int col = 5;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                     // TODO add your handling code here:
    }//GEN-LAST:event_cell20ActionPerformed

    private void cell21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell21ActionPerformed
            int row = 1;
           int col = 6;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                     // TODO add your handling code here:
    }//GEN-LAST:event_cell21ActionPerformed

    private void cell22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell22ActionPerformed
            int row = 2;
           int col = 0;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                     // TODO add your handling code here:
    }//GEN-LAST:event_cell22ActionPerformed

    private void cell23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell23ActionPerformed
            int row = 2;
           int col = 1;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                     // TODO add your handling code here:
    }//GEN-LAST:event_cell23ActionPerformed

    private void cell24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell24ActionPerformed
            int row = 2;
           int col = 2;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell24ActionPerformed

    private void cell25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell25ActionPerformed
            int row = 2;
           int col = 3;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell25ActionPerformed

    private void cell26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell26ActionPerformed
            int row = 2;
           int col = 4;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell26ActionPerformed

    private void cell27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell27ActionPerformed
            int row = 2;
           int col = 5;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell27ActionPerformed

    private void cell28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell28ActionPerformed
            int row = 2;
           int col = 6;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell28ActionPerformed

    private void cell29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell29ActionPerformed
            int row = 3;
           int col = 0;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell29ActionPerformed

    private void cell30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell30ActionPerformed
            int row = 3;
           int col = 1;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell30ActionPerformed

    private void cell31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell31ActionPerformed
            int row = 3;
           int col = 2;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell31ActionPerformed

    private void cell32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell32ActionPerformed
            int row = 3;
           int col = 3;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell32ActionPerformed

    private void cell33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell33ActionPerformed
            int row = 3;
           int col = 4;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                  // TODO add your handling code here:
    }//GEN-LAST:event_cell33ActionPerformed

    private void cell34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell34ActionPerformed
            int row = 3;
           int col = 5;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell34ActionPerformed

    private void cell35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell35ActionPerformed
            int row = 3;
           int col = 6;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell35ActionPerformed

    private void cell36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell36ActionPerformed
            int row = 4;
           int col = 0;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   // TODO add your handling code here:
    }//GEN-LAST:event_cell36ActionPerformed

    private void cell37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell37ActionPerformed
            int row = 4;
           int col = 1;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell37ActionPerformed

    private void cell38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell38ActionPerformed
            int row = 4;
           int col = 2;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell38ActionPerformed

    private void cell39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell39ActionPerformed
            int row = 4;
           int col = 3;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell39ActionPerformed

    private void cell40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell40ActionPerformed
            int row = 4;
           int col = 4;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell40ActionPerformed

    private void cell41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell41ActionPerformed
            int row = 4;
           int col = 5;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell41ActionPerformed

    private void cell42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell42ActionPerformed
            int row = 4;
           int col = 6;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                 // TODO add your handling code here:
    }//GEN-LAST:event_cell42ActionPerformed

    private void cell43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell43ActionPerformed
            int row = 5;
           int col = 0;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                   
    }//GEN-LAST:event_cell43ActionPerformed

    private void cell44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell44ActionPerformed
            int row = 5;
           int col = 1;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                  // TODO add your handling code here:
    }//GEN-LAST:event_cell44ActionPerformed

    private void cell45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell45ActionPerformed
            int row = 5;
           int col = 2;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }                // TODO add your handling code here:
    }//GEN-LAST:event_cell45ActionPerformed

    private void cell46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell46ActionPerformed
            int row = 5;
           int col = 3;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }              // TODO add your handling code here:
    }//GEN-LAST:event_cell46ActionPerformed

    private void cell47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell47ActionPerformed
            int row = 5;
           int col = 4;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }               // TODO add your handling code here:
    }//GEN-LAST:event_cell47ActionPerformed

    private void cell48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell48ActionPerformed
            int row = 5;
           int col = 5;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }         
    }//GEN-LAST:event_cell48ActionPerformed

    private void cell49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell49ActionPerformed
            int row = 5;
           int col = 6;
            LocalDate selectedDate = calendarDates2D.get(row).get(col);
            if (selectedDate != null) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        EventFrame eventCreationFrame = new EventFrame(selectedDate);
                        eventCreationFrame.setVisible(true);
                    }
                });
            }         
    }//GEN-LAST:event_cell49ActionPerformed


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

