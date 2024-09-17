package problem_solving.problem_solving.strings;

public class BackspaceStringsCompare {

    /*
    Given two strings s and t, return true if they are equal when both are typed into empty text editors.
    '#' means a backspace character.
    Note that after backspacing an empty text, the text will continue empty.
    */

    public boolean compareTwoStrings(String str1, String str2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int j = 0, k = 0, p = 0;

        //Cleaning up the input strings
        sb1 = processString(str1);
        sb2 = processString(str2);

        System.out.println("Input str1: "+ str1 + ", proessed str1: " + sb1);
        System.out.println("Input str2: "+ str2 + ", proessed str2: " + sb2);

        //Compare
        if(sb1.length() != sb2.length())
            return false;
        else if ( sb1.length() == sb2.length() && sb1.length() == 0)
            return true;
        else if ( sb1.length() == sb2.length() && sb1.length() !=0 ){
            if(sb1.charAt(p) != sb2.charAt(p))
                return false;
        }
        return true;
    }

    private StringBuilder processString(String str){

        StringBuilder sb = new StringBuilder();
        int j = 0;

        //Cleaning up the input string str1
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '#') && (j>0)) {
                j--;
                sb.delete(j, sb.length());
            }
            else {
                sb.append("" + str.charAt(i) + "");
                j++;
            }
        }

        return sb;
    }
}