package com.mirim.biz.common;

import com.mirim.biz.user.UserVO;
import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {
    public void afterReturningLog(JoinPoint jp, Object returnObj) {
        String method = jp.getSignature().getName();

        if(returnObj instanceof UserVO){ // 왼쪽과 오른쪽 같은 것인지 비교하는 연산자
            UserVO user = (UserVO) returnObj; // 다운 캐스팅
            if(user.getRole().equals("Admin")){ // 관리자인지 확인
                System.out.println(user.getName() + "로그인(Admin)");

            }
        }
        System.out.println("[사후처리]" + method + "() 메소드 리턴 값 : " + returnObj.toString());
    }
}
