package Singleton;

public class Application {
    
    public static void main(String[] args) {
        
        // Marin class에서 UnitPopulation 객체를 생성했다고 가정
        UnitPopulation unit_Marin = UnitPopulation.getInstance();
        // Hydralisk class에서 UnitPopulation 객체를 생성했다고 가정
        UnitPopulation unit_Hydralisk = UnitPopulation.getInstance();
        // HighTemplar class에서 UnitPopulation 객체를 생성했다고 가정
        UnitPopulation unit_HighTemplar = UnitPopulation.getInstance();

        // Marin class에서 UnitPopulation에 인구수 증가를 했다고 가정
        unit_Marin.plusMaxPopulation(1); 
        // Hydralisk class에서 UnitPopulation에 인구수 증가를 했다고 가정
        unit_Hydralisk.plusMaxPopulation(2); 
        // HighTemplar class에서 UnitPopulation에 인구수 증가를 했다고 가정
        unit_HighTemplar.plusMaxPopulation(3); 

        
        UnitPopulation mainView = UnitPopulation.getInstance();
        System.out.println(mainView.getMaxPopulation());

    }

}
