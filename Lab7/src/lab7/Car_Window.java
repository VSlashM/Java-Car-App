/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import com.sun.corba.se.impl.logging.OMGSystemException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 *
 * @author vitos
 */
public class Car_Window {
    
    private final int MAIN_WINDOW_HEIGHT,
            MAIN_WINDOW_WIDTH,
            DROPDOWN_HEIGHT,
            DROPDOWN_WIDTH,
            BUTTON_WIDTH,
            BUTTON_HEIGHT,
            INNER_LBL_HEIGHT,
            INNER_LBL_WIDTH,
            EAST_WEST_WIDTH,
            EAST_WEST_HEIGHT,
            NORTH_WIDTH,
            NORTH_HEIGHT,
            SOUTH_WIDTH,
            SOUTH_HEIGHT;
    private JFrame mainWindow;
    private JPanel north, east, south, west, center;
    
    public Car_Window() {
        mainWindow = new JFrame("BorderLayout");
        mainWindow.setTitle("Welcome to the Online Car Review Application (OCRA)");
        MAIN_WINDOW_HEIGHT = 675;
        MAIN_WINDOW_WIDTH = 1200;
        mainWindow.setBounds(0, 0, MAIN_WINDOW_WIDTH, MAIN_WINDOW_HEIGHT);
        mainWindow.add(north, BorderLayout.NORTH);
        mainWindow.add(south, BorderLayout.SOUTH);
        mainWindow.add(east, BorderLayout.EAST);
        mainWindow.add(west, BorderLayout.WEST);
        mainWindow.add(center, BorderLayout.CENTER);
    }
}
