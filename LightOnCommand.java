/**
 * Write a description of class CeilingFan here.
 * Sehaj Mundi
 * 3117464
 */
public class LightOnCommand extends Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
    
    public void undo()
    {
        light.off();
    }
}
