package chaithanya.corejava.labs;

public class Fabino {


	public class Fibno {

		public static void main(String[] args) {
			int n1=1,n2=2,n3,i,count=20;
			System.out.println(n1+" "+n2);
			for(i=2;i<count;++i)
			{
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
				
			}

		}

	}


}
