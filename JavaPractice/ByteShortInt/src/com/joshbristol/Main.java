package com.joshbristol;

public class MegaBytesConverter {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int oneMegaByte = 1024;
        int megaBytes = kiloBytes / oneMegaByte;
        int remaining = megaBytes % oneMegaByte;

        System.out.println(kiloBytes + " KB=" + megaBytes + " MB and "+remaining+ " KB");
    }
}
