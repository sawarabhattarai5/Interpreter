package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class DumpCode extends ByteCode {

        private String Label;
        @Override
        public void init (ArrayList<String> bytecode) {

            Label = bytecode.get(0);
        }

        @Override
    public void execute(VirtualMachine vm) {

        if(Label.equals("ON")) {

            vm.setDumps(true);

         }
        else if (Label.equals("OFF")) {

            vm.setDumps(false);
         }
      }

      @Override
    public String toString() {

        return "DUMP" + Label;
     }
  }
