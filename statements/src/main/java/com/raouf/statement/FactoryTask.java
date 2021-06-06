package com.raouf.statement;

public class FactoryTask {
    public Task getTask(int number){

        if (number == 7){
            return new Task7();

        }else if (number == 16){
            return new Task16();

        }else if(number == 23){
            return new Task23();

        }else if (number == 31){
            return new Task31();

        }else if (number == 39){
            return new Task39();
        }
        return null;
    }

}
