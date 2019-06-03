/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author behlul
 */
public class guiWork {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.getDefault());
        Terminal term = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(term);
        WindowBasedTextGUI gui = new MultiWindowTextGUI(screen);
        MyWindow myWindow = new MyWindow();
        gui.addWindow(myWindow);
        myWindow.setVisible(true);
        myWindow.waitUntilClosed();
        
// use GUI here until the GUI wants to exit
        
    }
}
