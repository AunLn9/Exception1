
package exception3;


public class LAB2 {
    public static void main(String[] args) {
        try {
          int[] list = new int[10];
          System.out.println("list[10] is " + list[10]);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
