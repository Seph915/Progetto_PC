package src.main.java;

import java.util.ArrayList;

public class TestStorage {
    public static void main(String[] args) {
        StorageList storageList = new StorageList();
        
        ArrayList<ObjStorage> storageListArray = storageList.getStorageList();
        for (ObjStorage storage : storageListArray) {
            if (storage.manufacture().equals("Western Digital")) {
                System.out.println(storage);
            }
        }
    }
}

