public class Computer {
    private String monitor;
    private String CPU;
    private int memory;
    private int SSD;

    public Computer(){

    }
    public Computer(String monitor, String CPU, int memory, int SSD) {
        this.monitor = monitor;
        this.CPU = CPU;
        this.memory = memory;
        this.SSD = SSD;
    }
    public String getMonitor() {
        return monitor;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getSSD() {
        return SSD;
    }
    public void setSSD(int SSD) {
        this.SSD = SSD;
    }
    @Override
    public String toString() {
        return " [CPU=" + CPU + ", SSD=" + SSD + "GB" + ", memory=" + memory + "GB" + ", monitor=" + monitor + "]";
    }

    
    
}
