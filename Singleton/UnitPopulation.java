package Singleton;

public class UnitPopulation {
    
    static private UnitPopulation instance;

    private int maxPopulation;

    private UnitPopulation(){
        maxPopulation = 0;
    }
    
    public static UnitPopulation getInstance(){
        
        if(instance == null){
            instance = new UnitPopulation();
        }
        return instance;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public void setMaxPopulation(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public void plusMaxPopulation(int maxPopulation) {
        this.maxPopulation += maxPopulation;
    }

    public void minusMaxPopulation(int maxPopulation) {
        this.maxPopulation += maxPopulation;
    }

}
