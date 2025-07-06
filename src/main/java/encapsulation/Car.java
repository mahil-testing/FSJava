package encapsulation;

public class Car {
    private String engineName;

    public void setEngineName(String engineName){
        if(engineName.equalsIgnoreCase("cycling")){
            System.out.println("you are not meant to use car, stick to cycling");
        }
        else{
            this.engineName=engineName;
        }
    }
    public String getEngineName(){
        return engineName;
    }
}
