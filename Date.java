 public class Date {
        public static void main(String[] args) {
            java.util.Date d=new java.util.Date();
            int year=d.getYear();
            System.out.println("Year for date object is : "+year);
            System.out.println("***To get current year add 1900 to the value of year obtained from this date object***");
            int currentYear=year+1900;
            System.out.println("Current year is : "+currentYear);
        }
    }

