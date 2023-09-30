public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerLevel + tonerAmount;
        if (tempAmount>100 || tempAmount<0){
            return -1;
        }
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pagesToPrint){
        int jobPages = (duplex) ? (pagesToPrint/2) + (pagesToPrint % 2) : pagesToPrint;
        pagesPrinted+=jobPages;
        return jobPages;
    }
}
