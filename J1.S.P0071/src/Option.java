
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
public class Option {

    List<Task> tasks = new ArrayList<>();
    Validation check = new Validation();
    
    
    public String getTaskType() {
        int choice = check.inputInt("Task Type (1-Code, 2-Test, 3-Design, 4-Review): ", 1, 4);
        String type = null;
        switch (choice) {
            case 1:
                type = "Code";
                break;
            case 2:
                type = "Test";
                break;
            case 3:
                type = "Design";
                break;
            case 4:
                type = "Review";
        }
        return type;
    }

    public void addTask() {
        System.out.println("------------Add Task---------------");
        
        int ID;
        if (tasks.isEmpty()) {
            ID = 1;
        } else {
            ID = tasks.get(tasks.size() - 1).getId() + 1;
        }
        
        String name = check.inputString("Requirement Name: ", "[A-Za-z0-9\\s]+");
        String taskTypeID = getTaskType();
        String date = check.inputDate("Date: ");
        double planFrom = check.inputDouble("From: ", 8, 17);
        double planTo = check.inputDouble("To: ", planFrom + 0.5, 17.5);
        String assign = check.inputString("Assignee: ", "[A-Za-z0-9\\s]+");
        String reviewer = check.inputString("Reviewer: ", "[A-Za-z0-9\\s]+");
        tasks.add(new Task(ID, name, taskTypeID, date, planFrom, planTo, assign, reviewer));
    }

    public void removeTask() {
        System.out.println("---------Del Task------");
        int ID = check.inputInt("ID: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        for (Task task : tasks) {
            if (task.getId() == ID) {
                tasks.remove(task);
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("ID does not exist");
    }

    public void display() {
        System.out.println("----------------------------------------- Task ---------------------------------------");
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                
                if (o1.getTime() > o2.getTime()) {
                    return 1;
                } else if (o1.getTime() < o2.getTime()){
                    return -1;
                } else return 0;
            }
        });
       

        if (tasks.isEmpty()) {
            System.out.println("No task");
            return;
        }
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        for (Task task : tasks) {
//            double time = task.getPlanTo() - task.getPlanFrom();

            System.out.println(task);
                        
        }
    }
}
