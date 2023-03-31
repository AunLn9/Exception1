package exception1;

public class LAB5 {
    public static void main(String[] args) {
        System.out.println("Main method call method dothis()");
        try {
            dothis();
        } catch (Exception e){
            System.out.println("Main method recieve exception" + e.getMessage());
        }
    }
    private static void dothis() throws Exception {
        System.out.println("Method doThis() xall method doThat()");
        doThat();
    }
  
    public static void doThat()throws Exception {
        System.out.println(1/0);
    }
}
