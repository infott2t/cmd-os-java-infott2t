package org.example;

//작성자 : https://blog.naver.com/tt2t2am1118
//작성일 : 2020-02-27
//인사 : 아무렇게나 사용하셔도 됨니다. 사회적으로.. 도덕적으로..올바르게, 사용. 코드, 재미로 만든것이군요.
//       소스코드는 마음대로, 제가 만들기는 했지만, 마음대로 적어보세요.
//       String부분, 자기 마음대로. 그래도 출처를 달듯이, 작성일, 작성자, 어떤 것을 사용했는지는 다는 것이 좋겠죠.
//       또, 교회. 다녀보세요. 기독교. 주말에 교회 가면, 잘 안내해줌니다. 저의 코드, 봐 주셔서 감사합니다.
//참조한 책: 초보자를 위한 JAVA 언어 200제

import java.util.Scanner;

public class Main_Scanner {
    String commandExitString;

    public Main_Scanner() {
        // TODO Auto-generated constructor stub
        System.out.println("CMD-OS-JAVA-infott2t (github.com, @infott2t)");
        System.out.println("Use Java(https://oracle.com)");


        System.out.println("Enjoy. 'exit' String input, outbreak.");
        System.out.println("Let's go there. Church. Jesus Christ. Calling. Social resting place. I like this writing.");
        System.out.println("Thank you, and using. Thank you. Hope good developping. yours. ...");
        do {
            System.out.print("?");
            Scanner input = new Scanner(System.in);
            String n = input.next();
            //System.out.println(n);

            if(n.equals("exit")) {commandExitString="exit";}else{
                System.out.println("Ok");
            }

        }while(commandExitString!="exit");
        System.out.println("Thank you, for using. Thank you.");

    }

    public static void main(String[] args) {
        new Main_Scanner();
    }
}
