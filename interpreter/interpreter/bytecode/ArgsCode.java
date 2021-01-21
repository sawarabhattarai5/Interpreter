package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;


public class ArgsCode extends ByteCode
{
        int numValue;

            public void init(ArrayList<String> bytecode) {

                this.numValue = Integer.parseInt(bytecode.get(0));
    }

            public void execute(VirtualMachine vm) {

             vm.newFrameAt(numValue);
    }
            public String toString() {

                return "ARGS" + numValue;
    }


}
