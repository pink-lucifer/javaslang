/*     / \____  _    _  ____   ______  / \ ____  __    _______
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  //  /\__\   JΛVΛSLΛNG
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/ \ /__\ \   Copyright 2014-2017 Javaslang, http://javaslang.io
 * /___/\_/  \_/\____/\_/  \_/\__\/__/\__\_/  \_//  \__/\_____/   Licensed under the Apache License, Version 2.0
 */
package javaslang.collection;

/**
 * An Int wrapper that implements equality by comparing int values modulo 2.
 * <br>
 * Examples:
 * <ul>
 * <li>IntMod2(0) equals IntMod2(2) equals IntMod2(4) ...</li>
 * <li>IntMod2(1) equals IntMod2(3) equals IntMod2(5) ...</li>
 * <li>IntMod2(0) &lt; IntMod2(1)</li>
 * <li>IntMod2(_even_int_) &lt; IntMod2(_odd_int_)</li>
 * </ul>
 */
final class IntMod2 implements Comparable<IntMod2> {

    private final int val;

    IntMod2(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(IntMod2 that) {
        return this.hashCode() - that.hashCode();
    }

    @Override
    public boolean equals(Object that) {
        return that == this || (that instanceof IntMod2 && this.hashCode() == that.hashCode());
    }

    @Override
    public int hashCode() {
        return val % 2;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

}
