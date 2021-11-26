/**
 * Write a description of class CeilingFan here.
 * Sehaj Mundi
 * 3117464
 */
import java.io.*;
public class MacroCommand extends Command {
    Command[] array;

    public MacroCommand(Command[] commands) 
    {
        this.array = array;
    }

    public void execute() 
    {
        for (int i = 0; i < array.length; i++) 
        {
            array[i].execute();
        }
    }

    public void executeWithLog() throws IOException 
    {
        for (int i = 0; i < array.length; i++) 
        {
            array[i].executeWithLog();
        }
    }

    public void undo()
    {
        for (int i = array.length -1; i >= 0; i--) 
        {
            array[i].undo();
        }
    }

    public void undoWithLog() throws IOException
    {
        for (int i = array.length -1; i >= 0; i--) 
        {
            array[i].undoWithLog();
        }
    }
}
