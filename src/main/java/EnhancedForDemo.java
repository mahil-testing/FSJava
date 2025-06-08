public class EnhancedForDemo {
    public static void main(String[] args) {

        //scenario- I want to hold the name of 4 different people


        //create an array
        String[] names=new String[]{"Abhilash","Saumya","Priya","Fizula"};

        //for loop
        for(int i=0;i<names.length;i++){
            System.out.println("item at position "+i+"is: "+names[i]); // item at position 0is: Abhilash
                                                                       //  item at position 1is: Saumya
                                                                       // item at position 2is: Priya
                                                                       // item at position 3is: Fizula
        }

        //for-each loop
        for(String n:names){
            System.out.println("Names are: "+n); //Names are: Abhilash
                                                 //Names are: Saumya
                                                 //Names are: Priya
                                                 //Names are: Fizula
        }
    }
}
