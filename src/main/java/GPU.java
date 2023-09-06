package src.main.java;

public record GPU(String manufacturer,
                  String part,
                  String chipset,
                  byte memorySize,
                  String memoryType,
                  short coreClock,
                  short boostClock,
                  int memoryClock,
                  String interfaceType,
                  short length,
                  short tdpW) {
    
    @Override
    public String toString() {
        return "GPU:\n\n" +
                "Manufacturer: " + manufacturer +
                "\nPart: " + part +
                "\nChipset: " + chipset +
                "\nMemory size: " + memorySize + "GB" +
                "\nMemory type: " + memoryType +
                "\nCore clock: " + coreClock + "MHz" +
                "\nBoost clock: " + boostClock + "MHz" +
                "\nEffective memory clock: " + memoryClock + "MHz" +
                "\nInterface type: " + interfaceType +
                "\nLength: " + length + "mm" +
                "\nTDP: " + tdpW + "W";
    }
}
