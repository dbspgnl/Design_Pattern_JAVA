package Builder;

public class Application {

    public static void main(String[] args) {
        
        // 체이닝 형식
        Computer computer = ComputerBuilder
            .start()
            .setCpu("i7")
            .setRam("8g")
            .build();
        System.out.println(computer.toString());

        // 생성 & 방법 분리
        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBluePrint());
        factory.make();
        Computer computer2 = factory.getComputer();
        System.out.println(computer2.toString());

    }
    
}
