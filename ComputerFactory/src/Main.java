import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2203", "Dell", "240V");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-240", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2203", "Dell", theCase, theMonitor, theMotherBoard);
//        thePC.getComputerCase().pressPowerButton();
//        thePC.getMotherBoard().loadProgram("Windows OS");
//        thePC.getMonitor().drawPixelAt(10,10,"red");
        thePC.powerUp();
    }
}