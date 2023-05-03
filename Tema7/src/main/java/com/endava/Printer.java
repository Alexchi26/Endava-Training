package com.endava;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    private int pagesToPrint;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel < -1 && tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;

        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {

        if (tonerAmount < 0 && tonerAmount > 100) {
            return -1;
        } else if (tonerLevel + tonerAmount > 100) {
            return -1;
        } else {
            return tonerLevel + tonerAmount;
        }
    }

    public int printPages(int pages) {

        pagesToPrint  = pages;

        if (duplex) {
            pagesToPrint = pagesToPrint / 2;
        }

        pagesPrinted = pagesPrinted + pagesToPrint;

        return  pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
