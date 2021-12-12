/**
 * Write a description of class CeilingFan here.
 * Sehaj Mundi
 * 3117464
 */
public class CeilingFanMediumCommand extends Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:    ceilingFan.high(); break;
            case CeilingFan.MEDIUM:  ceilingFan.medium(); break;
            case CeilingFan.LOW:     ceilingFan.low(); break;
            default:                 ceilingFan.off(); break;
        }
    }
}
