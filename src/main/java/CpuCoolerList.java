import java.util.ArrayList;
public class CpuCoolerList {
    ObjCpuCooler coolerMasterHyper212Rbg = new ObjCpuCooler("CoolerMaster", "Hyper 212 RGB", "CM-HYPER212RGB", (short) 600, (short) 2000, (byte) 10, (byte) 30, new String[]{"LGA1200", "AM4"}, false);
    ObjCpuCooler noctuaNHD15 = new ObjCpuCooler("Noctua", "NH-D15", "NOCT-NHD15", (short) 300, (short) 1500, (byte) 15, (byte) 25, new String[]{"LGA1151", "AM4"}, false);
    ObjCpuCooler corsairIcueH150i = new ObjCpuCooler("Corsair", "iCUE H150i", "COR-H150i", (short) 800, (short) 2400, (byte) 20, (byte) 40, new String[]{"LGA1200", "AM4"}, true);



        ArrayList<ObjCpuCooler> CpuCoolerList = new ArrayList<>();

        public CpuCoolerList() {
            CpuCoolerList.add(coolerMasterHyper212Rbg);
            CpuCoolerList.add(noctuaNHD15);
            CpuCoolerList.add(corsairIcueH150i);
        }

        public ArrayList<ObjCpuCooler> getStorageList() {
            return CpuCoolerList;
        }
    }
