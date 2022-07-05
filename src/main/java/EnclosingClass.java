public class EnclosingClass {
    //This class is an Enclosing class for virtual wallet
    public Double initBalance;
    public static Double cryptoBalance;
    private Double transferRequest;

    public EnclosingClass(Double initBalance, Double transferRequest) {
        this.initBalance = initBalance;
        this.transferRequest = transferRequest;
        cryptoBalance = initBalance;

    }

    public void withdrawMoney(Double amountRequested){
        // withdraws money from the account
        if(amountRequested > cryptoBalance){
            cryptoBalance -=amountRequested;
        }

    }


    protected class Atm {
        public Double returnBalance(){
            return cryptoBalance;
        };

        public Double withdraw(Double amount){
            return cryptoBalance -= amount;
        };
    }

    Atm atm = new Atm() {
        public Double returnBalance(){
            return cryptoBalance;
        };
    };

    public static class Transferwise {
        public Double returnBalance(){
            return cryptoBalance;
        };
        public Double withdraw(Double amount){
            return cryptoBalance -= amount;
        };
    };

}
