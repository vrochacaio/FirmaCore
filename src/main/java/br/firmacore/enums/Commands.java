package br.firmacore.enums;

public enum Commands {
    CASA, TRIBO, TRIBUTOS;

    public static boolean contains(String command){
        for(Commands ce : Commands.values()){
            if(ce.name().equalsIgnoreCase(command)){
                return true;
            }
        }
        return false;
    }
}
