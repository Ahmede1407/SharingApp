package com.example.sharingapp;

public abstract class Command {
    private boolean is_execute;

    public Command(){
        is_execute = false;
    }
    public abstract void execute();

    public boolean isExecuted(){
        return is_execute;
    }
    public void setIsExecuted(boolean is_execute){
        this.is_execute = is_execute;
    }
}
