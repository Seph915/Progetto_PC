package src.main.java;

public record Case(String manufacturer,
                   String part,
                   String type,
                   String color,
                   String frontPanelUSB,
                   String motherboardFormFactor,
                   String maximumVideoCardLength,
                   String driveBays,
                   String expansionSlots,
                   String radiatorSupport) {
    
    @Override
    public String toString() {
        return "Case details:\n\n" +
                "Manufacturer:" + manufacturer +
                "\nPart: " + part +
                "\nType: " + type +
                "\nColor: " + color +
                "\nFront panel USB: " + frontPanelUSB +
                "\nMotherboard form factor: " + motherboardFormFactor +
                "\nMaximum video card length: " + maximumVideoCardLength +
                "\nDrive bays: " + driveBays +
                "\nExpansion slots: " + expansionSlots +
                "\nRadiator support: " + radiatorSupport;
    }
}