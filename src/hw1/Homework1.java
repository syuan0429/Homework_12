package hw1;

public class Homework1 {
	public static void main(String[] args) {
		int n1 = 12, n2 = 6;{
		System.out.println(n1 + n2);{
		System.out.println(n1 * n2);

		int eggs = 200;
		int dozen = 12;
		int n3 = eggs / dozen, n4 = eggs % dozen;{
		System.out.println(n3);{
		System.out.println(n4);

	    
	    //一天等於24小時乘分乘秒,一小時等於60分鐘乘秒數//
	    int num=256559,sec=1,min=sec*60,hour=min*60,day=hour*24;{
		System.out.printf("%d秒是%d天%d時%d分%d秒%n", num,num/day,
					(num%day)/hour,
					((num%day)%hour)/min,
					(((num%day)%hour)%min)/sec);
	    }
		double PI = 3.1415;
		int r = 5;
		// 圓面積=半徑*半徑*3.1415)//
		// 圓周率=半徑*2*3.1415)//
		double n5 = PI * r * r, n6 = PI * r * 2;
		System.out.println(n5);
		System.out.println(n6); 

		//期末 = 期初*(1+利率)的n次方這是複利公式//
		//公式 A = Pe^rt  e = 2.7182818284 P =本金額 r =年名義利率 t =年數;
		final double e = 2.7182818284;{
		System.out.printf("最終金額: %.2f%n", (1500000 * Math.pow(e, 10 * 0.02)));
	
		
		int n7 = 5, n8 = 5;{
		System.out.println(n7 + n8);
		// 5是整數使用int,5+5=10//
		int n9 = 5;
		char n10 = '5';{
		System.out.println(n9 + n10);
		// '5'是字元,Unicode編碼16進位是0035,小算盤算出12進位是53,53+5=58//
		int n11 = 5;
		String n12 = "5";{
		System.out.println(n11 + n12);
		//"5"前面String,屬於字元意思,轉型為數字意思//
				}
			}
				}
				}
			}
		}
	}
}
}
}
