package org.main.input;

import org.board.Board;

import java.util.HashMap;

public enum Command {
    ROTATE((in, board)-> {

    }),
    MOVE((in, board) -> {

    });
    final DoCommand userCommand;


    Command(DoCommand c){
        this.userCommand = c;
    }

    public static Command getCommand(String input){
        HashMap<String, Command> map = new HashMap<>(){
            {
                put("ROTATE ", Command.ROTATE);
                put("MOVE ", Command.MOVE);
            }
        };

        for(String key : map.keySet())
            if(input.startsWith(key)) return map.get(key);
        return null;
    }

    public static String params(String input){
        return input.substring(input.indexOf(" "));
    }
}
