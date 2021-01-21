package interpreter.bytecode;

import java.util.ArrayList;

public abstract class BranchCode extends ByteCode {
    @Override
    public abstract void init(ArrayList<String> bytecode);

    @Override
    public abstract void execute(interpreter.VirtualMachine vm);

    public abstract String getBytecode();

    public abstract int getLocation();

    public abstract void setLocation(int index);
}