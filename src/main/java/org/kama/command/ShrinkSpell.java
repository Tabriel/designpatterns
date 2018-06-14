package org.kama.command;

public class ShrinkSpell implements Command {

    private Target target;
    private Size previousState;

    @Override
    public void execute(Target target) {
        this.target = target;
        this.previousState = target.getSize();
        redo();
    }

    @Override
    public void undo() {
        if (target != null) {
            target.setSize(previousState);
        }
    }

    @Override
    public void redo() {
        if (target != null) {
            target.setSize(Size.SMALL);
        }
    }
}
