
public class GPU {

    private String manufacturer;
    private String part;
    private String chipset;
    private String memory;
    private String memoryType;
    private int coreClock;
    private int boostClock;
    private int effectiveMemoryClock;
    private String interfaceType;
    private int length;
    private int tdp;

    // Costruttore
    public GPU(String manufacturer, String part, String chipset, String memory, String memoryType, int coreClock, int boostClock, int effectiveMemoryClock, String interfaceType, int length, int tdp) {
        this.manufacturer = manufacturer;
        this.part = part;
        this.chipset = chipset;
        this.memory = memory;
        this.memoryType = memoryType;
        this.coreClock = coreClock;
        this.boostClock = boostClock;
        this.effectiveMemoryClock = effectiveMemoryClock;
        this.interfaceType = interfaceType;
        this.length = length;
        this.tdp = tdp;
    }

    // Metodi getter per accedere ai dati
    public String getManufacturer() {
        return manufacturer;
    }

    public String getPart() {
        return part;
    }

    public String getChipset() {
        return chipset;
    }

    public String getMemory() {
        return memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getCoreClock() {
        return coreClock;
    }

    public int getBoostClock() {
        return boostClock;
    }

    public int getEffectiveMemoryClock() {
        return effectiveMemoryClock;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public int getLength() {
        return length;
    }

    public int getTDP() {
        return tdp;
    }
}
