package com.ilongross.patterns.gof.behavioral.state.state_command.command;

import com.ilongross.patterns.gof.behavioral.state.state_command.Document;

public abstract class DocumentOperation {

    Document document; // As command runner

    public abstract boolean execute();

}
