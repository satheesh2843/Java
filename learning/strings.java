package learning;

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        char c[]={'a','b','c','d','e'};
        String s="the king is back!!!!!!";
        String[] str = s.split(" ",2);
        System.out.println(Arrays.toString(str));
        // 3,4,7,8,9,16,17,26,24,28

        int a1 = 119;
        String z1 =String.valueOf(a1);
        System.out.println(z1);

        // 1. this keyword used to print the index char in string only  not possible in chararray
        System.out.println(s.charAt(4));

        //2. "lenght" this keyword used to find the length of the string
        System.out.println(s.length());

        String k="king";
        // 5. "substring" this keyword used to separate the string  into  another substring from the starting index position
        System.out.println(s.substring(5));

        //6. same as before this keyword used to separte the string from the specific index values
        System.out.println(s.substring(5,15));

        // 10. " equal" keword to check the two string are equal or not
        // it's output is in bollean value ---> true or false
        String p="equal";
        String pp="Equal";
        System.out.println(p.equals(pp));

        String em="";
        // 11. "isEmpty" this keyword used to check the string contains value or it's an empty string
        // it's output is in bollean value ---> true or false
        System.out.println(em.isEmpty());

        // 12. "concat" this keyword used to add two string into single string
        System.out.println(s.concat(p));

        //13 . "replace" this keyword used to replace the one character to another character
        System.out.println(s.replace(' ','-'));

        // 14. by using an replace keyword we can also replace multiple cahracter at the same time
        String a="the new new new new";
        System.out.println(a.replace("new","hello"));


        // 15. "equalsIgnoreCase" this keyword used to check the two string equal or not --> specially it ignore the caps or small chacter
        String com="the new KING";
        String comp="the new king";
        System.out.println(com.equalsIgnoreCase(comp));

        //18. "indent" this keyword used to give space in the beginning of the string
        System.out.println(s.indent(17));


        //19. "indexof" this keyword used to  find the specific character of the string and return first index value
        // if is not found it shows "-1"  as an output
        System.out.println(s.indexOf('i'));

        //20. from the above keyword we can also specifically  give the starting position of the string
        System.out.println(s.indexOf('k',7));


        //21. as it is we can also give string to find in another string in it.
        System.out.println(s.indexOf("king"));

        //22. as it is we can also give starting index value to find the string is in it . return starting index value
        System.out.println(s.indexOf("king",16));

        //23. "toLowerCase" this keyword used to convert entire string in to  lower case
        String cas="SaThEeShKumAR";

        System.out.println(cas.toLowerCase());
        //25. "toUpperCase" this keyword used to convert entire string into upper case

        System.out.println(cas.toUpperCase());

        // 27"trim" this keyword used remove space in the string at starting and ending position only
        System.out.println(s.trim());

//        System.out.println(s.valueof());6ty+

        int inde=5;
        System.out.println(inde+5);


    }
}
