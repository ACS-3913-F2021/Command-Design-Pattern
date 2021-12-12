/**
 * Write a description of class CeilingFan here.
 * Sehaj Mundi
 * 3117464
 */
public class HottubOnCommand extends Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
    }

    public void undo() {
        hottub.off();
    }
}
