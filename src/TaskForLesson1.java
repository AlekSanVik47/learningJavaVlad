public class TaskForLesson1 {
    public static boolean isNegative(int x) {
        boolean flag = true;
        if (x < 0) {
            System.out.println("Результат для числа " + x + " будет: " + flag);
            return flag;
        } else {
            flag = false;
            System.out.println("Результат для числа " + x + " будет: " + flag);
            return flag;
        }
    }

    public static void main(String[] args) {
        isNegative(75);
        isNegative(-76);
    }
}
