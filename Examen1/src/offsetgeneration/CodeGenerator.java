package offsetgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import ast.definitions.Definition;
import ast.definitions.VarDefinition;
import ast.types.Type;
import ast.types.TypeChar;
import ast.types.TypeDouble;
import ast.types.TypeInt;

public class CodeGenerator {
	
	private PrintWriter out;
	
	private String inputFile;
	
	private int contador = 0;
	
	public CodeGenerator(String inputFile, String outputFileName) {
		try {
			out = new PrintWriter(new File(outputFileName));
			this.inputFile = inputFile;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//--------------Push instructions--------------
	
	public void push(int constant) 
	{
		out.println("\tpushi\t" + constant);
		out.flush();
	}
	
	public void push(double constant) 
	{
		out.println("\tpushf\t" + constant);
		out.flush();
	}
	
	public void push (char constant)
	{
		out.println("\tpushb\t" + (int)constant);
		out.flush();
	}
	
	public void pushBP()
	{
		out.println("\tpush\tbp");
		out.flush();
	}
	
	public void pushA(int direccion)
	{
		out.println("\tpusha\t" + direccion);
		out.flush();
	}
	
	//--------------Load and store--------------
	
	public void load(Type type) {
		out.println("\tload" + type.suffix());
		out.flush();
	}
	public void store(Type type) {
		out.println("\tstore" + type.suffix());
		out.flush();
	}
	//--------------Popping and duplicating values on the stack--------------
	public void pop(Type type) {
		out.println("\tpop" + type.suffix());
		out.flush();
	}
	
	public void dub(Type type) {
		out.println("\tdub\t" + type.suffix());
		out.flush();
	}
	//--------------Arithmetic operations--------------
	public void arithmetic(String aritmethicOperator, Type type) {
		String operator = "";
		if(aritmethicOperator.equals("+")) {
			operator = "\tadd";
		}
		if(aritmethicOperator.equals("-")) {
			operator = "\tsub";
		}
		if(aritmethicOperator.equals("*")) {
			operator = "\tmul";
		}
		if(aritmethicOperator.equals("/")) {
			operator = "\tdiv";
		}
		if(aritmethicOperator.equals("%")) {
			operator = "\tmod";
		}
		out.println(operator + type.suffix());
		out.flush();
	}
	
	public void add(Type type) {
		out.println("\tadd" + type.suffix());
		out.flush();
	}
	
	public void mul(Type type) {
		out.println("\tmul" + type.suffix());
		out.flush();
	}
	
	//--------------Comparison operations--------------
	public void comparison(String comparisonOperator, Type type) {
		String operator = "";
		if(comparisonOperator.equals(">")) {
			operator = "\tgt";
		}
		if(comparisonOperator.equals("<")) {
			operator = "\tlt";
		}
		if(comparisonOperator.equals(">=")) {
			operator = "\tge";
		}
		if(comparisonOperator.equals("<=")) {
			operator = "\tle";
		}
		if(comparisonOperator.equals("==")) {
			operator = "\teq";
		}
		if(comparisonOperator.equals("!=")) {
			operator = "\tne";
		}
		out.println(operator + type.suffix());
		out.flush();
		
	}
	//--------------Logical operations--------------
	public void logic(String logicalOperator) {
		String operator = "";
		if(logicalOperator.equals("&&")) {
			operator = "\tand\t";
		}
		if(logicalOperator.equals("||")) {
			operator = "\tor\t";
		}
		if(logicalOperator.equals("!")) {
			operator = "\tnot\t";
		}
		out.println(operator);
		out.flush();
	}
	//--------------Input / Output--------------
	public void out(Type type) {
		out.println("\tout" + type.suffix());
		out.flush();
	}
	
	public void in(Type type) {
		out.println("\tin" + type.suffix());
		out.flush();
	}
	//--------------Conversions--------------
	public void convertTo(Type expressionType1, Type expressionType2) {
		if(expressionType1.equals(expressionType2)) {
			return;
		}
		
		if(expressionType1 instanceof TypeChar) {
			out.println("\tb2i");
			if(expressionType2 instanceof TypeDouble)
				out.println("\ti2f");
		}
		if(expressionType1 instanceof TypeInt) {
			if(expressionType2 instanceof TypeDouble) {
				out.println("\ti2f");
			}
			else if(expressionType2 instanceof TypeChar) {
				out.println("\ti2b");
			}
		}
		if(expressionType1 instanceof TypeDouble) {
			out.println("\tf2i");
			if(expressionType2 instanceof TypeChar) {
				out.print("\ti2b");
			}
		}
		
	}
	
	public void cast(Type expressionType, Type castType) {
		if(expressionType.equals(castType)) {
			return;
		}
		
		if(expressionType instanceof TypeChar) {
			out.println("\tb2i");
			if(castType instanceof TypeDouble)
				out.println("\ti2f");
		}
		if(expressionType instanceof TypeInt) {
			if(castType instanceof TypeDouble) {
				out.println("\ti2f");
			}
			else if(castType instanceof TypeChar) {
				out.println("\ti2b");
			}
		}
		if(expressionType instanceof TypeDouble) {
			out.println("\tf2i");
			if(castType instanceof TypeChar) {
				out.print("\ti2b");
			}
		}
		
	}
	//--------------Jumps--------------
	public void jmp(int label) {
		out.println("\tjmp\t" + "label" + label);
		out.flush();
	}
	public void jz(int label) {
		out.println("\tjz\t" + "label" + label);
		out.flush();
	}
	public void jnz(int label) {
		out.println("\tjnz\t" + "label" + label);
		out.flush();
	}
	
	//--------------Functions--------------
	public void label(String label) {
		out.println(" " + label + ":\t");
		out.flush();
	}
	
	public void call(String label) {
		out.println("call " + label);
		out.flush();
	}
	
	public void callFunction(String label) {
		out.println("\tcall " + label);
		out.flush();
	}
	
	public void ret(int size, int bytesReturn, int bytesLocalVariables) {
		out.println("\tret\t" + size + ", " + bytesReturn + ", " + bytesLocalVariables);
		out.flush();
	}
	
	public void enter(int number) {
		out.println("\tenter\t" + number);
		out.flush();
	}
	
	public void halt() {
		out.println("halt");
		out.flush();
	}
	//--------------Debugging info--------------
	public void source(String inputFileName){
		out.println("\n#source\t\"" + inputFileName + "\"\n");
		out.flush();
	}
	
	public void line(int line){
		out.println("\n#line\t\"" + line + "\"\n");
		out.flush();
	}
	
	public void comment (String comment) {
		out.println("\t' *\t" + comment);
		out.flush();
	}
	
	public void commentLine (int line) {
		out.println();
		out.println("#line\t" + line);
		out.flush();
	}
	
	public void commentMain () {
		out.println("' Invocation to the main function");
		out.flush();
	}

	public void commentDefinition(Definition var) {
		out.println("\t' *\t" + var.getType() + " " + var.getName() + "\t(offset "  + ((VarDefinition)var).getOffset() + ")");
		out.flush();
	}

	public String getInputFile() {
		return inputFile;
	}

	public void commentWhite() {
		out.println();
		out.flush();
	}

	public int getLabel(int label) {
		int aux = contador;
		contador += label;
		return aux;
	}

	
}
