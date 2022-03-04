package BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        Map<Integer, BankAccount> accountMap = new HashMap<>();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");

            String output = null;

            switch (tokens[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accountMap.put(bankAccount.getId(), bankAccount);
                    output = String.format("Account ID%d created", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    int current = Integer.parseInt(tokens[1]);
                    if (current > accountMap.size()) {
                        System.out.println("Account does not exist");
                    } else {
                        accountMap.get(id).deposit(amount);
                        output = String.format("Deposited %d to ID%d", amount, id);
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    current = Integer.parseInt(tokens[1]);
                    if (current > accountMap.size()) {
                        System.out.println("Account does not exist");
                    } else {
                        double interest = accountMap.get(id).getInterestRate(years);

                        output = String.format("%.2f", interest);
                    }
                    break;
            }
                if (output != null) {
                    System.out.println(output);
                }
                command = scan.nextLine();
            }

        }
    }

