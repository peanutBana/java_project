package singletone;

public class Main {
	public static void main(String[] args) {
		User[] user = new User[10]; 	//user객체를 담을 배열을 생성
		
		for(int i=0; i<user.length; i++) {
			//user객체를 생성해서 배열에 넣어준다.
			user[i] = new User("user"+i);
			user[i].print();
		}
		
	}
}
