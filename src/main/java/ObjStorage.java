package src.main.java;

import java.util.Objects;

public record ObjStorage(String manufacture, String model, String serial,
                         int capacity, String type, String formFactor,
                         String interfaceConnector, boolean isNvme) {
    @Override
    public String toString() {
        return "Storage:\n\n" +
                "Manufacture: " + manufacture +
                "\nModel: " + model +
                "\nSerial: " + serial +
                "\nCapacity: " + capacity +
                "\nType: " + type +
                "\nForm factor: " + formFactor +
                "\nInterface connector: " + interfaceConnector +
                "\nIs Nvme: " + isNvme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjStorage that)) return false;
        return capacity == that.capacity
                && isNvme() == that.isNvme()
                && Objects.equals(manufacture, that.manufacture)
                && Objects.equals(model, that.model) && Objects.equals(serial, that.serial)
                && Objects.equals(type, that.type) && Objects.equals(formFactor, that.formFactor)
                && Objects.equals(interfaceConnector, that.interfaceConnector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacture, model, serial,
                capacity, type, formFactor, interfaceConnector, isNvme());
    }
}