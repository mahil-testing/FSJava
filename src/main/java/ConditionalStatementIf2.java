public class ConditionalStatementIf2 {
    public static void main(String[] args) {
        //scenario- when if condition is not satisfied then they skip if condition & go to return statement
        //& return statement go to that result variable & print null

        ConditionalStatementIf2 cs2=new ConditionalStatementIf2();
        String result=cs2.getAgeCategory(19);
        System.out.println(result); //null
    }
    public String getAgeCategory(int age){
        String ageCategory=null;
        if((age>0) && (age<18)){
            ageCategory="child";
        }
        return ageCategory;
    }
}
