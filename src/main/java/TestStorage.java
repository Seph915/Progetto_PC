import java.util.ArrayList;
import java.util.Arrays;

public class TestStorage {
    public static void main(String[] args) {
        StorageList storageList = new StorageList();
        ArrayList<ObjStorage> storageListArray = storageList.getStorageList();
        for (ObjStorage storage : storageListArray) {
            if (storage.manufacture().equals("Western Digital")) {
                System.out.println(storage.toString());
            }
        }
    }
}

