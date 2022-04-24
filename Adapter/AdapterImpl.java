package Adapter;

public class AdapterImpl implements Adapter{

    @Override
    public Double twiceOf(Float num) {
        return Math.twoTime(num);
    }

    @Override
    public Double halfOf(Float num) {
        // return Math.half(num);
        return Math.half(num.doubleValue());
    }
    
}
