package upcastingdowncastingoverloadingoverriding;

public class Calculator {
    public int addition(int a, int b){ //overridden method

        return a+b;
    }
    public int addition() {
        return 0;
    }
    public int addition(float a, int b){
        int c=(int)(a+b); //convert float to int
        return c;
    }
}
