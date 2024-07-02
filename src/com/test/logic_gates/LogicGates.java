package com.test.logic_gates;

public class LogicGates {

    public boolean and(boolean input1, boolean input2) {
        return input1 && input2;
    }

    public boolean or(boolean input1, boolean input2) {
        return input1 || input2;
    }

    public boolean not(boolean input) {
        return !input;
    }

    public boolean nand(boolean input1, boolean input2) {
        return !(input1 && input2);
    }

    public boolean nor(boolean input1, boolean input2) {
        return !(input1 || input2);
    }

    public boolean xor(boolean input1, boolean input2) {
        return input1 ^ input2;  // (input1 && !input2) || (!input1 && input2);
    }

    public boolean xnor(boolean input1, boolean input2) {
        return !(input1 ^ input2);
    }

    public static void main(String[] args) {
        LogicGates logicGates = new LogicGates();

        System.out.println("\nAND Gate:");
        System.out.println("true AND true = " + logicGates.and(true, true)); // true
        System.out.println("true AND false = " + logicGates.and(true, false)); // false
        System.out.println("false AND false = " + logicGates.and(false, false)); // false

        System.out.println("\nOR Gate:");
        System.out.println("true OR true = " + logicGates.or(true, true)); // true
        System.out.println("true OR false = " + logicGates.or(true, false)); // true
        System.out.println("false OR false = " + logicGates.or(false, false)); // false

        System.out.println("\nNOT Gate:");
        System.out.println("NOT true = " + logicGates.not(true)); // false
        System.out.println("NOT false = " + logicGates.not(false)); // true

        System.out.println("\nNAND Gate:");
        System.out.println("true NAND true = " + logicGates.nand(true, true)); // false
        System.out.println("true NAND false = " + logicGates.nand(true, false)); // true
        System.out.println("false NAND false = " + logicGates.nand(false, false)); // true

        System.out.println("\nNOR Gate:");
        System.out.println("true NOR true = " + logicGates.nor(true, true)); // false
        System.out.println("true NOR false = " + logicGates.nor(true, false)); // false
        System.out.println("false NOR false = " + logicGates.nor(false, false)); // true

        System.out.println("\nXOR Gate:");
        System.out.println("true XOR true = " + logicGates.xor(true, true)); // false
        System.out.println("true XOR false = " + logicGates.xor(true, false)); // true
        System.out.println("false XOR false = " + logicGates.xor(false, false)); // false

        System.out.println("\nXNOR Gate:");
        System.out.println("true XNOR true = " + logicGates.xnor(true, true)); // true
        System.out.println("true XNOR false = " + logicGates.xnor(true, false)); // false
        System.out.println("false XNOR false = " + logicGates.xnor(false, false)); // true
    }
}
