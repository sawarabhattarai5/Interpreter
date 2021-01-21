package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class LoadCode extends ByteCode
    {
        private int VAL;
        private String LITERALVAL;

    public void init (ArrayList<String> bytecode)
    {
        if (bytecode.size() != 1) {
            VAL = Integer.parseInt((String) bytecode.get(0));
            LITERALVAL = (String) bytecode.get(bytecode.size() -1);
            }
        else {
            VAL = Integer.parseInt((String) bytecode.get(0));
            }
    }

    public void execute(VirtualMachine vm) {

        vm.load(VAL);
    }

    public String toString() {
        return "LOAD " + VAL + " " + LITERALVAL;
    }
}
