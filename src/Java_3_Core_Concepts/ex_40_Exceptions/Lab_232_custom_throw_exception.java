package Java_3_Core_Concepts.ex_40_Exceptions;

public class Lab_232_custom_throw_exception {
    public static void main(String[] args) {

        bank sbi = new bank("INR", 100);
        bank icici = new bank("INR",100);

        int tot_bal = sbi.add(icici);
        System.out.println(tot_bal);

        bank kpmg = new bank("USD",200);
        int tot_bal1 = sbi.add(kpmg);
        System.out.println(tot_bal1);
    }
}

class bank {

    private String currency;
    private Integer amount;

    bank(String currency_c, Integer amount_c){

        this.currency =currency_c;
        this.amount = amount_c;

    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add (bank bankName) {
        if(!bankName.currency.equalsIgnoreCase("INR")){
            try {
                //Declare inside the method. Throw one at a time.
                throw new Exception("Currecy Mismatch");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else {
            return bankName.amount + this.amount;
        }
        return 0;
    }
}