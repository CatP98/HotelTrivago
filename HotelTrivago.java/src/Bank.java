public class Bank {

    private int moneyAmount;
    private String bankName;
    private int totalAssets;

    public Bank(int moneyAmount, String hotelName){
        this.moneyAmount = 0;
        this.bankName = hotelName + "Bank";
        this.totalAssets = totalAssets;
    }

    public void makeDeposit(int value){
        moneyAmount += value;
        System.out.println("Welcome to " + bankName + "." + "Successfull Transaction. " + value+ "were added to your Bank Account.");
        System.out.println("Current balance:" + moneyAmount);
    }

    public void makeWithdrawl(int value) {
        if (moneyAmount >= value && value > 0) {
            moneyAmount -= value;
            System.out.println("Welcome to " + bankName + "." + "Successfull Transaction. " + value + "$ were withdrawn to your Bank Account. Your current Bank Balance is " + moneyAmount + "$.");
        } else {
            System.out.println("Welcome to " + bankName + "." + "Impossible to proceed with Transaction, due to lack of enough funds. Your current Bank Balance is " + moneyAmount + "$.");
        }
    }

    public void pay(int value){
            if(moneyAmount >= value &&  value > 0){
                moneyAmount -= value;
                totalAssets += value;
        }
    }

    public int checkBalance(){
        System.out.println("Welcome to " + bankName + ". Your current Bank Balance is " + moneyAmount + "$.");
        return  moneyAmount;
    }

    public String getBankName(){
        return bankName;
    }

    public int checkOutRefund(){
        System.out.println(moneyAmount + "$ have been successfully refunded. Thank you for staying with us.");
        int moneyToReturn = moneyAmount;
        this.moneyAmount = 0;
        // a = 0
        // t = 10
        // moneyAmount = 0

        return moneyToReturn;
    }

    public int totalBankAssets(){
        return totalAssets;
    }
}


