package interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


    public class RunTimeStack {

         private ArrayList<Integer> runTimeStack;
         private Stack<Integer> framePointer;

        public RunTimeStack() {

             runTimeStack = new ArrayList<>();
             framePointer = new Stack<>();

             framePointer.add(0);
        }

        public void dump(){

              Iterator frameIterator = framePointer.iterator();
              int runValue = (int) frameIterator.next();

              if (frameIterator.hasNext()) {

                 runValue = (int) frameIterator.next();
             }

        System.out.print("[");

            if (!runTimeStack.isEmpty()){

            System.out.print(runTimeStack.get(0));
            }

            for(int i = 1; i < runTimeStack.size(); i++) {

                 if (i == runValue) {

                     System.out.print("] [" + runTimeStack.get(i));

                     if(frameIterator.hasNext()) {

                        runValue = (int) frameIterator.next();
                     }
                 } else {
                   System.out.print("," + runTimeStack.get(i));

                 }
          }
             System.out.println("]");


        }

    public int peek () {

        return runTimeStack.get(runTimeStack.size() - 1);
    }

    public int pop() {

        int PopItem;
        if(!runTimeStack.isEmpty()){
            PopItem = runTimeStack.get(runTimeStack.size()- 1);
            runTimeStack.remove(runTimeStack.size() - 1);
        } else {
            PopItem = 0;
        }

        return PopItem;
    }

    public int push(int i) {

        runTimeStack.add(i);
        return this.peek();
        //return i;
    }

    public void newFrameAt (int offset) {

        int size = this.runTimeStack.size() - offset;
        framePointer.push(size);
    }

    public void popFrame() {

        int Topframvalue = runTimeStack.get(runTimeStack.size() - 1);
        while(runTimeStack.size() != framePointer.peek()) {
            runTimeStack.remove(runTimeStack.size()- 1);
        }

        framePointer.pop();
        runTimeStack.add(Topframvalue);
    }

    public int store(int offset) {

        int Storevalue;
        if(!runTimeStack.isEmpty()){

            Storevalue = runTimeStack.get(runTimeStack.size()- 1);
            runTimeStack.remove(runTimeStack.size() - 1);

        } else {

            Storevalue = 0;
        }
        runTimeStack.add(framePointer.peek() + offset, Storevalue);
        return Storevalue;
    }

    public int load(int offset) {

        int Loadvalue = runTimeStack.get(framePointer.peek() + offset);
        runTimeStack.add(Loadvalue);
        return Loadvalue;
    }

    public Integer push(Integer value) {

        runTimeStack.add(value);
        return this.peek();
       //changed// return i;
    }

}
