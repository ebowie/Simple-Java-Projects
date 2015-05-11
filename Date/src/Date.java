
public class Date {
	 String date = "";
	 String leapYear;
	 String wordMonths;
	int year;
	int month;
	int day;
	int [] numberEndDate = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String [] wordMonth = {" ","January","Februay","March","April","May","June","July","August","September","October","November","December"};
	public Date(){
		
	}
	
	public Date(int year, int month, int day) {
		super();
		
	
		leapYear = "";
		this.year = year;
		this.month = month;
		this.day = day;
		if(this.year < 0) {
			date = "bad date";
		}
		else if(this.month > 12 || this.month < 1){
			date = "bad date";
		}
		
		for(int i = 1; i<numberEndDate.length; i++){
			
			if(this.month == i ){
				if(this.day > numberEndDate[i]|| this.day < 1){
					date = "bad date";
					
				}
			}
		}
		if((this.year % 400 == 0)||((this.year % 4 ==0)&&(this.year%100 != 0))){
			numberEndDate[2] = 29;
			leapYear = "leap year!!!";
		}
	}
	
	public Date add(int numDays){
		
		int tempDay = this.day;
		int tempMonth = this.month;
		int tempYear = this.year;
		
		while(numDays>0){
			
			
		if(tempDay == numberEndDate[12] && tempMonth == 12){
			
			
		tempYear =	tempYear + 1 ;
		tempDay = 1;
		tempMonth = 1;
		}
		else if(tempDay == numberEndDate[tempMonth] && tempMonth != 12){
			
			
			tempMonth = tempMonth +1;
			tempDay = 1;
		}
		else {
			tempDay = tempDay + 1;
		}
			
			
			numDays--;
		}
	
		return new Date(tempYear,tempMonth,tempDay);
	}
	
	
public Date subtract(int numDays){
		
		int tempDay = this.day;
		int tempMonth = this.month;
		int tempYear = this.year;
		
		while(numDays>0){
			
			
		if(tempDay == 1 && tempMonth == 1){
			
			
		tempYear =	tempYear - 1 ;
		tempDay = numberEndDate[12];
		tempMonth = 12;
		}
		else if(tempDay == 1 && tempMonth != 1){
			
			
			tempMonth = tempMonth - 1;
			tempDay = numberEndDate[tempMonth];
		}
		else {
			tempDay = tempDay - 1;
		}
			
			
			numDays--;
		}
	
		return new Date(tempYear,tempMonth,tempDay);
	}


	public int daysBetween(Date anotherDate){
		
		int countedDays =0;
		int num;
		if(anotherDate.year >= year || anotherDate.month >= month || anotherDate.day >= day){
			num =1;
		}
		else {
		
			num =0;
		}
		
		if(anotherDate.year >= year && anotherDate.month >= month && anotherDate.day >= day){
			num =1;
		}
		else {
		
			num =0;
		}
		while(true){
			
			
		if(num == 0){
		
			if(anotherDate.year == year){
				if(anotherDate.month == month){
					if(anotherDate.day == day){
						break;
					}
					else
					{
					anotherDate = anotherDate.add(1);	
					}
				}
				else
				{
				anotherDate = anotherDate.add(1);	
				}
			}
			else
			{
			anotherDate = anotherDate.add(1);	
			}
			
		}
		else if(num == 1){
			if(anotherDate.year == year){
				if(anotherDate.month == month){
					if(anotherDate.day == day){
						break;
					}
					else
					{
					anotherDate = anotherDate.subtract(1);	
					}
				}
				else
				{
				anotherDate = anotherDate.subtract(1);	
				}
			}
			else
			{
			anotherDate = anotherDate.subtract(1);	
			}
		}
		countedDays++;
		}
		
		return countedDays;
		
	}

	
	public String getDate(char version){
		
		switch (version){
		case 's':
			
			if(!date.equals("bad date")){
						date = Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year);
			}
					
				
			
			break;
		case 'i':
			
			for(int i =1; i<wordMonth.length; i++){
				if(this.month == i){
					wordMonths = wordMonth[i];
				}
	
				
			}
					if(!date.equals("bad date")){
						date = wordMonths+" "+Integer.toString(day)+", "+Integer.toString(year);
						
					}
				
			
			break;
			default : date = "Wrong date version";
		}
		
		
		
		
		return date;
		
		
	}
	
	public int julianDays(){
		int days =0;
		for(int i =1; i < numberEndDate.length; i++){
			if(month == i){
				days = days+day;
				break;
			}
			else{
				days = days + numberEndDate[i];
			}
		}
		
		return days;
	}

	@Override
	public String toString() {
		return date +" "+ leapYear;
	}
	
	
	
	
	

}
