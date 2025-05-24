public class ConditionalStatementSwitch {
    public static void main(String[] args) {
        ConditionalStatementSwitch cs=new ConditionalStatementSwitch();
        //cs.switchDemo(0); //You are young
        cs.switchDemo(60);//You are an senior citizen

    }
    public void switchDemo(int age){
        switch(age){
            case 18:{
                System.out.println("You are an adult");
                break;
            }
            case 60:{
                System.out.println("You are an senior citizen");
                break;
            }
            default:{
                System.out.println("You are young");
                break;
            }
        }
    }
}
