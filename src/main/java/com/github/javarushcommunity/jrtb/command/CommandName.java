package com.github.javarushcommunity.jrtb.command;

public enum CommandName {

    START("/start"),
    STOP("/stop"),
    HELP("/help"),
    NO("/nocommand"),
    STAT("/stat"),
    LIST_GROUP_SUB("/listgroupsub"),
    ADD_GROUP_SUB("/addgroupsub"),
    DELETE_GROUP_SUB("/deletegroupsub"),
    ADMIN_HELP("/ahelp");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

}
