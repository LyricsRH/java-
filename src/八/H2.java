package °Ë;

import java.util.TreeSet;

public class H2 extends TreeSet<String> {

	public H2(String...argStrings){
		
		for (String string : argStrings) {
			this.add(string);
		}
	}
}
