package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class ReturnCode extends ByteCode {

    private String Label;

    public void init (ArrayList<String> bytecode) {
        if(!bytecode.isEmpty()) {
            Label = bytecode.get(0);
        } else {
            Label = null;
        }
    }

    public void execute(VirtualMachine vm){

        vm.setPC(vm.popReturnAddrs());
        vm.popFrame();
    }

    public String toString(){
        if (Label != null) {
        return "RETURN " + Label;

    } else{
        return "RETURN";
      }
    }
}
