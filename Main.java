public class Main{

    public static void main(String[] args) {

        Fighter f1 =new Fighter("Rocky", 35, 120,100,30);
        Fighter f2 =new Fighter("Dragon", 15, 200,110,20);

        Ring ring =new Ring(f1, f2, 90, 120);

        ring.run();
        System.out.println("");
        
    }
}