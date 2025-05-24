public class ConditionalStatemntIfElseIfElse2 {
    public static void main(String[] args) {

        //scenario-here we accept age as 60.when if condition is not satisfied & else if is not satisfied ,
        // After that else is satisfied and print the statement
        ConditionalStatemntIfElseIfElse2 cs3=new ConditionalStatemntIfElseIfElse2();
        String result=cs3.getAgeCategory(60);
        System.out.println(result); //Senior Citizen

    }
    public String getAgeCategory(int age){
        String ageCategory=null;
        if((age>0)&&(age<18)){
            ageCategory="child";
            System.out.println("Running if block");
        }
        else if((age>=18)&&(age<60)){
            ageCategory="adult";
            System.out.println("Running else if");
        }
        else{
            ageCategory="Senior Citizen";
        }
        return ageCategory;
    }
}
