package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

    public class BopCode extends ByteCode {

         private String operator;

         public void init(ArrayList bytecode) {

             operator = (String) bytecode.get(0);
    }

    public void execute(VirtualMachine vm) {
        int firstvalue = vm.pop();
        int secondvalue = vm.pop();

             if(operator.equals("+")) {
            vm.push(firstvalue + secondvalue);
             }

             else if (operator.equals("-")) {
            vm.push(secondvalue - firstvalue);
             }

            else if(operator.equals("/")) {
            vm.push(secondvalue / firstvalue);
             }

            else if(operator.equals("*")) {
            vm.push(firstvalue * secondvalue);
            }

            else if(operator.equals("==")) {
                    if (firstvalue == secondvalue) {
                         vm.push(1);
                    }
                else {
                     vm.push(0);
                    }
                }

            else if(operator.equals("!=")) {
                    if (firstvalue != secondvalue) {
                        vm.push(1);
                    }
                    else {
                         vm.push(0);
                    }
                }

             else if(operator.equals("<=")) {
                     if (secondvalue <= firstvalue) {
                         vm.push(1);
                     }
                     else {
                         vm.push(0);
                     }
                 }

            else if(operator.equals(">=")) {
                 if (secondvalue >= firstvalue) {
                     vm.push(1);
                     }
                 else {
                     vm.push(0);
                   }
              }

             else if(operator.equals(">")) {
                 if (secondvalue > firstvalue) {
                      vm.push(1);
                   }
                  else {
                      vm.push(0);
                 }
             }

             else if(operator.equals("<")) {
                 if (secondvalue < firstvalue) {
                      vm.push(1);
                 }
                else {
                     vm.push(0);
                }
             }

             else if(operator.equals("|")) {
                 if (firstvalue == 0 || secondvalue == 0) {
                     vm.push(0);
                 }
                 else {
                     vm.push(1);
                 }
             }

             else if(operator.equals("&")) {
                 if (firstvalue == 1 && secondvalue == 1) {
                      vm.push(1);
                 }
                 else {
                     vm.push(0);
                 }
             }
        }

     public String toString() {

             return "BOP" + operator;
         }
    }
