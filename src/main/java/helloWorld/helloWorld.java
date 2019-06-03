/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import com.googlecode.lanterna.graphics.TextGraphics;
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
public class helloWorld {
    public static void main(String[] args) throws IOException {
//        Locale.setDefault(Locale.getDefault());
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
         
        TextGraphics tg = screen.newTextGraphics();
        
        screen.startScreen();
        
        tg.putString(10, 10, "Hello World.");
        
        screen.refresh();
        screen.readInput();
        screen.stopScreen();
    }
}
