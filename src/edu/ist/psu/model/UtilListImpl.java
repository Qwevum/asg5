package edu.ist.psu.model;

import java.util.*;

/**
 * This class implements the Splittable List interface and contains all the logic for the methods
 * which make the application function
 */

public class UtilListImpl<E> implements ISplittableList<E> {
    // "propagating" this   ^ generic E up into the       ^ interface

    private List<E> left = new ArrayList<>() /* either new ArrayList<>() OR new LinkedList<>() .. decide carefully */;
    private List<E> right = new ArrayList<>() /* either new ArrayList<>() OR new LinkedList<>() .. decide carefully */;

    // HINT: update this map whenever additions and removals are made to this.left or this.right.
    //       Then, when someone calls countOf(x), you can just lookup x in the map below and return
    //       the int count that comes back.
    private Map<E, Integer> countingMap = new HashMap<>();

    // (no constructor needed... unless you do the optional challenge)
    // in UtilListImpl.java

    // TODO: method implementations go here...

    @Override
    public void addToRightAtFront(E e) { //O(1)
        right.add(0, e);
    }

    @Override
    public E removeFromRightAtFront() { //O(1)
        if (right.isEmpty()){
            throw new NoSuchElementException("Removing values from an empty list");
        }

        right.remove(0);
        return right.get(0);
    }

    @Override
    public void moveToVeryBeginning() { //O(n)
        right.addAll(left);
        left.clear();
    }

    @Override
    public int countOf(E e) { //O(n)
        int count = 0;

        for (int i = 0; i < left.size(); i ++){
            if (left.get(i).equals(e)){
                count++;
            }
        }

        for (int i = 0; i < right.size(); i ++){
            if (right.get(i).equals(e)){
                count++;
            }
        }
        return count;
    }

    @Override
    public void moveForward() { // O(1)
        if (right.isEmpty()){
            throw new IllegalStateException("Right list is empty");
        }

        left.add(left.size(), right.get(0));
        right.remove(0);
    }

    @Override
    public int leftLength() { //O(1)
        return left.size();
    }

    @Override
    public int rightLength() { //O(1)
        return right.size();
    }

    @Override
    public void clear() { //O(1)
        right.clear();
        left.clear();
    }

    // here's a toString that renders the splittable list..

    @Override public String toString() { // O(n)
        StringBuilder sb = new StringBuilder("<");
        boolean first = true;
        for (E e : left) { // O(n) -- all calls to append(..) are O(1)
            // assuming you're just appending a fixed number of chars
            if (first) {
                sb.append(e);
                first = false;
            } else {
                sb.append(", ").append(e);
            }
        }
        sb.append("><");
        first = true;
        for (E e : right) { // O(n)
            if (first) {
                sb.append(e);
                first = false;
            } else {
                sb.append(", ").append(e);
            }
        }
        return sb.append(">").toString();
    }


}
