import java.util.Scanner;

public class Day2_ControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. if-else example
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("✅ You are an Adult.");
        } else if (age >= 13) {
            System.out.println("🧒 You are a Teenager.");
        } else {
            System.out.println("👶 You are a Child.");
        }

        // 2. switch case example
        System.out.print("Enter day number (1 to 7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("📅 Monday");
            case 2 -> System.out.println("📅 Tuesday");
            case 3 -> System.out.println("📅 Wednesday");
            case 4 -> System.out.println("📅 Thursday");
            case 5 -> System.out.println("📅 Friday");
            case 6 -> System.out.println("📅 Saturday");
            case 7 -> System.out.println("📅 Sunday");
            default -> System.out.println("❌ Invalid Day");
        }

        // 3. for loop
        System.out.println("\n🎯 For loop 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value: " + i);
        }

        // 4. while loop
        System.out.println("\n🔄 While loop (5 to 1):");
        int x = 5;
        while (x > 0) {
            System.out.println("Countdown: " + x);
            x--;
        }

        // 5. do-while loop
        System.out.println("\n🔁 Do-While loop:");
        int y = 1;
        do {
            System.out.println("Y = " + y);
            y++;
        } while (y <= 3);

        // 6. Loop with break and continue
        System.out.println("\n🚦 Loop with break and continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("⛔ Skipping 3 with continue");
                continue;
            }
            if (i == 5) {
                System.out.println("🚫 Breaking at 5");
                break;
            }
            System.out.println("Processing: " + i);
        }

        sc.close();
    }
}
