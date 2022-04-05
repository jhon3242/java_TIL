public class ex_27{
	public static void main(int[] args) {
		Time t1 = new Time(12, 54, 30);
		System.out.println(t1.hour);
		System.out.println(t1.minute);
		System.out.println(t1.second);
	}
}
class Time{
	int hour;
	int minute;
	int second;
	
	Time(){}
	
	Time(int h, int m, int s){
		hour = h;
		minute = m;
		second = s;
	}
}