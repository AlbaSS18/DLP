package ast.types;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
	
	private List<ErrorType> errors;
	private static ErrorHandler instance = new ErrorHandler();
	
	public ErrorHandler() {
		errors = new ArrayList<ErrorType>();
	}
	
	public static ErrorHandler getSingletonInstance() {
        if (instance== null){
        	 instance = new ErrorHandler();
        }
        return  instance;
     }
	
	public void addError(ErrorType type) {
		errors.add(type);
	}
	
	public boolean anyError() {
		if(errors.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public void showErrors(PrintStream printStream) {
		for(ErrorType e: errors) {
			printStream.println(e);
		}
	}

}
