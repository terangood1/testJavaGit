
public class codingTest {

	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coinType= {500,100,50,10};
		
		for(int i = 0; i<4; i++) {
			int coin = coinType[i];
			System.out.println(coin);
			System.out.println(cnt);
			System.out.println(n);
			cnt += n/coin; // cnt = cnt + n/coin;
			
			System.out.println(cnt);
			n %= coin;
			System.out.println(n);
			System.out.println();
		}
		System.out.println(cnt);
		System.out.println(n);
		
	}

}
