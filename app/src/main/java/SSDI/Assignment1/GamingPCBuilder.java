package SSDI.Assignment1;

public class GamingPCBuilder implements Builder{
    /* Inherited Attributes */
    private int StorageVal;
    private String CPUName;
    private int ScreenResolution;
    private int ScreenSize;
    private boolean Portable;
    private String FanName;

    /* New Attributes */
    private boolean RGB;
    private int MonitorNum;
    public GamingPCBuilder(){
    
    } 
    @Override
    public GamingPCBuilder setFanName(String FanName){
        this.FanName = FanName;
        return this;
    }

    @Override
    public GamingPCBuilder setCPUName(String CPUName){
        this.CPUName = CPUName;
        return this;
    }
    @Override
    public GamingPCBuilder setStorageVal(int StorageVal){
        this.StorageVal = StorageVal;
        return this;
    }
    @Override
    public GamingPCBuilder setScreenSize(int ScreenSize){
        this.ScreenSize = ScreenSize;
        return this;
    }
    @Override
    public GamingPCBuilder setScreenResolution(int ScreenResolution){
        this.ScreenResolution = ScreenResolution;
        return this;
    }
    @Override
    public GamingPCBuilder setPortable(boolean Portable){
        this.Portable = Portable;
        return this;
    }
    
    public GamingPC createGamingPC(){
        return new GamingPC(StorageVal, CPUName, ScreenResolution, ScreenSize, Portable, FanName, RGB, MonitorNum);
    }





  
}
