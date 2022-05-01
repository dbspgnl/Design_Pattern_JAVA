package Builder;

public class ComputerBuilder {

    private Computer computer;

    public ComputerBuilder() {
        computer = new Computer("default", "default", "default");
    }

    public ComputerBuilder(Computer computer) {
        computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public static ComputerBuilder startWithCpu(String cpu) {
        ComputerBuilder build = new ComputerBuilder();
        build.computer.setCpu(cpu);
        return build;
    }

    public ComputerBuilder setCpu(String cpu){
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram){
        computer.setRam(ram);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
    
}
