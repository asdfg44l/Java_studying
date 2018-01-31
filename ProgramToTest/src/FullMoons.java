import java.util.*;

class FullMoons {
	static int DAY_IM = 1000 * 60 *60 *24;    //一天為多少微秒
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();  //傳回Calendar的subclass的實體
		Date d =new Date();
		
		c.setTimeInMillis(d.getTime());     //取得現在時間,並將其設定成微秒格式,保存在Calendar中
		long day1 = c.getTimeInMillis();    //取得所設定時間的微秒格式
		
		for (int i = 0; i < 60;i++) {
		  day1 += (DAY_IM * 29.52);        
		  c.setTimeInMillis(day1);
		  System.out.println(String.format("full moon on %tc",c));
		}
		/*取得day1的值並與右側數字相加後,成為新的day1
		 * 將day1設定成新的時間
		 * 將資料以時間格式印出
		 */
	}
}