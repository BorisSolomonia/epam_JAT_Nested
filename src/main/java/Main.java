public class Main {
    public static void main(String[] args) {
        EnclosingClass eclass = new EnclosingClass(500.0,0.0);
        //EnclosingClass.Transferwise foreign = new EnclosingClass.Transferwise();
        EnclosingClass.Atm atm = eclass.new Atm();
        System.out.println(atm.withdraw(100.0));
    }
    
}
