public class Account {
    int accountNo;
    int amount;
    String nationalId;

    /*
    public Account(){

    }*///n-are sens, mai bine:
    public Account(){
        accountNo = 0;
        amount = 0;
        nationalId = null;
    }

    public void deposit(int amount){
        this.amount += amount;
    }



    public void withdraw(int amount){
        try{
            if(amount>this.amount)
                throw new notEnoughMoneyException("Not enough money in the bank");
            else
                this.amount -= amount;
        }
        catch (notEnoughMoneyException ex){
            System.out.println("caught");
            System.out.println(ex.getMessage());
        }
    }




    public void linkToNationalId(String nationalId){

        int invalid = 0;
        try {
            if (nationalId.length() > 6)
                throw new invalidNationalIdException("id is not valid");
            else
                System.out.println("your id is: "+nationalId);

        }catch(invalidNationalIdException ex){
            System.out.println("catched");
            invalid = 1;
        }

        try{
            if(invalid == 1)
                throw new notEnoughMoneyException("not enough money in the bankk");
        }catch(notEnoughMoneyException ex){
            System.out.println(ex.getMessage());
        }
        //comentariu git
    }

}

//am mutat aici clases de exceptii: e mai bine sa fie externe decat interne
class notEnoughMoneyException extends Exception{
    public notEnoughMoneyException(String s){
        super(s);
    }
}

class invalidNationalIdException extends Exception{
    public invalidNationalIdException(String s){
        super(s);
    }
}