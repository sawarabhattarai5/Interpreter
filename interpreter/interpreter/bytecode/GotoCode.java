package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class GotoCode extends ByteCode {

        private int Address;
        private String Label;

    @Override
    public void init(ArrayList bytecode) {

        Label = (String) bytecode.get(0);
    }

    @Override
    public void execute(VirtualMachine vm) {

        vm.setPC(Address);
    }

    public String getLabel() {

        return Label;
    }

    public void setAddress(Integer y) {

            this.Address = y;
        }
    @Override
    public String toString() {

        return "GOTO " + Label;
    }
}
