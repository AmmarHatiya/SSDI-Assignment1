/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SSDI.Assignment1;



public class App {


    public static void main(String[] args) {
        /*  */
        GamingPC homesetup = new GamingPCBuilder().setCPUName("AMD Ryzen 5")
        .setFanName("Corsair LL120").setPortable(true)
        .setMonitorNum(2).setRGB(true)
        .setScreenResolution("1920 x 1080").setScreenSize(52)
        .setStorageVal(500).createGamingPC();
        System.out.println("MY GAMING PC OBJECT: " + homesetup + 
        ". It has a " + homesetup.printcpu() + " CPU." );
    }
}
