import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import constants.AccountType;
import constants.Transaction;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;
import service.AccountService;
import service.CheckingService;
import service.CreditService;

public class Main {
    public static AccountRepository accountRepository = new AccountRepository();
    public static CheckingService checkingService = new CheckingService(accountRepository);
    public static CreditService creditService = new CreditService(accountRepository);

    public static void main(String[] args) {

        try {
            loadAccounts();
            readTransaction();
            finalTest();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // // Assume these were obtained from user input.
        // List<Account> accounts = Arrays.asList(
        // new Checking("A1234B", new BigDecimal("500.00")),
        // new Checking("E3456F", new BigDecimal("300.50")),
        // new Checking("I5678J", new BigDecimal("100.25")),
        // new Credit("A1534B", new BigDecimal("0.50")),
        // new Credit("G4567H", new BigDecimal("200.00")));

        // accounts.forEach(account -> {
        // if (account instanceof Credit) {
        // creditService.createAccount((Credit) account);
        // } else {
        // checkingService.createAccount((Checking) account);
        // }

        // });

        // Checking check = checkingService.retrieveAccount("A1234B");
        // check.setBalance(new BigDecimal("600"));
        // checkingService.updateAccount(check);

        // creditService.deleteAccount("G4567H");
        // accountRepository.printAll();

        // System.out.println("\n============== INTERFACE ==============");
        // System.out.println("\n============== DEPOSIT ==============");
        // executeTransaction(checkingService, "A1234B", new BigDecimal("200"),
        // Transaction.DEPOSIT);
        // executeTransaction(creditService, "A1534B", new BigDecimal("10"),
        // Transaction.DEPOSIT);

        // System.out.println("\n============== WITHDRAW ==============");
        // executeTransaction(checkingService, "A1234B", new BigDecimal("100"),
        // Transaction.WITHDRAWAL);
        // executeTransaction(creditService, "A1534B", new BigDecimal("20"),
        // Transaction.WITHDRAWAL);

        // System.out.println();
        // accountRepository.printAll();

    }

    public static void loadAccounts() throws IOException {
        Path path = Path.of("data/accounts.txt");

        Files.lines(path).forEach(line -> {
            String[] sentence = line.split(" ");

            if (sentence[0].equals(AccountType.CHECKING.toString())) {
                checkingService.createAccount(new Checking(sentence[1], new BigDecimal(sentence[2])));
            } else {
                creditService.createAccount(new Credit(sentence[1], new BigDecimal(sentence[2])));
            }
        });
    }

    public static void readTransaction() throws IOException {
        Path path = Path.of("data/transactions.txt");

        Files.lines(path).forEach(line -> {
            String[] sentence = line.split(" ");
            Transaction type = sentence[2].equals("DEPOSIT") ? Transaction.DEPOSIT : Transaction.WITHDRAWAL;

            if (sentence[0].equals(AccountType.CHECKING.toString())) {
                executeTransaction(checkingService, sentence[1], new BigDecimal(sentence[3]), type);
            } else {
                executeTransaction(creditService, sentence[1], new BigDecimal(sentence[3]), type);
            }
        });
    }

    public static void executeTransaction(AccountService service, String id, BigDecimal amount,
            Transaction transaction) {
        if (transaction.equals(Transaction.DEPOSIT)) {
            service.deposit(id, amount);
        } else {
            service.withdraw(id, amount);
        }
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Balance: " + checkingService.retrieveAccount("A1234B").getBalance());
        System.out.println("Account E3456F Balance: " + checkingService.retrieveAccount("E3456F").getBalance());
        System.out.println("Account I5678J Balance: " + checkingService.retrieveAccount("I5678J").getBalance());
        System.out.println("Account C2345D Credit: " + creditService.retrieveAccount("C2345D").getCredit());
        System.out.println("Account G4567H Credit: " + creditService.retrieveAccount("G4567H").getCredit());
    }
}