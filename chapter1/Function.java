package da;

public class Function {
	
	
	public int getMod(int n) {
		
		int result  = n % 2;
		
		return result;
	}
	
	/*
	 * 递归，计算N的二进制形式中1的个数
	 * 定理：如果N为奇数，N的二进制形式中1的个数 = N/2的二进制形式中1的个数 + 1
	 */
	
	public int getCountFor1(int n) {
		if(n == 0) 
			return 0;
		if(n == 1) 
			return 1;
		if((n % 2) == 0) 
			return this.getCountFor1(n / 2);
		if((n % 2) == 1)
			return this.getCountFor1(n / 2) + 1;
		return 0;
	}
}
