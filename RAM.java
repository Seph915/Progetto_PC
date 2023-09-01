public class RAM {
    private String serialPart;
    private String ddrSpeed;
    private String ddrGen;
    private String formFactor;//collegamento pin ovvero tipologia desktop o mobile
    private int moduleCount;
    private int capacityGb;
    private int casLatency;
    private double voltage;
    private String timing;
    
    public String getSerialPart() {
        return serialPart;
    }
    
    public void setSerialPart(String serialPart) {
        this.serialPart = serialPart;
    }
    
    public String getDdrSpeed() {
        return ddrSpeed;
    }
    
    public void setDdrSpeed(String ddrSpeed) {
        this.ddrSpeed = ddrSpeed;
    }
    
    public String getDdrGen() {
        return ddrGen;
    }
    
    public void setDdrGen(String ddrGen) {
        this.ddrGen = ddrGen;
    }
    
    public String getFormFactor() {
        return formFactor;
    }
    
    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
    
    public int getModuleCount() {
        return moduleCount;
    }
    
    public void setModuleCount(int moduleCount) {
        this.moduleCount = moduleCount;
    }
    
    public int getCapacityGb() {
        return capacityGb;
    }
    
    public void setCapacityGb(int capacityGb) {
        this.capacityGb = capacityGb;
    }
    
    public int getCasLatency() {
        return casLatency;
    }
    
    public void setCasLatency(int casLatency) {
        this.casLatency = casLatency;
    }
    
    public double getVoltage() {
        return voltage;
    }
    
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
    
    public String getTiming() {
        return timing;
    }
    
    public void setTiming(String timing) {
        this.timing = timing;
    }
    
    public RAM(String partNumber, String ddrSpeed, String ddrGen,
               String formFactor,
               int moduleCount, int capacityGb, int casLatency, double voltage, String timing) {
        this.serialPart = partNumber;
        this.ddrSpeed = ddrSpeed;
        this.ddrGen = ddrGen;
        this.formFactor = formFactor;
        this.moduleCount = moduleCount;
        this.capacityGb = capacityGb;
        this.casLatency = casLatency;
        this.voltage = voltage;
        this.timing = timing;
    }
    
    @Override
    public String toString() {
        return "RAM details:\n\nPart: " + serialPart +
                "\nSpeed: " + ddrSpeed + "MHz" +
                "\nGen: " + ddrGen +
                "\nFactor: " + formFactor +
                "\nModule count: x" + moduleCount +
                "\nCapacity: " + capacityGb + "GB" +
                "\nLatency: " + casLatency +
                "\nVoltage: " + voltage + "V" +
                "\nTiming: " + timing;
    }
}
