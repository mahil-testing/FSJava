public class ConditionalStatementIf {
    public static void main(String[] args) {
        //Program- someone provide me age as input, based on input i have to print the o/p
        //scenario- when if condition is satisfied then go inside it & go to return statement
        //& return statement go to that result variable & print child
        ConditionalStatementIf cs1=new ConditionalStatementIf();
        String result=cs1.getAgeCategory(6); // in this line i catch the return value
        System.out.println(result); //child
    }

    public String getAgeCategory(int age){
        String ageCategory=null;
        if((age>0)&&(age<18)){
            ageCategory="child";
        }
        return ageCategory;

    }
}
