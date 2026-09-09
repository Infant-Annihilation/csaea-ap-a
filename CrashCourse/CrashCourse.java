package CrashCourse;

import java.util.ArrayList;

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

        int[][] arryGrid2 = {{7, 8, 9}, 
                             {4, 5, 6}, 
                             {1, 2, 3}};
        System.out.println(arryGrid2[0][1]); // access number 8
        System.out.println(arryGrid2[2][2]); // access number 3
        System.out.println(arryGrid2[1][2] + arryGrid2[1][0]); // get 10, since 6 + 4 = 10

        // ARRAYLISTS
        // Can be any size, lots of built-in functions to help
        // Avoid primitive data types(int, double, boolean). Special classes for Integer, Double, Boolean, String(those 4 are called "wrapper classes")

        ArrayList<String> arryLst = new ArrayList<>();
        arryLst.add("Word 1");
        arryLst.add("Word 2");
        arryLst.add("Word 3");
        
        System.out.println(arryLst);

        arryLst.remove(0);

        System.out.println(arryLst);

        arryLst.add(0, "Word 4");

        System.out.println(arryLst);

        arryLst.set(2, "Word 5");

        System.out.println(arryLst);

        System.out.println(arryLst.size());

        System.out.println(arryLst.get(2));

        // Math Class
        Math.max(5, 9); // max value => returns 9
        Math.min(7, 3); // min value => returns 3
        Math.sqrt(72); // square root
        System.out.println(Math.abs(-93)); // absolute value

        // CONDITIONALS

        // if     else if     else

        boolean tru = true; boolean fal = false;

        if(tru) {
            System.out.println("Reached first condition");
        } else if(!fal) {
            System.out.println("Reached second condition");
        } else {
            System.out.println("Reached else");
        }

        // ITERATION

        // while loops

        int x = 5;

        while(x < 10) {
            System.out.println(x + " ");
            x++;
        }
        if(x == 10) {
            System.out.println("Var x has reached 10!");
        }

        // for loop
        // initialize variable for an index; conditional; incrememnt/decrement
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // enhanced for loop (only for reading values, not modifying)

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Sheep");
        animals.add("Deer");
        animals.add("Moose");
        System.out.println("ArrayList: " + animals);

        for (String s : animals) {
            System.out.println("We saw " + s);
        }

        // printing values of an array with iteration

        double[] arry = {5.11, 2.2, 7.5, 4.28, 9.46};
        
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
            System.out.println(arry[2]);
        }

        int[][] arryMatrix = {{0, 32, 12}, {7, 13, 22}, {6, 77, 100}};
        
        for(int row = 0; row < arryMatrix.length; row++) {
            for(int col = 0; col < arryMatrix[row].length; col++) {
                System.out.println(arryMatrix[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}