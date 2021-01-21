package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class StoreCode extends ByteCode {

    private int num, VAL;
    private String LITERALVAL;

    @Override
    public void init(ArrayList<String> bytecode) {
        if(bytecode.size() != 1) {
            num = Integer.parseInt(bytecode.get(0));
            LITERALVAL = (bytecode.get(bytecode.size() -1));
        }else {
            VAL = Integer.parseInt(bytecode.get(0));
        }
    }
    @Override
    public void execute (VirtualMachine vm) {
        VAL = vm.peek();
        vm.store(num);

    }
    @Override
    public String toString() {
        return "STORE "+ num + " " + LITERALVAL + " " + LITERALVAL + " = " + VAL ;
    }
}
