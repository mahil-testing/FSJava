
    public class ConditionalStatementAssignment1 {
   public static void main(String[] args) {

   ConditionalStatementAssignment1 cs=new ConditionalStatementAssignment1();
   String res=cs.determineCategory(10,"Male");
       System.out.println(res);
    }
    public String determineCategory(int age, String gender){
        String result=null;
        if((age>0) && (age<18) && (gender=="Male")){
            result="boy";
        }
        else if((age>18) && (age<=60) && (gender=="Male")){
            result="men";
        }
        else if(age>60){
            result="Senior Citizen";
        }
        else if((age>0)&&(age<=18)&&(gender=="female")){
            result="girl";
        }
        else if((age>18) && (age<=60) && (gender=="female")){
            result="woman";
        }
        else {
            System.out.println("Please learn about age & gender");
        }
        return result;

        
    }
}
