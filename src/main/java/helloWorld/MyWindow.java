/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.Panel;

/**
 *
 * @author behlul
 */
public class MyWindow extends BasicWindow {
    public MyWindow() {
        super("My Window!");
        Panel contentPane = new Panel();
        contentPane.setLayoutManager(new LinearLayout(Direction.VERTICAL));
        contentPane.addComponent(new Label("This is the first label"));
        contentPane.addComponent(new Label("This is the second label, red").setForegroundColor(TextColor.ANSI.RED));
        contentPane.addComponent(new Label("This is the last label\nSpanning\nMultiple\nRows"));
        
        setComponent(contentPane);
    }
}
