public class ObjStorage {
    private String manufacture;
    private String model;
    private String serial;
    private int capacity;
    private String type;
    private String formFactor;
    private String interfaceconnector;
    private boolean isNvme;

    public ObjStorage(String manufacture, String model, String serial, int capacity, String type, String formFactor, String interfaceconnector, boolean isNvme) {
        this.manufacture = manufacture;
        this.model = model;
        this.serial = serial;
        this.capacity = capacity;
        this.type = type;
        this.formFactor = formFactor;
        this.interfaceconnector = interfaceconnector;
        this.isNvme = isNvme;
    }

    private String isNvmeString() {
        if (isNvme == true) {
            return "Yes";
        } else return "No";
    }

    public String storageDetails() {
        return manufacture + " " + model + "\n" + serial + "\nCapacità: " + capacity + " gb" + "\nFormato: " + formFactor + " " + interfaceconnector + "\nNVME: " + isNvmeString( );
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getInterfaceconnector() {
        return interfaceconnector;
    }

    public boolean getIsNvme() {
        return isNvme;
    }
}
