public class Calander{
    String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","Novermber","December"};
    String[] days = {"S","M","T","W","Th","F","Sa"};
    int[] limit = {31,28,31,30,31,30,31,31,30,31,30,31};
    public void printCal(int month, int year)
    {
        
        int firstDay = DayOfWeek.returnDay(1,month,year);
        month = month-1;
        int i,j;
        System.out.println(months[month]+" "+year);
        //System.out.print("");
        for(i=0;i<days.length;i++)
        {
            System.out.print(days[i]+"  ");
        }
        System.out.println();
        for(i=0;i<firstDay*2+5;i++)
        {
            System.out.print(" ");
        }
        //int limit = limit[month];
        
        for(j=firstDay+1,i=0;i<limit[month];i++,j++)
        {
            if(i<9)
            System.out.print("0"+(i+1)+" "); 
            
            else
             System.out.print(i+1+" "); 
            
            if(j%7==0)
                System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        Calander c = new Calander();
        c.printCal(month,year);
    }
}