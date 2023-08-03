

public class Main {
    public static void main(String[] args) {
        objCpu ryzen7 = new objCpu("Amd", "100-100000910WOF", 8 , 4.2 , 5
        , "120 W ", "AMD Ryzen 7" ,"AM5" , "Readon ", 128);
        printRyzen (ryzen7);

    }

static void printRyzen(objCpu objCpu){
System.out.println(objCpu.storageDetails() );
}
}
