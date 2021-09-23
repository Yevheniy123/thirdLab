package com.company;
import java.util.Locale;
import static java.lang.Integer.parseInt;
public class Methods {
        public boolean Sufics(String input) {
            if (input.endsWith("ed")) {
                return true;
            } else {
                return false;
            }
    }
    public int Probel(String input) {
        int leng=1;
        int vleng=1;
        char[] result =input.toCharArray();
        char vrem= result[0];
        for ( int i=1; i<input.length();i++)
        {

            if(vrem ==result[i])
            {
                vleng++;
            }
            else if (vrem !=result[i]) {
                vrem = result[i];
                if(leng<vleng)  leng=vleng;

                vleng=1;
            }
        }
        return leng;
    }
    public int SumZifr(String input) {
        int sum=0;
        char[] result =input.toCharArray();
        for ( int i=0; i<input.length();i++)
        {
            if(result[i]>=47 && result[i]<=57)
            {
                sum=sum+ (Character.getNumericValue(result[i]));
            }
        }
        return sum;

    }
    public static void Word(String input)
    {
        input = input.trim();
        String words[] = input.split(" ");
        System.out.println("Исходная строка: " + input + "\nРезультат: \n");
        for(String word:words){
            System.out.println(word);
        }
    }
    public String getStrFromTwo(String str1, String str2){
        int max = Math.max(str1.length(), str2.length());
        String str = "";
        for (int i = 0; i<max; i++) {
            str +=str1.charAt(i);
            str +=str2.charAt(i);
        }
        return str;
    }
}
