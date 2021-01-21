package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class FalseBranchCode extends ByteCode {

        private int Address;
        private String Label;

        public void init(ArrayList<String> bytecode) {

            Label =  bytecode.get(0);
        }


        public void execute(VirtualMachine vm) {

        int value = vm.pop();

        if(value == 0) {

            vm.setPC(Address);
        }
    }

    public String getLabel() {

        return Label;
    }

    public void setAddress(Integer y) {

        this.Address = y;
    }

    public String toString() {

        return "FALSEBRANCH " + Label;
    }

}
