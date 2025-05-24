public class ConditionalStatemntIfElse {
    public static void main(String[] args) {

        //scenario-when if condition is not satisfied then it go to else condition & after that
        //  it go to return, & it return agecategory to result variable & print that
        ConditionalStatemntIfElse cs3=new ConditionalStatemntIfElse();
        String result=cs3.getAgeCategory(19);
        System.out.println(result); //Please learn more about ages
                                    // null
    }
    public String getAgeCategory(int age){
        String ageCategory=null;
        if((age>0)&&(age<18)){
            ageCategory="child";
        }
        else{
            System.out.println("Please learn more about ages");
        }
        return ageCategory;
    }
}
