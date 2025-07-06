package overloadingsingleclass;
//overloading-multiple method with same name  but argument in every method should be different
public class Calculator {

    public int addition(int a, int b){

        return a+b;
    }
    public int addition()
    {
        return 0;
    }
    public int addition(float a, float b){
        int c=(int)(a+b); //convert float to int
        return c;
    }
    private float addition(float a,int b, int c){
        return a+b+c;
    }

}
