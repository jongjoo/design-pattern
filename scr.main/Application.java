import service.PatternService;

import java.rmi.RemoteException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {

        while (true) {
            guidePrint();
            String input = scanningText();
            if ("0".equals(input)) {
                return;
            }
            PatternService patternService = new PatternService();
            patternService.run(input);
        }
    }

    public static void guidePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ** 패턴을 선택하세요. (종료는 0) ** \n");
        stringBuilder.append("1 - 전략 패턴 \n");
        stringBuilder.append("2 - 옵저버 패턴 \n");
        stringBuilder.append("3 - 데코레이션 패턴\n");
        stringBuilder.append("4 - 팩토리 패턴\n");
        stringBuilder.append("5 - 커맨드 패턴\n");
        stringBuilder.append("6 - 퍼사드 패턴\n");
        stringBuilder.append("7 - 템플릿 메소드 패턴\n");
        stringBuilder.append("7-1 - 템플릿 메소드 패턴 (오리 정렬) \n");
        stringBuilder.append("7-2 - 템플릿 메소드 패턴 (JFrame) \n");
        stringBuilder.append("8 - 반복자 패턴 \n");
        stringBuilder.append("8-1 - 반복자 패턴 Iterator\n");
        stringBuilder.append("9 - 복합체 패턴\n");
        stringBuilder.append("10 - 상태 패턴\n");
        stringBuilder.append("11 - 프록시 패턴\n");
        stringBuilder.append("12 - 복합 패턴 (오리)\n");

        System.out.println(stringBuilder);
    }

    public static String scanningText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
