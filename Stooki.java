import java.util.ArrayList;
import java.util.Scanner;
public class Stooki {
    public static void main(String[] args)
    {
        ArrayList <Integer> arr = new ArrayList<>();
        int count = 0;
        int k = 0;
        int count_letters = 0;
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] words1 = words.toCharArray();
        for(int i = 0; i < words.length(); ++i)
        {
            if(words1[i] != ' ') {
                count_letters++;
            }
            if (words1[i] == ' ')
            {
                if(count_letters == 3)
                {
                    count++;
                    count_letters = 0;
                    System.out.println(count);
                }
                else{
                    count++;
                    count_letters = 0;
                }
            }
            if(i == words.length() - 1 && count_letters == 3) {
                count++;
                System.out.println(count);
            }
        }
    }
}