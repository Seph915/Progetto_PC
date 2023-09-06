import java.util.ArrayList;
import java.util.List;
public class GPUManager {

    public static List<GPU> createGPUs() {
        List<GPU> gpuList = new ArrayList<>();

        gpuList.add(new GPU("NVIDIA", "RTX 3080", "GA102", "10GB", "GDDR6X", 1440, 1710, 19000, "PCIe 4.0 x16", 285, 320));
        gpuList.add(new GPU("AMD", "RX 6800 XT", "Navi 21", "16GB", "GDDR6", 2015, 2250, 16000, "PCIe 4.0 x16", 267, 300));
        gpuList.add(new GPU("NVIDIA", "GTX 1660 Super", "TU116", "6GB", "GDDR5", 1530, 1785, 14000, "PCIe 3.0 x16", 228, 125));

        return gpuList;
    }
}
