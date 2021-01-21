package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;


        public class CallCode extends ByteCode {


             private int Address;
             private String Label;

             @Override
         public void init(ArrayList<String> bytecode) {

                 Label = bytecode.get(0);
          }

            @Override
         public void execute(VirtualMachine vm) {

                 vm.pushReturnAddrs();
                 vm.setPC(Address);
         }

        public String getLabel() {

             return Label;
         }

         public void setAddress(Integer x) {

              this.Address = x;
         }

        @Override
         public String toString() {

             return "CALL " + Label;
             }
    }
