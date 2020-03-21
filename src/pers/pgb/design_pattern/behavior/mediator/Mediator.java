package pers.pgb.design_pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }

    }

    public void reply(Colleague colleague) {
        for (Colleague colleague1 : colleagues) {
            if (!colleague.equals(colleague1)) {
                colleague.receive();
            }
        }
    }
}
