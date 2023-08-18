
import java.util.ArrayList;

public class StorageList {
    private ArrayList<ObjStorage> storageList;

    public StorageList() {
        storageList = new ArrayList<>();
        storageList.add(new ObjStorage("Samsung", "870 Evo 1TB", "MZ-77E1T0BW", 1000, "SSD", "2.5", "SATA", false));
        storageList.add(new ObjStorage("Western Digital", "Black SN770 2TB", "WDS200T3X0E", 2000, "SSD", "M.2-2280", "M.2 PCIe 4.0 X4", true));
        storageList.add(new ObjStorage("Crucial", "MX500 1TB", "CT1000MX500SSD1", 1000, "SSD", "2.5", "SATA", false));
        storageList.add(new ObjStorage("Western Digital","Black SN850X 1TB","WDS100T2X0E",1000,"SSD","M.2-2280","M.2 PCIe 4.0 X4",true));
        storageList.add(new ObjStorage("Samsung","990 Pro 1TB","MZ-V9P1T0BW",1000,"SSD","M.2-2280","M.2 PCIe 4.0 X4",true));
    }

    public ArrayList<ObjStorage> getStorageList() {
        return storageList;
    }
}