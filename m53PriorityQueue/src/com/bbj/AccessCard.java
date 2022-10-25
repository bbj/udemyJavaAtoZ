package com.bbj;

/*
    In order to define the Priority of Priority Queue,
    we need to implements Comparable<AccessCard> to
    compare elements priority.

    Comparable<AccessCard> => method compareTo(AccessCard)
 */
public class AccessCard implements Comparable<AccessCard> {

    private String name;
    private int id;

    public AccessCard(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AccessCard{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(AccessCard o) {
        //return Integer.compare(this.id, o.getId());
        // the queue will poll smaller id first

        // if return -Integer.compare(this.id, o.getId());
        // it will poll highest first

        // if we want alphabetic order of name property
        return this.name.compareTo(o.getName());
        // this will poll 'card1' first
    }
}
