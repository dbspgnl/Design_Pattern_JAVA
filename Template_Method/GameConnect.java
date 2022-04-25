package Template_Method;

import Template_Method.Library_GameConnect.AbsGameConnect;

public class GameConnect extends AbsGameConnect{

    @Override
    protected String doSecurity(String password) {
        String encryptPassword = password + "암호화"; // 복호화 작업
        return encryptPassword;
    }

    @Override
    protected String authentication(String id, String encryptPassword) {
        String auth = "";
        if(id.equals("admin") && encryptPassword.equals("1234암호화")){
            auth = "admin";
        }
        else if(id.equals("uesr") && encryptPassword.equals("1234암호화")){
            auth = "user";
        }
        else {
            auth = "unknown";
        }
        return auth;
    }

    @Override
    protected int authorization(String userAuth) {
        int authLevel = 0;
        if(userAuth.equals("admin")) authLevel = 2;
        if(userAuth.equals("uesr")) authLevel = 1;
        return authLevel;
    }

    @Override
    protected String connection(int auth) {
        if(auth == 2) { 
            System.out.println("관리자입니다.");
            return "성공";
        }
        else if(auth == 1){
            System.out.println("유저입니다.");
            return "성공";
        }
        else {
            System.out.println("알 수 없는 유저입니다.");
            return "실패";
        }
    }
    
}
