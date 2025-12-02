/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encryption
{
    public static void main(String[] args){
        
        System.out.println("Welcome to the Encryption / Decryption Program");
        
    }
          //replacing vowels to special characters-Moishie's part
    public static String ReplaceVowels(String sentence){
        String result = sentence.replace('a','@');
        result = sentence.replace('e','#');
        result = sentence.replace('i','1');
        result = sentence.replace('o','0');
        result = sentence.replace('u','&');
        return result;
    }
    //replacing special characters to vowels-Moishie's part
    public static String ReplaceSpecialCharacter(String sentence){
        String result = sentence.replace('@','a');
        result = sentence.replace('#','e');
        result = sentence.replace('1','i');
        result = sentence.replace('0','o');
        result = sentence.replace('&','u');
        return result;
    }
}
