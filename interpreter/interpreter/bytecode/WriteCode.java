package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class WriteCode extends ByteCode {


    public void init (ArrayList<String> bytecode) {

    }
    public void execute(VirtualMachine vm) {

        System.out.println(vm.peek());
    }

    public String toString() {

        return "WRITE";
    }
}
