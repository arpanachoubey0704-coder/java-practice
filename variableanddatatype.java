import java.util.Scanner;
public class variableanddatatype {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print(" Eneter pencil value : ");
  float pencil = sc.nextFloat();
  System.out.print(" Eneter pen value : ");
  float pen = sc.nextFloat();
  System.out.print(" Eneter eraser value : ");
  float eraser = sc.nextFloat();

  float total = (pencil+pen+eraser);
  System.out.println("total you buy : " +total);
  float gst = total * 0.18f;
  float finalbill = total + gst;
  System.out.println( " Gst is : " +gst);
  
  System.out.print("final bil : " +finalbill);
  sc.close();
}
}