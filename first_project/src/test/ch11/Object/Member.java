package test.ch11.Object;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//논리적 동등 만들기 : 객체의 주소와 상관없이 필드의 값으로 비교
	@Override
	public boolean equals(Object obj) {
		
		//obj가 Member객체를 가지고있냐?
		if(obj instanceof Member) {
			Member target = (Member)obj;	//강제 형변환
			
			if(id.equals(target.id)) {		
				return true;
			}
		}
		return false;
	}


	
	
	
	
		public static void main(String[] args) {
//			Object obj1 = new Object();
//			Object obj2 = obj1;
//			
//			System.out.println(obj1);
//			System.out.println(obj2);
//			System.out.println(obj1.equals(obj2));		//번지수를 비교
//			System.out.println(obj1 == obj2);		//번지수를 비교
//			
//			String a = "1";
//			String b = "1";
//			
//			if(a.equals(b)) {		//주소가 아닌 값을 직접 비교
//				System.out.println("같다.");
//			}
//			else {
//				System.out.println("다르다.");
//			}

			//논리적 동등 : 같은 갹채든 다른 객체든 객체 저장 데이터가 동일하다.
		}

}
