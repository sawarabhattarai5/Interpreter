package interpreter.bytecode;

import java.util.ArrayList;
import interpreter.VirtualMachine;

    public class HaltCode extends ByteCode
        {

            public void execute (VirtualMachine vm) {

               vm.halt();
            }

            public void init(ArrayList<String> bytecode) {
            }

             public String toString() {

                 return "HALT";
             }


        }
