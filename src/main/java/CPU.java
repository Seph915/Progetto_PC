package src.main.java;

public record CPU(String manufacturer,
                  String part,
                  int coreCount,
                  String coreClock,
                  String boostClock,
                  int tdpW,
                  String series,
                  String socket,
                  String integratedGraphics,
                  String maxMemory) {
    
    @Override
    public String toString() {
        return "GPU:\n\n" +
                "Manufacturer: " + manufacturer +
                "\nPart: " + part +
                "\nNumber of core: " + coreCount +
                "\nPerformance Core Clock: " + coreClock + "GHz" +
                "\nPerformance Boost Clock: " + boostClock + "GHz" +
                "\nTDP: " + tdpW + "W" +
                "\nSeries: " + series +
                "\nSocket: " + socket +
                "\nIntegrated graphics: " + integratedGraphics +
                "\nMax memory: " + maxMemory + "GB";
    }
}
