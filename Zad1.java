import java.util.Scanner;
public class Zad1 {
    private static int k = 0;
    private static int n= 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] a = words.toCharArray();
        for(int i = 0; i < words.length(); ++i)
        {
                if (a[i] == 'а' || a[i] == 'е' || a[i] == 'о' || a[i] == 'у'|| a[i] == 'я' ||a[i] =='и' || a[i] == 'ю' || a[i] == 'ы' || a[i] == 'А' || a[i] == 'Е' || a[i] == 'О' || a[i] == 'У'|| a[i] == 'Я' || a[i] =='И' || a[i] == 'Ю'|| a[i] == 'Ы')
            {
                if (k == 0)
                {
                    n++;
                }
            }
            if (k < 1)
                k++;
            if (a[i] == ' ')
            {
                 k= 0;
            }
        }
        System.out.println(n);
    }
}