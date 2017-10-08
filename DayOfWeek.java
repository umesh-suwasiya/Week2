public class DayOfWeek{
    public static int returnDay(int date, int month, int year)
    {
        int d0,m0,y0,x;
        y0 = year-(14-month)/12;
        x = y0+y0/4-y0/100+y0/400;
        m0 = month+12*((14-month)/12)-2;
        d0 = (date+x+31*m0/12)%7;
        switch(d0)
        {
            case 0 :System.out.println("It's Sunday");
                break;
            case 1 :System.out.println("It's Monday");
                break;
            case 2 :System.out.println("It's Tuesday");
                break;
            case 3 :System.out.println("It's Wednesday");
                break;
            case 4 :System.out.println("It's Thursday");
                break;
            case 5 :System.out.println("It's Friday");
                break;
            case 6 :System.out.println("It's Saturday");
                break;
        }
        return d0;
    }
    public static void main(String[] args){
        int date = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        DayOfWeek d = new DayOfWeek();
        d.returnDay(date,month,year);
    }
}