public class Main {
    public static void main(String[] args) {
        Customer first= new Customer("Kübra",23000,2);
        Customer second= new Customer("Ali",12300,2);
        Account firstAcc=new Account(1,"deposit",7800);
        Account secondAcc=new Account(2,"nondeposit",9800);
        first.addAcc(firstAcc);
        second.addAcc(secondAcc);
        System.out.println(firstAcc.getAccountBalance());
        System.out.println(secondAcc.getAccountBalance());
        first.sendMoney(firstAcc,200,secondAcc);

        System.out.println(firstAcc.getAccountBalance());
        System.out.println(secondAcc.getAccountBalance());

        first.sendMoney(firstAcc,100,secondAcc);





    }
}