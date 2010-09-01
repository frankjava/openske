package com.openske.console;

import java.util.ArrayList;
import java.util.List;

public enum ConsoleCommand {
    HELP("Displays the console help"),
    BEANSHELL("Opens a beanshell interpreter"),
    EXIT("Exits the console"),
    QUIT("Quits the console"),
    START("Starts the OpenSKE engine"),
    STOP("Stops the OpenSKE engine"),
    RESTART("Restarts the OpenSKE engine"),
    ;
    
    private String helpText;
    
    ConsoleCommand(String helpText) {
        this.setHelpText(helpText);
    }
    
    public String toString() {
        return this.name().toLowerCase();
    }
    
    public static String[] valueNames() {
        List<String> cmdList = new ArrayList<String>();
        for(ConsoleCommand cmd : ConsoleCommand.values()) {
            cmdList.add(cmd.toString());
        }
        return cmdList.toArray(new String[0]);
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
    
    public static String displayHelp() {
        StringBuffer sb = new StringBuffer();
        for(ConsoleCommand cmd : ConsoleCommand.values()) {
            sb.append(String.format("%-20s %s\n", cmd.toString(), cmd.getHelpText()));
        }
        return sb.toString();
    }
    
}
