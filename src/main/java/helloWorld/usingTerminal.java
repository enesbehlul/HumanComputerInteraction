/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;

/**
 *
 * @author behlul
 */
public class usingTerminal {

    public static void main(String[] args) throws IOException {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();

//        terminal.enterPrivateMode();
        terminal.setCursorPosition(10, 5);
//        terminal.exitPrivateMode();
        TerminalSize screenSize = terminal.getTerminalSize();

//Place the cursor in the bottom right corner
        terminal.setCursorPosition(screenSize.getColumns() - 1, screenSize.getRows() - 1);
        terminal.setCursorPosition(10, 5);
        terminal.putCharacter('H');
        terminal.putCharacter('e');
        terminal.putCharacter('l');
        terminal.putCharacter('l');
        terminal.putCharacter('o');
        terminal.putCharacter('!');

        // bunu yapmaliyiz cunku karisiklik cikabilirmis
        terminal.setCursorPosition(0, 0);

        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();
        TextGraphics textGraphics = screen.newTextGraphics();
        textGraphics.setForegroundColor(TextColor.ANSI.RED);
        textGraphics.setBackgroundColor(TextColor.ANSI.GREEN);
        textGraphics.putString(10, 5, "Hello Lanterna!");
        screen.refresh();
        WindowBasedTextGUI gui = new MultiWindowTextGUI(screen);
//        screen.stopScreen();
    }
}
