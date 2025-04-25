package ch11_access_modifier;
/*
    1. Bank클래스
        1) 필드
            accountNum(계좌번호, 정수)
            accountHolder(예금주이름, 문자열)
            balance(잔액, 정수)
            pinNumber(비밀번호, 4자리 정수, 0 ~ 9999)
            전부 다 private 적용
        2) 생성자
            기본 생성자
            계좌번호만 받는 생성자
            계좌번호, 예금주만 받는 생성자
            계좌번호, 예금주, 초기잔액을 받는 생성자
            계좌번호, 예금주, 초기전액, 비밀번호를 받는 생성자

        3) 메서드
            setter / getter
            특히, Setter의 경우에는 유효성 검증 로직을 편집
                -> 잔액은 음수가 입력될 수 없음
                -> 비밀번호는 0 이상 9999 이하까지만 가능 -> 실패하면 "불가능한 비밀번호입니다."
            deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2() 유형
                -> 올바른 비밀번호인지 확인할 것 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                -> 유효한 금액인지 검증(amount가 0 초과여야함) -> 실패하면 "불가능한 입력 금액입니다." 하고 종료
                -> 성공한다면
                    콘솔창에 입금 성공! 현재 잔액 : ****원

            withdraw(int amount, int inputPin) -> 출금 관련 메서드 / call2()
                -> 올바른 비밀번호인지 확인할 것 -> 틀리면 " 비밀번호가 틀렸습니다" 하고 메서드 종료
                -> 유효한 금액인지 검증(amount가 0 초과여야함) -> 실패하면 "불가능한 입력 금액입니다." 하고 종료
                -> 출금한 후의 잔약이 0원 '이상'인지 확인 - 음수라면 "잔액 부족! 출금이 불가능합니다." 하고 메서드 종료
                - 성공한다면
                    콘솔창에 출금 성공! 현재 잔액 : ****원

            showAccountInfo() // call1() 유형
                - 콘솔창에
                    김일 님의 계좌 번호는 123123이며, 현재 잔액은 10000원입니다.

            BankMain 클래스에 객체를 만들어서 setter / getter를 사용하여 계좌 정보 및 출력을 해보고,
            deposit() / withdraw()를 실행시켜 입금 성공 및 실패 사례를 확인하고, 통과되는지 검증.


            실행 예
            
            displayInfo() // 메서드 추가
            계좌 번호 : 123456
            계좌 소유자 : 홍길동
            현재 잔액 : 100000원                 (십만원)

            계좌 번호 : 987654
            계좌 소유자 : 신사임당
            현재 잔액 : 500000원                 (오십만원)

            50000원이 입금되었습니다. 현재 잔액 : 150000원            # account1에 대한 입금(오만원 입금)
            잔액이 부족하여 출금할 수 없습니다.                        # account1에서 200000원 출금 시도 실패 사례(이십만원 출금 실패사례)
            100000원이 출금되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금 (십만원 출금 성공)

            100000원이 출금되었습니다. 현재 잔액 : 400000원           # account2에 대한 출금(십만원 출금)
            200000원이 입금되었습니다. 현재 잔액 : 600000원           # account2에 대한 입금(이십만원 입금)

            최종 계좌 정보
            계좌 소유자 : 홍길동
            계좌 번호 : 123456
            현재 잔액 : 50000원                 (오만원)

            계좌 소유자 : 신사임당
            계좌 번호 : 987654
            현재 잔액 : 600000원                 (육십만원)
 */
public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank(123,"kkk",10000, 1111);
        bank2.displayInfo();

//        bank1.setAccountNum(1234);
//        bank1.setAccountHolder("김종보");
//        bank1.setBalance(-11);
//        System.out.println(bank1.getBalance());
//        bank1.setBalance(100000);
//        bank1.setPinNumber(1111);
//
//        //비밀번호가 틀린경우
//        bank1.deposit(1000,1112);
//        //입금금액이 틀린경우
//        bank1.deposit(-1000,1111);
//        //성공사례
//        bank1.deposit(1000,1111);
//
//        //비밀번호가 틀린경우
//        bank1.withdraw(999,1112);
//        //출금금액 실패
//        bank1.withdraw(-999,1111);
//        //출금금액 초과시
//        bank1.withdraw(1001,1111);
//        //성공사례
//        bank1.withdraw(999,1111);
//
//        bank1.showAccountInfo();
        bank1.displayInfo();


    }
}
