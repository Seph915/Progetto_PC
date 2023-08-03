public class objCpu {
    private String manufacturer;
    private String partCode;
    private double coreCount;
    private double coreClock;
    private double maxCoreClock;
    private String tdp;
    private String series;
    private String socket;
    private String  integrateGraphics;
    private int  maxMemory ;

    public objCpu(String manufacture, String partCode, double coreCount, double coreClock, double maxCoreClock,
                  String tdp, String series, String socket, String integrateGraphics, int maxMemory) {
        this.manufacturer = manufacturer;
        this.partCode = partCode;
        this.coreCount = coreCount;
        this.coreClock = coreClock;
        this.maxCoreClock = maxCoreClock;
        this.tdp = tdp;
        this.series = series;
        this.socket = socket;
        this.integrateGraphics = integrateGraphics;
        this.maxMemory = maxMemory;
    }

    public String storageDetails() {
        return " your information " + "\n" + "Manufacterer = " + manufacturer + "\n" + "Code Part = " + partCode + "\n" +
                "Core Count = " +coreCount +  "\n" + "Core clock = " + coreClock + "\n" + "Maximum core clock = " + maxCoreClock + "\n" +

                "TDP = " + tdp + "\n" + "Socket = " + socket + "\n" + "Integrated graphics = " + integrateGraphics + "\n" + "Maximum memory = " + maxMemory;

    }

    public String manufacrturer() {
        return manufacrturer();
    }

    public String getPartCode(){
        return partCode ;
    }

    public int getCoreCount() {
        return (int) coreCount;
    }

    public double getCoreClock() {
        return coreClock;
    }

    public double getMaxCoreClock() {
        return maxCoreClock;
    }
}


