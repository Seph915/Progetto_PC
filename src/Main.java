public class Main {
    public static void main(String[] args) {
        StorageList storageList = new StorageList();
        for (ObjStorage storage : storageList.getStorageList()) {
                System.out.println(storage.storageDetails());
            }
    }
}

