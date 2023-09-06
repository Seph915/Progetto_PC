package src.main.java;

public record ObjCpuCooler(String manufacture, String model, String partId,
                           int minRPM, int maxRPM, int noiseMin,
                           int noiseMax, String cpuSocket, boolean isWaterCooled) {
    @Override
    public String toString() {
        return "CpuCooler:\n\n" +
                "Manufacture: " + manufacture +
                "\nModel: " + model +
                "\nPart: " + partId +
                "\nMin RPM: " + minRPM + "RPM" +
                "\nMax RPM: " + maxRPM + "RPM" +
                "\nNoise Min: " + noiseMin + "dB" +
                "\nNoiseMax: " + noiseMax + "dB" +
                "\nCPU socket: " + cpuSocket +
                "\nWater cooler: " + isWaterCooled;
    }
}
