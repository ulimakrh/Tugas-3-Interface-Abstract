/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author agus budi
 */
public class InterfaceAbstractUlima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account acc1 = new Account("Lendy Elhadi", "12345", 1000);
//        System.out.println(acc1.getBankName());
        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.print();
        
        CreditAccount acc2 = new CreditAccount("Norman Normandy", "54545", 1000);
//        System.out.println(acc1.getBankName());
        acc2.print();
        
        //polymorphism with instanceof
        System.out.println("\n\n");
        AbstractBankAccount[] listAll = new AbstractBankAccount[5];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = new CreditAccount("James Bond", "24122", 1500);
        listAll[3] = new Account("Henry Vinci", "12125", 2400);

        
        for(AbstractBankAccount acc : listAll)
            if(acc instanceof Account)
                System.out.println("akun tabungan");
            else if(acc instanceof CreditAccount)
                System.out.println("akun kredit");
            else
                System.out.println("ruang kosong");
    }
    
}