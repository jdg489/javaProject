package Interface.ex3;

public interface Phone {
	static final char[] NUMBERPAD = {'1','2','3','4','5',
			'6','7','8','9','*','0','#'};
	
	public abstract String makeCall();
	String takeCall();
	
	
}