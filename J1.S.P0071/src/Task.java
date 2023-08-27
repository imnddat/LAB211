/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Duc Dat
 */
public class Task {

    private int id;
    private String name;
    private String typeId;
    private String date;
    private double planFrom;
    private double planTo;
    private String assign;
    private String reviewer;
    private double time;

    public Task() {
    }

    public Task(int id, String name, String typeId, String date, double planFrom, double planTo, String assign, String reviewer) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assign = assign;
        this.reviewer = reviewer;
    }

    public double getTime() {
        return getPlanTo() - getPlanFrom();
    }

    public void setTime(double time) {
        this.time = time;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    
    

    @Override
    public String toString() {
        return String.format("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s",
                    getId(),
                    getName(),
                    getTypeId(),
                    getDate(),
                    getTime(),
                    getAssign(),
                    getReviewer());
    }
    
    
}
