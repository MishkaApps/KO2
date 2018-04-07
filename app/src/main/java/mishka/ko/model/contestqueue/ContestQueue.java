package mishka.ko.model.contestqueue;

import android.content.Context;
import android.support.annotation.NonNull;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import mishka.ko.model.Contest;
import mishka.ko.model.ContestData;
import mishka.ko.model.contestqueue.element.ContestIdElement;
import mishka.ko.model.contestqueue.element.ContestQueueElement;

public abstract class ContestQueue {
    private LinkedList<ContestQueueElement> queue;
    private Iterator<ContestQueueElement> iterator;
    protected ContestData contestData;

    public ContestQueue(ContestData contestData) {
        queue = new LinkedList<>();
        this.contestData = contestData;
        addElement(new ContestIdElement(contestData));
        addConcreteElements();

        iterator = queue.iterator();
    }

    protected abstract void addConcreteElements();

    protected void addElement(ContestQueueElement element) {
        queue.add(element);
    }

    public ContestQueueElement next() {
        if (iterator.hasNext())
            return iterator.next();
        else {
            iterator = queue.iterator();
            iterator.next();
            return iterator.next();
        }
    }

    public List<ContestQueueElement> getElements() {
        return queue;
    }
}
