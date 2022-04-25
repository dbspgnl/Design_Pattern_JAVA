package Template_Method.Library_GameConnect;

// 외부 라이브러리라고 가정한 클래스
public abstract class AbsGameConnect {

	// GameConnect 단계 정의
    abstract protected String doSecurity(String password);
	abstract protected String authentication(String id, String encryptPassword);
	abstract protected int authorization(String userAuth);
	abstract protected String connection(int auth);

	// 템플릿 메소드
	public String requestConnection(String id, String password) {

		// 입력된 정보를 암호화 합니다.
		String encryptPassword = doSecurity(password);

		// 해당 아이디로 패스워드로 인증시도
		String userAuth = authentication(id, encryptPassword);

		// 인증에 성공한 유저 정보를 통해서 권한 레벨 확인
		int auth = authorization(userAuth);

		// 인증 레벨을 통해서 접속 시도
		return connection(auth);
	}
}
