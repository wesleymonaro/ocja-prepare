package simulado;

interface StringInterface {
	public String toString();
}

public class SuperString implements StringInterface {
	public String toString() {
		return "Super String 1";
	}

	public Object toString(String str) {
		return "Super String 2";
	}
}

class SubString extends SuperString {
	public String toString() {
		return "Sub String 1";
	}

	public String toString(String str) {
		return "Sub String 2";
	}

	public static void main(String[] args) {
		StringInterface string = new SubString();
		System.out.println(string.toString("test"));
	}
}
