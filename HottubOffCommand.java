/**
 * Write a description of class CeilingFan here.
 * Sehaj Mundi
 * 3117464
 */
public class HottubOffCommand extends Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    public void undo() {
        hottub.on();
    }
}
