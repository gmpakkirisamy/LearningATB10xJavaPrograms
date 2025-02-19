package Java_Basic_Concepts.ex_18_Strings;

public class Lab_99_String_Advanced_all {
    public static void main(String[] args) {
        String name  = "Pakkirisamy";


        //1. charAt()
        System.out.println(name.charAt(3)); // It will pick the character from the 3 index position.
        //System.out.println(name.charAt(12)); // it will throw the out bound exception error

        //2. length()
        System.out.println(name.length()); // It will give the total characters

        //3. concat()
        System.out.println(name.concat(" Love")); // It will add the string with original string

        //4. contains()
        System.out.println(name.contains("dsamy")); // Checks the specific string is present or not. gives true or false

        //5. equals()
        System.out.println(name.equals("Love")); // It will check the string with orginal string true or false

        //6. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("pakkirisamy")); // It will ignore the upper case or lower case but compare the content

        //7. indexoF()
        System.out.println(name.indexOf("a")); // It will locate the index of the character and always find the first one occurence.

        //8. replace()
        System.out.println(name.replace('a','A')); // it will replace all the character with the mentioned new character.

        //9. split()
        String name2 = "Pakkiri Samy";

        String[] split = name2.split("a"); // Based on the space/a/any letters it will split the word. String[] -is an array to store.
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //10. substring()   - //Extracts a portion of the string
        String anotherPalindrome = " Pakkiri. O roar again!      ";
        String samy = anotherPalindrome.substring(15,21); // It will take the string from speficed location as mentioned as index. Last index will be -1 means 21-1 is 20
        System.out.println(samy);

        //11. toLowerCase()
        System.out.println(name2.toLowerCase()); // it will make all letter to lower case

        //12. toUpperCase()
        System.out.println(name2.toUpperCase()); // it will make all the letters to upper case

        //13. starsWith()
        System.out.println(name2.startsWith("l")); // it will check the string which is start with the given letter or not and give the result as true or false.

        //14. endsWith()
        System.out.println(name2.endsWith("y")); // it will check the string which is ends with the given letter or not and give the result as true or false.

        //15. trim()
        System.out.println(anotherPalindrome.trim()); // It will trim all the spaces which is starting and ending is having
        String name3 = "Love";

        //16. compareTo()
        System.out.println(name3.compareTo("love")); // Compare the values based on the ASCII values

        //17. append()
        StringBuilder string = new StringBuilder("Hello");
        string.append("Samy !");  // It will append from the end the value with the given value
        System.out.println(string);
        // In SCP no new string will be created. But concat new string will be created. so memory will be saved.

    }
}
