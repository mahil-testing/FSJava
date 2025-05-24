public class ConditionalStatemntIfElseIfElse {
    public static void main(String[] args) {

        //scenario-when if condition is not satisfied & else if is satisfied , After that all conditional will get skip
        ConditionalStatemntIfElseIfElse cs3=new ConditionalStatemntIfElseIfElse();
        String result=cs3.getAgeCategory(19);
        System.out.println(result); //Running else if
                                    // adult
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
            System.out.println("Please learn more about ages");
        }
        return ageCategory;
    }
}
