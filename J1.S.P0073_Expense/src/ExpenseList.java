
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Duc Dat
 */
public class ExpenseList {

    private List<Expense> list = new ArrayList<>();
    private Validation check = new Validation();

    public void addExpense() {
        System.out.println("-------- Add an expense--------");
        int ID;
        if (list.isEmpty()) {
            ID = 1;
        } else {
            ID = list.get(list.size() - 1).getID() + 1;
        }
        String date = check.inputDate("Enter Date: ");
        double amount = check.inputDouble("Enter Amount: ", 0, Double.MAX_VALUE);
        String content = check.inputString("Enter Content: ", "[A-Za-z0-9\\s]+");
        Expense e = new Expense(ID, date, amount, content);
        list.add(e);
        System.out.println("Add new expense successfully");
    }

    public void removeExpense() {
        System.out.println("--------Delete an expense------");
        int ID = check.inputInt("Enter ID: ", 1, Integer.MAX_VALUE);
        for (Expense e : list) {
            if (e.getID() == ID) {
                list.remove(e);
                System.out.println("Delete an expense successful");
                return;
            }
        }
        System.out.println("Delete an expense fail");
    }

    public void display() {
        System.out.println("---------Display all expenses------------");
//        Collections.sort(list, new Comparator<Expense>() { // sắp xếp tăng dần amount
//            @Override
//            public int compare(Expense o1, Expense o2) {
//                if (o1.getAmount() > o2.getAmount()) {
//                    return 1;
//                } else if (o1.getAmount() < o2.getAmount()){
//                    return -1;
//                } else return 0;
//            }
//        });
        Collections.sort(list, new Comparator<Expense>() {
            @Override
            public int compare(Expense o1, Expense o2) {
                return o1.getDate().compareToIgnoreCase(o2.getDate());
            }
        });

//        Collections.sort(list, (Expense o1, Expense o2) -> {
//            return (o1.getContent().compareToIgnoreCase(o2.getContent()));                
//        });
//        
        double total = 0;
        System.out.println(String.format("%-4s%-15s%-15s%-20s", "ID", "Date", "Amount", "Content"));
        for (Expense e : list) {
            System.out.println(e);
            total = total + e.getAmount();
        }
        System.out.println("\t\tTotal: " + total);
    }

}
