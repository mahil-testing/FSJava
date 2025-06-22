public class InheritanceDemo {
    public static void main(String[] args) {

        //1 Create Instance of Super Parent(Browser) but parent of Browser is Object
        Browser b1=new Browser();
        Object b2=new Browser();

        //2 Create Instance of Chromium but parent & gransparent of Chromium is Browser & Object
        // Browser is Ancestor of Chromium even object is Ancestor of Chromium
        Chromium c1=new Chromium();
        Browser  c2= new Chromium();
        Object   c3= new Chromium();

        //3 Create Instance of Chrome but parent of Chrome is Chromium,Browser & Object
        Chrome ch1=new Chrome();
        //access all three methods
        ch1.openURL();
        ch1.devTools();
        ch1.cliInspect();

        //4 create instance of chrome class which is child here & you are assigning it to parent(Chromium)
        // it make instance of child but behave as parent, it will not access the method of child
        Chromium ch2=new Chrome();
        //ch2.devTools(); //not allowed here
        ch2.cliInspect();
        ch2.openURL();


        //5 create instance of chrome class which is child here & you are assigning it to Grandparent(Browser)
         Browser ch3=new Chrome();
         ch3.openURL();
        // ch3.devTools(); //not allowed
        // ch3.cliInspect(); //not allowed

        //6 Object ch4=new Chrome();

        //UpCasting & Downcasting
        //1 class to class
        Chrome chr1=new Chrome();

        //2 Converting child to parent-Upcasting
        //Upcasting-u can access method of parent only, u can't access method of child class
        Browser br1=new Chrome();
        //or
        Browser br2 =(Browser)new Chrome();
        br1.openURL();


        //downcasting-Converting Parent to child
        ((Chrome)br1).devTools();
        ((Chrome)br1).openURL();
        ((Chrome)br1).cliInspect();

        //Downcasting sceanrio
        //1 Chrome chr2=new Browser(); //compilation error-Not allowed in java

        //2
        Chrome chr2=(Chrome)new Browser();
        chr2.devTools(); //no compilation error but runtime error
        chr2.openURL();  //no compilation error but runtime error
        chr2.cliInspect(); //no compilation error but runtime error



    }
}
