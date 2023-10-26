package edu.hw3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Task8<T> implements Iterator<T> {
    private final List<T> elements;
    private int currentIndex;

    public Task8(Collection<T> collection) {
        this.elements = List.copyOf(collection);
        this.currentIndex = elements.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements.get(currentIndex--);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Iterator<Integer> backwardIterator = new Task8<>(list);

        while (backwardIterator.hasNext()) {
            System.out.println(backwardIterator.next());
        }
    }
}
