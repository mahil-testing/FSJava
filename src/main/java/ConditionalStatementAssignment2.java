
    public class ConditionalStatementAssignment2 {
   public static void main(String[] args) {

   ConditionalStatementAssignment2 cs=new ConditionalStatementAssignment2();
   cs.ageAndGender(10,"male");

    }
    public void ageAndGender(int age, String gender){
       if(age>=0 && age<=18){
           if(gender.equals("male")){
               System.out.println("boy");
           }
           else{
               System.out.println("girl");
           }
       }else if(age>18 && age<60) {
           if (gender.equals("male")) {
               System.out.println("Man");
           } else {
               System.out.println("woman");
           }
       } else if(age>60) {
           System.out.println("senior citizen");
       }else{
           System.out.println("Please learn about age & gender");
       }
    }
}
