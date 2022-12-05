package test.ch15.lamda;

@FunctionalInterface	//인터페이스에 하나의 메소드만 있는지 확인
public interface Calculable {
	void calc(int x, int y);
}
