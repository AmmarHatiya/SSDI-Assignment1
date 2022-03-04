package SSDI.Assignment1;

public interface Builder {
    /* Common attributes in all the Computers */
    Builder setFanName(String FanName);

    Builder setCPUName(String CPUName);

    Builder setStorageVal(int StorageVal);

    Builder setScreenSize(int ScreenSize);

    Builder setScreenResolution(String ScreenResolution);

    Builder setPortable(boolean Portable);


    
}
