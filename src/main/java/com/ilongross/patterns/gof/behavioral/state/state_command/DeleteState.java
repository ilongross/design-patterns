package com.ilongross.patterns.gof.behavioral.state.state_command;

public class DeleteState extends DocumentState{
    public DeleteState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        System.out.println("Deleted!");
        return false;
    }

    @Override
    public boolean onReconsiliation() {
        System.out.println("Deleted!");
        return false;
    }

    @Override
    public boolean onApprove() {
        System.out.println("Deleted!");
        return false;
    }

    @Override
    public boolean onReject() {
        System.out.println("Deleted!");
        return false;
    }

    @Override
    public boolean onDelete() {
        System.out.println("Deleted!");
        return false;
    }
}
