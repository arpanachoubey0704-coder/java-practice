import java .util.*;
public class Main {
    public static int back ( int n ){
        int f = 1 ;
        for (int i = 1 ; i<=n;i++)
        {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(back(4));
    }
}