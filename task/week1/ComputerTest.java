public class ComputerTest {
    public static void main(String[] args) {
        Computer my_computer = new Computer("삼성 모니터", "라이젠", 16 , 1024);
        Computer your_computer = new Computer();

        your_computer.setMonitor("BenQ");
        your_computer.setCPU("인텔");
        your_computer.setMemory(16);
        your_computer.setSSD(250);

        System.out.println("my_computer" + my_computer);
        System.out.println("your_computer" + your_computer);
    }
    
}
