package behavioral.command.calculator;

import java.util.Stack;

public class CasioCalculator {
    Stack<ICommand> undos = new Stack<>();
    Stack<ICommand> redos = new Stack<>();
    CommandHandler handler = new CommandHandler();

    public void compute(char operator, float operand){
        ICommand command = new CalculatorCommand(operator, operand, handler);
        command.execute();
        redos.clear();
        undos.push(command);
    }

    public void undo(){
        if(!undos.empty()){
            ICommand command = undos.pop();
            redos.push(command);
            System.out.println("undo: ");
            command.unexecute();
        }
    }

    public void redo(){
        if(!redos.empty()){
            ICommand command = redos.pop();
            undos.push(command);
            System.out.println("redo: ");
            command.execute();
        }
    }

    public void clear(){
        handler.result = 0;
        undos.clear();
        redos.clear();
    }
}
