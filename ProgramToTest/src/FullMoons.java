import java.util.*;

class FullMoons {
	static int DAY_IM = 1000 * 60 *60 *24;    //�@�Ѭ��h�ַL��
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();  //�Ǧ^Calendar��subclass������
		Date d =new Date();
		
		c.setTimeInMillis(d.getTime());     //���o�{�b�ɶ�,�ñN��]�w���L��榡,�O�s�bCalendar��
		long day1 = c.getTimeInMillis();    //���o�ҳ]�w�ɶ����L��榡
		
		for (int i = 0; i < 60;i++) {
		  day1 += (DAY_IM * 29.52);        
		  c.setTimeInMillis(day1);
		  System.out.println(String.format("full moon on %tc",c));
		}
		/*���oday1���ȨûP�k���Ʀr�ۥ[��,�����s��day1
		 * �Nday1�]�w���s���ɶ�
		 * �N��ƥH�ɶ��榡�L�X
		 */
	}
}