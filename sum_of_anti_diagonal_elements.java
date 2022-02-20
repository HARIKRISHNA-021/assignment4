
public class sum_of_anti_diagonal_elements {

	public sum_of_anti_diagonal_elements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n=new int[][] {{1,5,7},{2,6,8},{5,8,2}};
		int sum=0;
		int len=n.length;
		for(int i=0;i<len;i++) {
			sum+=n[i][len-i-1];
			}
			System.out.println("sum of anti diagonal elements are = "+ sum);

		}

	}


