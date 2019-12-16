import java.util.Scanner;
public class Zad3 {
    private static int lenght = 0;
    private static int max = 0;
    private static int m = 0;
    private static int n = 0;
    private static int k = 0;
    private static int start = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] word = words.toCharArray();
        for(int i = 0; i < words.length(); ++i)
        {
            if(word[i] != ' ')
            {
                k++;
                lenght++;
            }
            if(word[i] == ' ')
            {
                if(lenght >= max){
                    max = lenght;
                    n = k;
                    m = start;
                }
                lenght = 0;
                start = i + 1;
                k = start;
            }
            if(i == words.length() - 1 && lenght >= max)
            {
                n = k;
                m = start;
            }
        }
        for(int i = m;i < n; ++i)
        {
            System.out.print(word[i]);
        }
    }
}