package HwLesson25;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
//Date
        long m1 = System.currentTimeMillis();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("d-M-yy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-d");
        SimpleDateFormat sdf4 = new SimpleDateFormat("yy/M/d");
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy.dd.MM");
        Date matveyBirthtDate1 = new Date(90, 9, 7);
        System.out.println(sdf1.format(matveyBirthtDate1));
        System.out.println(sdf2.format(matveyBirthtDate1));
        System.out.println(sdf3.format(matveyBirthtDate1));
        System.out.println(sdf4.format(matveyBirthtDate1));
        System.out.println(sdf5.format(matveyBirthtDate1));
        Date now1 = new Date();
        System.out.println(matveyBirthtDate1.equals(now1));
        long duration  = now1.getTime() - matveyBirthtDate1.getTime();
        long fullYears1 = (TimeUnit.MILLISECONDS.toDays(duration))/365;
        long theRestOfDays = (TimeUnit.MILLISECONDS.toDays(duration))%365;
        System.out.println("Матвею " + fullYears1 + " года и " + theRestOfDays + " дня.");
        System.out.println("Время выполнения Date - " + (double) (System.currentTimeMillis() - m1) + " ms.\n");


//LocalDate
        long m2 = System.currentTimeMillis();
        LocalDate matveyBirthtDate2 = LocalDate.of(1990, 9, 7);
        int year = matveyBirthtDate2.getYear();
        int month = matveyBirthtDate2.getMonthValue();
        int dayOfMonth = matveyBirthtDate2.getDayOfMonth();
        System.out.println(matveyBirthtDate2);
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);
        System.out.printf("%d-%d-%d \n", dayOfMonth, month, year);
        System.out.printf("%d/%d/%d \n", dayOfMonth, month, year);
        System.out.printf("%d%d%d \n", dayOfMonth, month, year);
        LocalDate now2 = LocalDate.now();
        System.out.println(now2);
        System.out.println(matveyBirthtDate2.equals(now2));
        Period period = Period.between(matveyBirthtDate2, now2);
        long fullYears2 = period.getYears();
        long fullMonths2 = period.getMonths();
        long fullDays2 = period.getDays();
        System.out.println("Матвею " + fullYears2 + " года, " + fullMonths2 + " месяца и " + fullDays2 + " дня.");
        System.out.println("Время выполнения LocalDate - " + (double) (System.currentTimeMillis() - m2) + " ms.\n");

//LocalDateTime
        long m3 = System.currentTimeMillis();
        LocalDateTime matveyBirthtDate3 = LocalDateTime.of(1990, 9, 7,6,0,00,0000000000);
        int year1 = matveyBirthtDate3.getYear();
        int month1 = matveyBirthtDate3.getMonthValue();
        int dayOfMonth1 = matveyBirthtDate3.getDayOfMonth();
        System.out.println(matveyBirthtDate3);
        System.out.printf("%d.%d.%d \n", dayOfMonth1, month1, year1);
        System.out.printf("%d-%d-%d \n", dayOfMonth1, month1, year1);
        System.out.printf("%d/%d/%d \n", dayOfMonth1, month1, year1);
        System.out.printf("%d%d%d \n", dayOfMonth1, month1, year1);
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3);
        System.out.println(matveyBirthtDate3);
        System.out.println(matveyBirthtDate3.equals(now3));
        Period period2 = Period.between(matveyBirthtDate3.toLocalDate(), now3.toLocalDate());
        long fullYears3 = period2.getYears();
        long fullMonths3 = period2.getMonths();
        long fullDays3 = period2.getDays();
        System.out.println("Матвею " + fullYears3 + " года, " + fullMonths3 + " месяца и " + fullDays3 + " дня.");
        System.out.println("Время выполнения LocalDateTime - " + (double) (System.currentTimeMillis() - m3) + " ms.\n");

//ZonedDateTime
        long m4 = System.currentTimeMillis();
        ZonedDateTime matveyBirthtDate4 = ZonedDateTime.of(1990, 9, 7, 6, 0, 0, 90000, ZoneId.systemDefault());
        int year2 = matveyBirthtDate4.getYear();
        int month2 = matveyBirthtDate4.getMonthValue();
        int dayOfMonth2 = matveyBirthtDate4.getDayOfMonth();
        System.out.println(matveyBirthtDate4);
        System.out.printf("%d.%d.%d \n", dayOfMonth2, month2, year2);
        System.out.printf("%d-%d-%d \n", dayOfMonth2, month2, year2);
        System.out.printf("%d/%d/%d \n", dayOfMonth2, month2, year2);
        System.out.printf("%d%d%d \n", dayOfMonth2, month2, year2);
        ZonedDateTime now4 = ZonedDateTime.now();
        System.out.println(matveyBirthtDate4.equals(now4));
        Period period1 = Period.between(matveyBirthtDate4.toLocalDate(), now4.toLocalDate());
        long fullYears4 = period1.getYears();
        long fullMonths4 = period1.getMonths();
        long fullDays4 = period1.getDays();
        System.out.println("Матвею " + fullYears4 + " года, " + fullMonths4 + " месяца и " + fullDays4 + " дня.");
        System.out.println("Время выполнения ZonedDateTime - " + (double) (System.currentTimeMillis() - m4) + " ms.\n");

//GregorianCalendar
        long m5 = System.currentTimeMillis();
        Calendar matveyBirthtDate5 =  new GregorianCalendar(1990, 9, 7);
        int year3 = matveyBirthtDate5.get(Calendar.YEAR);
        int month3 = matveyBirthtDate5.get(Calendar.MONTH);
        int dayOfMonth3 = matveyBirthtDate5.get(Calendar.DAY_OF_MONTH);
        System.out.println(matveyBirthtDate5.get(Calendar.YEAR) + "-" + matveyBirthtDate5.get(Calendar.MONTH) + "-" + matveyBirthtDate5.get(Calendar.DAY_OF_MONTH));
        System.out.printf("%d.%d.%d \n", dayOfMonth3, month3, year3);
        System.out.printf("%d-%d-%d \n", dayOfMonth3, month3, year3);
        System.out.printf("%d/%d/%d \n", dayOfMonth3, month3, year3);
        System.out.printf("%d%d%d \n", dayOfMonth3, month3, year3);
        Calendar now5 = new GregorianCalendar();
        long duration5 = now5.getTimeInMillis()-matveyBirthtDate5.getTimeInMillis();
        long fullYears5 = (TimeUnit.MILLISECONDS.toDays(duration5))/365;
        long theRestOfDays5 = (TimeUnit.MILLISECONDS.toDays(duration5))%365;
        System.out.println("Матвею " + fullYears5 + " года и " + theRestOfDays5 + " дня.");
        System.out.println("Время выполнения GregorianCalendar - " + (double) (System.currentTimeMillis() - m5) + " ms.\n");

//Общее время выполнения программы:
        System.out.println("Общее время выполнения программы: " + (double) (System.currentTimeMillis() - m) + " ms.");
    }
}
