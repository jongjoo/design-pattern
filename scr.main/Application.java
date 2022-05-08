import service.PatternService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        while (true) {
            guidePrint();
            String input = ScanningText();
            if ("0".equals(input)) {
                return;
            }
            PatternService patternService = new PatternService();
            patternService.run(input);
        }
    }

    public static void guidePrint(){
        System.out.println(" ** 패턴을 선택하세요. (종료는 0) ** \n" +
                "1 - 전략패턴 \n" +
                "2 - 옵저버패턴 \n" +
                "3 - \n" +
                "4 - \n");
    }

    public static String ScanningText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
