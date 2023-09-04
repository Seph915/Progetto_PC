
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageList {

    ObjStorage samsung870Evo1Tb = new ObjStorage("Samsung", "870 Evo 1TB", "MZ-77E1T0BW", 1000, "SSD", "2.5", "SATA", false);
    ObjStorage westernDigitalBlackSn7702Tb = new ObjStorage("Western Digital", "Black SN770 2TB", "WDS200T3X0E", 2000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    ObjStorage crucialMx5001Tb = new ObjStorage("Crucial", "MX500 1TB", "CT1000MX500SSD1", 1000, "SSD", "2.5", "SATA", false);
    ObjStorage westernDigitalBlackSn850x1Tb = new ObjStorage("Western Digital", "Black SN850X 1TB", "WDS100T2X0E", 1000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    ObjStorage samsung990Pro1Tb = new ObjStorage("Samsung", "990 Pro 1TB", "MZ-V9P1T0BW", 1000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true);
    private Map<ObjStorage> storageListMap=new HashMap<>();

    {
        storageListMap.put(samsung870Evo1Tb);
        storageListMap.put(westernDigitalBlackSn7702Tb);
        storageListMap.put(westernDigitalBlackSn850x1Tb);
        storageListMap.put(crucialMx5001Tb);
        storageListMap.put(samsung990Pro1Tb);
    }

    public ArrayList<ObjStorage> getStorageListArray() {
        return storageListArray;
    }
}