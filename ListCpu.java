
import java.util.ArrayList;

    public class ListCpu {
        private ArrayList<objCpu> cpuListArray;
        objCpu ryzen7 = new objCpu("Amd", "100-100000910WOF", 8 , 4.2 , 5
                , "120 W ", "AMD Ryzen 7" ,"AM5" , "Readon ", 128);
        objCpu i9 = new objCpu("Intel", " BX806849900K", 8, 3.6,5,
                "95W" ,"Intel Core i9" , "LGA1151" , "intel UHD", 128);
        objCpu  i7 = new objCpu("Intel", "BX8071512700", 12, 2.5,4.9,
                "65W","Intel core i7","Am5","intel UHD",128);

        public ListCpu() {
            cpuListArray.add(ryzen7);
            cpuListArray.add(i9);
            cpuListArray.add(i7);
            //cpuListArray.add();
            //cpuListArray.add();
        }

        public ArrayList<objCpu> getStorageListArray() {
            return cpuListArray;
        }
    }

}
