class CastTwo {
	public static void main(String args[]) {
		byte byte1 ;
		short short1;
		char char1 = '\ud55c';
		int int1;
		float float1 = 3.6f;
		byte1 = (byte) char1;
		System.out.print("char1 = "+char1 + " =>\t byte1 = "+byte1);
		System.out.println(" => \t(char)"+byte1 +" = "+(char) byte1);
		short1 = (short) char1;
		System.out.print("char1 = "+char1 + " =>\t short1 = "+short1);
		System.out.println(" => \t(char)"+short1 +" = "+(char) short1);
		int1 = char1;
		System.out.print("char1 = "+char1 + " =>\t int1 = "+int1);
		System.out.println(" => \t(char)"+int1 +" = "+(char) int1);
		int1 = (int) float1; // float(32 bits) => int(32 bits)
		System.out.print("float1 = "+float1 + " => \t int1 = "+int1);
		System.out.println(" => \t(float)"+int1 +" = "+(float) int1);
		short1 = -134;
		byte1 = (byte) short1;
		System.out.println("short1 = "+short1 + " => \t byte1 = "+byte1);
		/*
		 * '한'의 아스키코드가 바이트로 변환되어야 하는데 byte의 최대 범위를 넘어 92로 변환되고 92는 아스키코드로 /로 변화된다.
'한'이 아스키코드로 short로 변환되면 -10916이 되고 char로 변환되면 '한'으로 변환된다.(범위를 초과하지 않아 1번처럼 달라지는 점이 없음.)
'한'은 int로 54620으로 변환되어 저장되고, 54620은 char로 변환되면 '한'이라는 문자로 저장된다.(범위를 초과하지 않아 1번처럼 달라지는 점이 없음.)
int는 지수를 못 나타내기 때문에 3으로 저장이 되고 다시 float는 실수형이기 때문에 3.0으로 출력된다.
byte는 -123까지 출력이 가능하여 short자료형의 -134는 오버플로우가 되어 122가 출력된다.
		 */
	}
}
