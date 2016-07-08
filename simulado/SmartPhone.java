package simulado;

public class SmartPhone {
	float screenResolution, width, height;

	public static void main(String[] args) {
		SmartPhone phone;
		phone.height = 112.2f;
		phone.width = 56.8f;
		System.out.format("%.0f dpi - %.1f X %.1f", phone.screenResolution,
				phone.height, phone.width);
	}
}
