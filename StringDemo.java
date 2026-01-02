public class StringDemo {
    


    public static void main(String[] args) {

        // 1. Creating Strings
        String s1 = "Java";
        String s2 = new String("Programming");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // 2. Length
        System.out.println("Length of s1: " + s1.length());

        // 3. Concatenation
        String concat1 = s1 + " " + s2;
        String concat2 = s1.concat(" ").concat(s2);
        System.out.println("Concatenation (+): " + concat1);
        System.out.println("Concatenation (concat): " + concat2);

        // 4. Character at index
        System.out.println("Char at index 1 in s1: " + s1.charAt(1));

        // 5. String Comparison
        String a = "Hello";
        String b = "hello";

        System.out.println("equals(): " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));

        // 6. Substring
        String sub = s2.substring(0, 7);
        System.out.println("Substring: " + sub);

        // 7. Contains, startsWith, endsWith
        System.out.println("Contains 'Pro': " + s2.contains("Pro"));
        System.out.println("Starts with 'Pro': " + s2.startsWith("Pro"));
        System.out.println("Ends with 'ing': " + s2.endsWith("ing"));

        // 8. Replace
        String replaced = s2.replace("Programming", "Language");
        System.out.println("Replaced string: " + replaced);

        // 9. Case conversion
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // 10. Trim
        String spaced = "   Java Developer   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

    // 11. search 
    String s="Automation Testing";
    System.out.println(s.contains("Testing"));
    String se="Malla Reddy University";
    System.out.println(se.contains("Malla"));

    String sec="Java Programming";
    System.out.println(sec.startsWith("Java"));
    
    System.out.println(sec.endsWith("Programming"));

    //split

    String si= "JAVA,C++,Python";
    String[] arr= si.split(",");

    for(String lang : arr){
        System.out.print(lang+" ");
    }


    }
}

