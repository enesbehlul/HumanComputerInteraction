/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;

/**
 *
 * @author behlul
 */
public class tutorial1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        DefaultTerminalFactory dft = new DefaultTerminalFactory();
        Terminal terminal = dft.createTerminal();
        terminal.putCharacter('H');
        terminal.putCharacter('e');
        terminal.putCharacter('l');
        terminal.putCharacter('l');
        terminal.putCharacter('o');
        terminal.putCharacter('\n');
        terminal.flush();
        Thread.sleep(2000);

        TerminalPosition startPosition = terminal.getCursorPosition();
        terminal.setCursorPosition(startPosition.withRelativeColumn(3).withRelativeRow(2));
        terminal.flush();
        Thread.sleep(2000);
        terminal.setBackgroundColor(TextColor.ANSI.BLUE);
        terminal.setForegroundColor(TextColor.ANSI.YELLOW);

        terminal.putCharacter('Y');
        terminal.putCharacter('e');
        terminal.putCharacter('l');
        terminal.putCharacter('l');
        terminal.putCharacter('o');
        terminal.putCharacter('w');
        terminal.putCharacter(' ');
        terminal.putCharacter('o');
        terminal.putCharacter('n');
        terminal.putCharacter(' ');
        terminal.putCharacter('b');
        terminal.putCharacter('l');
        terminal.putCharacter('u');
        terminal.putCharacter('e');
        terminal.flush();
        Thread.sleep(2000);

        terminal.setCursorPosition(startPosition.withRelativeColumn(3).withRelativeRow(3));
        terminal.flush();
        Thread.sleep(2000);
        terminal.enableSGR(SGR.BOLD);
        terminal.putCharacter('Y');
        terminal.putCharacter('e');
        terminal.putCharacter('l');
        terminal.putCharacter('l');
        terminal.putCharacter('o');
        terminal.putCharacter('w');
        terminal.putCharacter(' ');
        terminal.putCharacter('o');
        terminal.putCharacter('n');
        terminal.putCharacter(' ');
        terminal.putCharacter('b');
        terminal.putCharacter('l');
        terminal.putCharacter('u');
        terminal.putCharacter('e');
        terminal.flush();
        Thread.sleep(2000);
        terminal.resetColorAndSGR();
        terminal.setCursorPosition(terminal.getCursorPosition().withColumn(0).withRelativeRow(1));
        terminal.putCharacter('D');
        terminal.putCharacter('o');
        terminal.putCharacter('n');
        terminal.putCharacter('e');
        terminal.putCharacter('\n');
        terminal.flush();

        Thread.sleep(2000);

        terminal.bell();
        terminal.flush();
        Thread.sleep(2000);
        if (terminal != null) {
            try {
                terminal.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
