import rsk.BetterExperessions;
import rsk.Functions_in_kotlinKt;

public class App {
    public static void main(String[]args){
        Functions_in_kotlinKt.display("Hello, world from java");
        BetterExperessions.main();
//we can call a class from kotlin by java
        //we use the above method.

        Default_ParametersKt.log("Hello world from java");
        Default_ParametersKt.log("Hello world from java",2);
        
        //@JvmOverloads creates two functions one which can accept the second parameter
        //and one which can do without.
    }
}
