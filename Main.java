

public class Main {
    public static void main(String[] args) {
        objCpu ryzen7 = new objCpu("Amd", "100-100000910WOF", 8 , 4.2 , 5
        , "120 W ", "AMD Ryzen 7" ,"AM5" , "Readon ", 128);
        printRyzen (ryzen7);


        objCpu i9 = new objCpu("Intel", " BX806849900K", 8, 3.6,5,
                "95W" ,"Intel Core i9" , "LGA1151" , "intel UHD", 128);
         printI9(i9);
    }

static void printRyzen(objCpu objCpu){
System.out.println(objCpu.storageDetails() );
}


static void  printI9(objCpu objCpu){
    System.out.println(objCpu.storageDetails());}
}