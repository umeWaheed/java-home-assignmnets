64. public enum HazMath{"Safe","Dangerous","Nuclear"};

65. interface Tollable {
   public int pay(int p);
  }
  
66. class Driver implements Tollable{
		private string name;
		private int wallet;
		public void Driver(String s, int w)
		{
			name=s;
			wallet=w;
		}
		public int pay(int d)
		{	
		if(wallet>d){
		wallet=wallet-d;
		return wallet;
		}
		else 
			throw RuntimeException;
		}
	}
	
67. 	class Vechicle implements Tollable{
			Driver dr;
			HazMat hm;
			public void vechile(Driver d, HazMat h)
			{
				dr=d;
				hm=h;
			}
			public int pay(int w)
			{
			if(hm.value.equals("Dangerous"))
			dr.pay(w+5);
			else if (hm.value.equals("Nuclear"))
			dr.pay(w+100);
			else
			return;
			}
			}
			
68.  class Trailer extends Vehicle implements Tollable{
		int axles;
		public void trailer(Driver d, HazMat h, int a){
			super(d,h);
			axles=a;
			}
		public int pay(int w){
			if(axles>2)
			super.pay(w+1);
			else
			super.pay(w);
		}			
		}
		
69. class DriverComparer implments Comparator<Driver>{
		@Override
		public int compare(Driver d,Driver d1)
		{
			return compare(d.getname(),d1.getname());
		}		
	}

70. public void search(Driver [] d,Driver name, Comparator<Driver> c)
	{
		for(int i=0; i<d.length;i++){
		if(c.compare(list[i],name)==0)
		return i;
	}
	}
	
	
71. 
public static int test(int z){
		System.out.print(z+" ");
	 if (z==1){
			return 1;
		 }	
	else if (z%2==0){//even
		return test(z/2);
	}	 
	else {
		return test(3*z+1);
	}
	}


72.  class Pair
{
public static void zip(List<T> A,List<T> B){
	int size = 0;
	while (size<A.size()){
		setFirst(A.get(size));
		setSecond(B.get(size));
		size++;
	}
}

}