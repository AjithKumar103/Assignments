package inheritance.composition;

public class PersonalComputer extends Product{
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor, Motherboard motherboard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

   private void displayLogo(){
       monitor.drawPixelAt(1200,50,"yellow");
   }
   public void powerUp(){
       computerCase.pressPowerButton();
       displayLogo();
   }
}
