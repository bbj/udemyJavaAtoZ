package com.bbj.app;

/**
 * Nested Interface in Interface
 *
 * Nested interfaces are static by default. You don't have to mark them static explicitly as it would be redundant.
 * Nested interfaces :
 *     - declared inside class: can take any access modifier,
 *     - declared inside interface: is public implicitly
 */

public interface OuterInterface {

    public void messageOutside();

    //nested interface: static by default
    public interface NestedInterface {
        public void messageInside();
    }
}
