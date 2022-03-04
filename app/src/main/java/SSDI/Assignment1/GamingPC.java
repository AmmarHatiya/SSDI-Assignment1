package SSDI.Assignment1;

public class GamingPC {
        /* Inherited Attributes */
        private int StorageVal;
        private String CPUName;
        private String ScreenResolution;
        private int ScreenSize;
        private boolean Portable;
        private String FanName;
    
        /* New Attributes */
        private boolean RGB;
        private int MonitorNum;


        /* Constructor */
        public GamingPC(int StorageVal,
         String CPUName,
         String ScreenResolution,
         int ScreenSize,
         boolean Portable,
         String FanName, boolean RGB, int MonitorNum){

            this.StorageVal = StorageVal;
            this.CPUName= CPUName;
            this.ScreenResolution = ScreenResolution ;
            this.ScreenSize =ScreenSize ;
            this.Portable =Portable ;
            this.FanName = FanName;
            this.RGB =RGB ;
            this.MonitorNum = MonitorNum;

         }
         

    
}
