public class EnhancedForDemo2 {
    public static void main(String[] args) {

        //scenario- I want to hold the employee id of 5 different people


        //create an Int array
        int [] empId={1,2,3,4,5};

        //enhanced for loop
        for(int n: empId){
            System.out.println("empId are: "+n); // empId are: 1
                                                 // empId are: 2
                                                 // empId are: 3
                                                 // empId are: 4
                                                 // empId are: 5
        }
    }
}
