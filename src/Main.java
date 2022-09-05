import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static ArrayList<Bank> banks = new ArrayList<>();

    public static void main(String[] args) {
        Bank ziraat = new Bank("Ziraat Bankas�",2.85,0.18);
        Scanner input = new Scanner(System.in);
        welcome();
        while (true) {
            String a = input.nextLine();
            if (a.equals("q")) {
                System.out.println("Programdan ��k�l�yor...");
                break;
            } else if (a.equals("1")) {
                System.out.println("Bankan�z� se�iniz:");
                String isim = input.nextLine();
                System.out.println("Faiz oran�n� se�iniz:");
                double IRate = input.nextDouble();
                System.out.println("Birikim oran�n� se�iniz:");
                double accRate = input.nextDouble();
                banks.add(new Bank(isim, IRate, accRate));
                welcome();

            } else if (a.equals("2")) {
                System.out.println("M��teri ad�n� giriniz: ");
                String isim = input.nextLine();
                System.out.println("M��teri soyad�n� giriniz: ");
                String soyisim = input.nextLine();
                System.out.println("M��teri TC kimlik numaras�n� giriniz: ");
                String tcID = input.nextLine();
                System.out.println("M��teri bankas�n� se�iniz: ");
                bankalar();
                int i = input.nextInt();
                System.out.println("M��teri kayd�n�z " + i + ". bankaya eklendi!");
                banks.get(i - 1).addCustomer(new Customer(isim, soyisim, tcID, banks.get(i - 1)));
                welcome();
            } else if (a.equals("3")) {

                System.out.println(" Hesap numaras�n� giriniz: ");
                String id = input.next();
                System.out.println(" Hesab�n tipini giriniz: ");
                String type = input.next();
                System.out.println("M��teri bankas�n� se�iniz: ");
                bankalar();
                int i = input.nextInt();
                banks.get(i - 1).writeCustomers();
                int j = input.nextInt();
                banks.get(i - 1).getCustomerList().get(j - 1).addAccount(new Account(id, type, 0, banks.get(i - 1), banks.get(i - 1).getCustomerList().get(j - 1)));
                welcome();
            } else if (a.equals("4")) {
                System.out.println("Hangi bankan�n m�sterilerini g�r�nt�lemek istersiniz? ");
                bankalar();
                int choose=input.nextInt();
                banks.get(choose-1).writeCustomers();
                welcome();
            } else if (a.equals("5")) {
                System.out.println("Hangi banka m��terilerinin hesaplar�n� g�r�nt�lemek istersiniz? ");
                bankalar();
                int i= input.nextInt();
                banks.get(i-1).writeCustomers();
                System.out.println("Hangi m��terinin hesaplar�n� g�r�ntelemek istersiniz?");
                int choose= input.nextInt();
                banks.get(i-1).getCustomerList().get(choose-1).writeAccount();
                welcome();
            } else if (a.equals("6")) {
                System.out.println("Para g�nderece�iniz bankay� se�iniz");
                bankalar();
                int i = input.nextInt();
                System.out.println("Para g�ndermek istedi�iniz m��teriyi se�iniz");
                banks.get(i-1).writeCustomers();
                int j = input.nextInt();
                System.out.println(banks.get(i - 1).getCustomerList().get(j - 1) +
                        " m��terisini se�tiniz. \n G�ndermek istedi�iniz tutar� giriniz: ");
                int tutar = input.nextInt();
                System.out.println("Para g�ndermek istedi�iniz hesab� se�iniz");
                banks.get(i - 1).getCustomerList().get(j - 1).writeAccount();
                int choose= input.nextInt();
                banks.get(i - 1).getCustomerList().get(j - 1).getAccountList().get(choose-1).depositMoney(tutar);
                welcome();

            } else if (a.equals("7")) {
                System.out.println("Para �ekece�iniz bankay� se�iniz ");
                bankalar();
                int i = input.nextInt();
                System.out.println("Para �ekmek istedi�iniz m��teriyi se�iniz");
                banks.get(i - 1).writeCustomers();
                int j= input.nextInt();
                System.out.println(banks.get(i - 1).getCustomerList().get(j - 1) + " m��terisini se�tiniz. \n �ekmek istedi�iniz tutar� giriniz: ");
                int withdraw= input.nextInt();
                banks.get(i - 1).getCustomerList().get(j - 1).writeAccount();
                System.out.println("Se�ti�iniz m��terinin hesaplar�n� listeledik.Se�mek istedi�iniz hesab�n s�ra numaras�n� giriniz:");
                int queue = input.nextInt();
                banks.get(i - 1).getCustomerList().get(j - 1).getAccountList().get(queue-1).withdrawMoney(withdraw);
                welcome();

            }
            else if (a.equals("8")){
                System.out.println("Birikim yapmay� hedefledi�iniz bankay� se�iniz l�tfen: ");
                bankalar();
                int i= input.nextInt();
                System.out.println("Birikim yapt�rmak istedi�iniz m��teriyi se�iniz: ");
                banks.get(i-1).writeCustomers();
                int j= input.nextInt();
                System.out.println(banks.get(i-1).getCustomerList().get(j-1)+
                        " m��terisinin t�m hesaplar�n� g�r�nt�lemek i�in 4 e bas�n�z.");
                int show= input.nextInt();
                banks.get(i-1).getCustomerList().get(j-1).writeAccount();
                System.out.println("Hangi hesab�nda birikim yapmak istersiniz? ");
                int choose= input.nextInt();
                banks.get(i-1).getCustomerList().get(j-1).getAccountList().get(choose-1);
                System.out.println("Birikim hesab�na y�kleyece�iniz tutar� belirleyin");
                int money= input.nextInt();
                System.out.println("Ka� g�n birikim yapaca��n�z� giriniz ");
                int day= input.nextInt();
                banks.get(i-1).getCustomerList().get(j-1).getAccountList().get(choose-1).saveUpMoney(money,day);
                welcome();

            }
            /*else if(a.equals("9")){
                System.out.println("Kredi �ekmek istedi�iniz bankay� se�iniz: ");
                bankalar();
                int bankChoose= input.nextInt();
                if (banks.get(bankChoose-1).getCustomerList().size() <=0)
                    System.out.println("Bankan�n m��terisi olup hesap a�mal�s�n�z");
                    Customer fakeCustomer = new Customer();
                    banks.get(bankChoose - 1).addCustomer(fakeCustomer);
                    System.out.println("Bu bankadaki kredi �ekim miktar�n� ��renmek i�in sanal bir vadeli hesap olu�turmal�s�n�z. \n" +
                            "Bunun i�in 3 e bas�n�z.");

                    int createAcc = input.nextInt();
                    InteresAccount fakeAcc = (InteresAccount) new Account("123", "deposit", 0, banks.get(bankChoose - 1), fakeCustomer);
                System.out.println("Ana paran�z� giriniz: ");
                int mainMoney= input.nextInt();
                System.out.println("Kredi tutar�n� giriniz:");
                int interest= input.nextInt();
                fakeAcc.borrowMoneyWithInterest(mainMoney,interest);
            }*/


        }
    }

    public static void welcome() {
        System.out.println("Ho�geldiniz! Ana ekran g�steriliyor\n " +
                "***********************************" + " \n " + "q -��k�� Yapma" +
                "\n 1 -Banka olu�turma" + "\n 2-M��teri olu�turma" + "\n 3-Hesap olu�turma" + "\n 4-Banka m��terilerini g�r�nt�le" +
                "\n 5- M��terilerin hesaplar�n� g�r�nt�le" + "\n 6-Para G�nder" + "\n 7-Para �ek" + "\n 8-Birikim Yap" + "\n 9-Kredi �ek");
    }




    public static void bankalar() {
        for (int i = 0; i < banks.size(); i++) {
            System.out.println((i + 1) + " = " + banks.get(i).getBankName());
        }
    }

}
