public class stat{
	static int i=1;
	static int j=2;
	public static void main(String[] args){
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		swap();
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
	public static void swap(){
		int temp=i;
		i=j;
		j=temp;
		//i=a;
		//j=b;
		//System.out.println(""+i);
	}
}