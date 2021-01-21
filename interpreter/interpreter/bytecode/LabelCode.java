package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class LabelCode extends ByteCode
    {
        private String Label;
        
        public void init(ArrayList<String> bytecode) {
        
            Label =  bytecode.get(0);
         }

         public void execute(VirtualMachine vm){
         }

         public String getLabel() {
        
             return Label;
        }

         public String toString() {
        
             return "LABEL " + Label;
        }
    }
