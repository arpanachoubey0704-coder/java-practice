public class Main {
public static void main(String[] args) {
int i = 0, j = 10;
for ( ; i < j; i += 2, j--) {
    if (i == 4) {
        continue;
    }
    System.out.println("i = " + i + ", j = " + j);
}
  
}
    
}
