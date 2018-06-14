package org.kama.command;

public class InvisibilitySpell implements Command {

    private Target target;

    @Override
    public void execute(Target target) {

        this.target = target;
        redo();
    }

    @Override
    public void undo() {

        if (target != null) {
            target.setVisibility(Visibility.VISIBILE);
        }
    }

    @Override
    public void redo() {

        if (target != null) {
            target.setVisibility(Visibility.INVISIBLE);
        }
    }
}
