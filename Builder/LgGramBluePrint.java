package Builder;

public class LgGramBluePrint extends BluePrint{

    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default","default","default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i5");
    }

    @Override
    public void setRam() {
        computer.setRam("4g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256gb");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
    
}
