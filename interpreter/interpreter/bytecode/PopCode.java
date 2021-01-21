package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class PopCode extends ByteCode{

         private int VAL;

    public void init(ArrayList<String> bytecode) {

        VAL = Integer.parseInt(bytecode.get(0));
     }

    public void execute(VirtualMachine vm) {
        for(int i = 0; i < VAL; i++) {
            vm.pop();
        }
    }

    public String toString() {
        return "POP " + VAL;
    }
}
