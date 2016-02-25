package cap8;

public class Date 
{
   private int month; // 1-12
   private int day;   // 1-31 conforme o mês
   private int year;  // ano maior que 1900

   // construtor: chama checkMonth para confirmar o valor adequado para month;
   // chama checkDay para confirmar o valor adequado para day
   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth ); // valida month
      year = checkYear(theYear); // poderia validar year
      day = checkDay( theDay ); // valida day

      System.out.printf( 
         "Date object constructor for date %s\n", this );
   } // fim do construtor Date

   
   
   // método utilitário para confirmar o valor adequado de year
   private int checkYear(int year){
	   if(year > 1900)
		   return year;
	   else
		   return 1900;
   }
   
   public void nextDay(){
	  if (day+1 == checkDay(day+1)){
		  day+=1;
	  } else if (month+1 == checkMonth(month+1)){
		  day = 1;
		  month+=1;
	  }else{
		  day = 1;
		  month = 1;
		  year+=1;
	  }
	  
   }
   
   // método utilitário para confirmar o valor adequado de month
   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 ) // valida month
         return testMonth;
      else // month é inválido
         return 1; // mantém objeto em estado consistente
   } // fim do método checkMonth

   // método utilitário para confirmar o valor adequado de day com base em month e year
   private int checkDay( int testDay )
   {
      int daysPerMonth[] = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
      // verifica se day está no intervalo para month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
   
      // verifica ano bissexto
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
   
      return 1;  // mantém objeto em estado consistente
   } // fim do método checkDay
   
   // retorna uma String no formato mês/dia/ano
   public String toString()
   { 
      return String.format( "%d/%d/%d", month, day, year ); 
   } // fim do método toString
} // fim da classe Date
