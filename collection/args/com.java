class com{
	public static void main(String[] args){
		int count,i=0;
		String string;
		count = args.length;
		System.out.println("Number of arguments is : "+count);
		while(i<count){
			string=args[i];
			System.out.println(i+" String is "+string);
			i++;
		}
	}
}