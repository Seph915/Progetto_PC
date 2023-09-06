package src.main.java;

import java.util.ArrayList;

public class StorageList {

    ObjStorage samsung870Evo1Tb =
            new ObjStorage("Samsung", "870 Evo 1TB",
                    "MZ-77E1T0BW", 1000, "SSD",
                    "2.5", "SATA", false);
    ObjStorage westernDigitalBlackSn7702Tb =
            new ObjStorage("Western Digital", "Black SN770 2TB",
                    "WDS200T3X0E", 2000, "SSD",
                    "M.2-2280", "M.2 PCIe 4.0 X4", true);
    ObjStorage crucialMx5001Tb =
            new ObjStorage("Crucial", "MX500 1TB",
                    "CT1000MX500SSD1", 1000, "SSD",
                    "2.5", "SATA", false);
    ObjStorage westernDigitalBlackSn850x1Tb =
            new ObjStorage("Western Digital", "Black SN850X 1TB",
                    "WDS100T2X0E", 1000, "SSD",
                    "M.2-2280", "M.2 PCIe 4.0 X4", true);
    ObjStorage samsung990Pro1Tb =
            new ObjStorage("Samsung", "990 Pro 1TB",
                    "MZ-V9P1T0BW", 1000, "SSD",
                    "M.2-2280", "M.2 PCIe 4.0 X4", true);
    
    ArrayList<ObjStorage> storageList = new ArrayList<>();

    public StorageList() {
        storageList.add(samsung870Evo1Tb);
        storageList.add(westernDigitalBlackSn7702Tb);
        storageList.add(westernDigitalBlackSn850x1Tb);
        storageList.add(crucialMx5001Tb);
        storageList.add(samsung990Pro1Tb);
    }

    public ArrayList<ObjStorage> getStorageList() {
        return storageList;
    }
}