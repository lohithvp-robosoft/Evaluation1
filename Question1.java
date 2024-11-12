public class Question1 {
    public static void convertDaystoYear(int todayDays) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30};

        int year = 0;
        int month = 0;
        int days = todayDays;
        int cntYear = 0;
        while (days >= 365) {
            year++;
            cntYear++;
            days = days - 365;
            if ((cntYear % 3 == 0 && days >= 366)) {
                cntYear = 0;
                year++;
                days = days - 366;
                System.out.println("Hello");
            }

            System.out.println(days);
        }

        int count = 0;
        while (days >= months[count]) {
            days = days - months[count];
            month++;
            count++;
        }

        System.out.println(year + " years " + month + " months " + days + " days");
    }

    public static void main(String[] args) {
        convertDaystoYear(456);
    }
}
