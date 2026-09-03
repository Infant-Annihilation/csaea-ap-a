package CrashCourse;
public class CrashCourse {        //class header. Always PascalCase

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

        System.out.println(e && f); // short circuits after checking e; java doesn't need to check after e
        System.out.println(f || e && f); // short circuits after checking the first t.

        // CASTING(converting)
        int g = (int)5.99;
        System.out.println(g);

        double h = (double)5/6;
        System.out.println(h);

        // STRINGS
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "goodbye";
        String result = (s1 + s2 + s3);
        result += ", Cowboy.";
        System.out.println("\n" + result + "\n");

        // ARRAYS
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;      // assigning values to the individual integers in the array1 array
        arry1[1] = 2;

        System.out.println("Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34, 52, 3, 64, 73};
        System.out.println("arry2: " + arry2);

        // 2D ARRAYS(grid or table)

        int[][] arryGrid1 = new int [4][3];   // [rows][columns]
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0

        System.out.println("Rows: " + arryGrid1.length);
        System.out.println("Columns: " + arryGrid1[0].length);


    }
}