package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class LitCode extends ByteCode {

        private int values;
        private String LitValue = "";

    @Override
    public void init(ArrayList bytecode) {

        values = Integer.parseInt((String) bytecode.get(0));

        if(bytecode.size() > 1) {

            LitValue = (String) bytecode.get(bytecode.size() - 1);
          }
     }

    @Override
    public void execute(VirtualMachine vm) {
        if(LitValue.equals("")) {
            vm.push(values);
        }
        else {
            vm.push(0);
        }
    }

    @Override
    public String toString() {

        return "LIT " + values + " " + LitValue;
      }
    }
