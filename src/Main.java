import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static String getCackeKey(int first, String operation, int second) {
        StringBuilder builder = new StringBuilder();
        builder.append(first);
        builder.append(operation);
        builder.append(second);
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0, second = 0;
        String operation = null, resalt = null;

        for (int i = 0; i < 1; i++) {
            System.out.println("input first number");
            first = scanner.nextInt();
            System.out.println("input operation symbol");
            operation = scanner.next();
            System.out.println("input second number");
            second = scanner.nextInt();
        }

        if (operation == "+") {
            resalt = String.valueOf(first + second);
        } else if (operation == "-") {
            resalt = String.valueOf(first - second);
        } else if (operation == "*") {
            resalt = String.valueOf(first * second);
        } else if (operation == "/") {
            resalt = String.valueOf(first / second);
        }

        System.out.println("rezul'tat vychesleniya: " + resalt);

        String a = getCackeKey(first, operation, second);

        Map<String, String> map = new HashMap<>();

        if (map.containsKey(getCackeKey(first, operation, second)) && map.containsValue(resalt)) {
            System.out.println(map);
        }

        map.put(a, resalt);
        System.out.println(map);
    }
}