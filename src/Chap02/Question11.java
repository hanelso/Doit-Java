package Chap02;

public class Question11 {
	class YMD{
		int y;
		int m;
		int d;
		
		YMD(int y, int m, int d)
		{
			this.y =y;
			this.m = m;
			this.d = d;
		}
		
		YMD after(int n)
		{
			YMD ymd = new YMD(this.y,this.m,this.d);
			
			ymd.d = ymd.d + n;
			if(ymd.d > 31)
			{
				ymd.d = ymd.d - 31;
				ymd.m++;
			}
			if(ymd.m > 12)
			{
				ymd.m = ymd.m - 12;
				ymd.y++;
			}
			
			return ymd;
		}
		
		YMD before(int n)
		{
			YMD ymd = new YMD(this.y,this.m,this.d);
			
			ymd.d = ymd.d - n;
			if(ymd.d <= 0)
			{
				ymd.d = ymd.d + 31;
				ymd.m--;
			}
			if(ymd.m <= 0)
			{
				ymd.m = ymd.m + 12;
				ymd.y--;
			}
			
			return ymd;
		}
	}
}
