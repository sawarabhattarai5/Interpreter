package interpreter.bytecode;


import interpreter.VirtualMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;


public class ReadCode extends ByteCode {

    private String line;
    public void init (ArrayList<String> bytecode){
    }

    public void execute(VirtualMachine vm){

        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter an Integer: ");
            line = file.readLine();
            vm.push(Integer.parseInt(line));

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    @Override
    public String toString() {

        return "READ" + line;
    }
}
