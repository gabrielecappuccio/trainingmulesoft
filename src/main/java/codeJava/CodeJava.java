package codeJava;

public class CodeJava {

	public String output1, output2, output3;
	
	public CodeJava() {
		super();
	}

	public CodeJava(String output1, String output2) {
		super();
		this.output1 = output1;
		this.output2 = output2;
	}
	
	public static String invokeStatic () {
		return "Hello to invoke static java method.";
	}

	public static String invokeStaticTwoArgs (String strArg1, String strArg2) {
		return strArg1.concat(" ").concat(strArg2);
	}	

	public static String invokeStaticOneArg (Number numArg) {
		return "Id = ".concat(numArg.toString());
	}	

	public String invoke () {
		this.output1 = "Hello to invoke instance java method.";
		return this.output1;
	}

	public String invokeOneArg (String strArg) {
		this.output3 = "first member : ".concat(this.output1).concat("; second  member : ").concat(this.output2).concat("; method strArg : ").concat(strArg);
		return this.output3;
	}
}
