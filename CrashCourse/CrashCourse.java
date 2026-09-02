package CrashCourse;
public class CrashCourse {        //class header

    public static void main(String[] args) {

        //comments: two forward slashes
        
        /*Multi line 
        comments(slash then star) */

        System.out.print("Hello");
        System.out.println("world");

        // variable declaration
        // PRIMITIVE VARIABLES

        int a; // integer
        double b; // decimal or float
        boolean c; // true or false

        a = 4;
        b = 5.5;
        c = false; // lowercase

        // Arithmetic operators
        // + - / * % 
        // +=  -=  /=  %=

        int d = 3;
        d += 7;

        System.out.println("Here is var d: " + d);

        // increment and decrement by one:
        // ++ and --
        d--;
        d++;
        d++;

        System.out.println("var d is now equal to: " + d);

        // COMPARISONS
        // Always returns true or false
        // <  >  <=  >=  ==  !=  
        System.out.println(4 < 5);
        System.out.println(7 == 5);
        System.out.println(62 != 3);

        // LOGICAL OPERATORS
        // In order of precedence:
        // !(not)  &&(and)  ||(or)
        // Order of operations; not -> and -> or

        boolean e = false; boolean f = true;

        // predict output: true or false?
        System.out.println(!e); // true
        System.out.println(e && f); // false
        System.out.println(e || f); // true
        System.out.println(e || f && !e); // true

        System.out.println( e && f); // short circuits after checking e; java doesn't need to check after e



    }
}