
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Duc Dat
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<>();
        Validation v = new Validation();
        Option o = new Option();
        while (true) {
            v.menu();
            int option = v.inputInt("Your choice: ", 1, 4);
            //handing option
            switch (option) {
                case 1:
                    o.addTask();
                    break;
                case 2:
                    o.removeTask();
                    break;
                case 3:
                    o.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

}
