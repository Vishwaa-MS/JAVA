public class PersonalComputer extends Product{
  private ComputerCase computerCase;
  private Monitor monitor;
  private MotherBoard motherBoard;

  public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
                          MotherBoard motherBoard) {
    super(model, manufacturer);
    this.computerCase = computerCase;
    this.monitor = monitor;
    this.motherBoard = motherBoard;
  }
  public void drwLogo(){
    monitor.drawPixelAt(100,50,"Yellow");
  }
  public void powerUp(){
    computerCase.pressPowerButton();
    drwLogo();
  }
//  public ComputerCase getComputerCase() {
//    return computerCase;
//  }
//
//  public Monitor getMonitor() {
//    return monitor;
//  }
//
//  public MotherBoard getMotherBoard() {
//    return motherBoard;
//  }
}
