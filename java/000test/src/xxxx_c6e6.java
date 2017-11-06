
public class xxxx_c6e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prime = new int[50];
		int number = 2;
		int count = 0;
		boolean isPrime=true;
		while(count<50){
			isPrime=true;
			for(int i=0;i<count&&prime[i]<=Math.sqrt(number);i++){
				if(number%prime[i]==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				prime[count]=number;
				count++;
				
				if(count%10==0){
					System.out.println(number);
				}
				else
					System.out.print(number+"\t");
		}
			number++;
	}
  }
}
