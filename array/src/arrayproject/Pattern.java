package arrayproject;

import java.util.Scanner;

public class Pattern 
{
	static void a()
	{
		int n=5;
		int x=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<2*n;j++){
				if(j==x||j==n+i-1)
				{
					System.out.print("*");
				}
				else if((j>=x)!=false&&j<=n+i-1&&i==n/2+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			x--;
		}
		
	}

	static void b()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||((i==1||i==n||i==n/2+1)&&j<=n-1))
				{
					System.out.print("*");
				}
				else if(i!=1&&i!=n&&j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void c()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||i==n||j==1)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
		
	}
	
	static void d()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||((i==1||i==n)&&j<=n-1))
				{
					System.out.print("*");
				}
				else if(i!=1&&i!=n&&j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void e()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||i==1||i==n||i==n/2+1)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
		
	}
	
	static void f()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||i==1||i==n/2+1)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
		
	}
	
	static void g()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||i==1||i==n||(i>n/2 &&j==n)||(i==(n/2+1)&&j>n/2))
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void h()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||j==n||i==n/2+1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void i()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||i==n||j==n/2+1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void j()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||(i==n&&j<=n/2+1)||j==n/2+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void k()
	{
		int n=5;
		int x=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n/2+1;j++){
				if(j==1||j==x)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			if(i<=n/2)
			{
				x--;
			}
			else
			{
				x++;
			}
			System.out.println();
			
		}
		
	}
	
	static void l()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||(i==n&&j<=(n/2)+1))
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
		
	}
	
	static void m()
	{
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||j==n||((j==x||j==n-x+1)&&i<=n/2+1))
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			x++;
			System.out.println();
			
		}
		
	}
	
	static void n()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||j==n||i==j)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void o()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||j==n||i==1||i==n)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void p()
	{
		int n=5;
		int x=(n/2)+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((i==1&&j<=x)||j==1||(j==x&&i<=x)||(i==x&&j<=x))
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void q()
	{
		int n=7;
		int x=n-n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(((i==1||i==x+1)&&j<=x+1)||((j==1||j==x+1)&&i<=x+1))
				{
					System.out.print("*");
				}
				else if(j==i&&i>=x)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void r()
	{
		int n=7;
		int x=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n/2+1;j++){
				if(j==1||i==1||i==n/2+1||(i<=n/2&&j==n/2+1)||j==x)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			if(i>n/2)
			{
				x++;
			}
			System.out.println();
			
		}
		
	}
	
	static void s()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||i==n||i==n/2+1||(j==1&&i<=n/2+1)||(j==n&&i>n/2+1))
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void t()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||j==n/2+1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void u()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||j==n||i==n)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void v()
	{
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<2*n;j++){
				if(j==x||j==2*n-x)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			x++;
		}
		
	}
	
	static void w()
	{
		int n=5;
		int x=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<2*n;j++){
				if(j==1||j==2*n-1||j==x||j==2*n-x)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			x--;
		}
		
	}
	static void x()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<2*n;j++){
				if(j==i||j==n-i+1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void y()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((j==i||j==n-i+1)&&i<=n/2+1||(j==n/2+1&&i>n/2))
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	static void z()
	{
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||i==n||j==n-i+1)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}
	public static void main(String[] args) throws Throwable 
	{
		Scanner sc = new Scanner(System.in);
		a();
		System.out.println();
		b();
		System.out.println();
		c();
		System.out.println();
		d();
		System.out.println();
		e();
		System.out.println();
		f();
		System.out.println();
		g();
		System.out.println();
		h();
		System.out.println();
		i();
		System.out.println();
		j();
		System.out.println();
		k();
		System.out.println();
		l();
		System.out.println();
		m();
		System.out.println();
		n();
		System.out.println();
		o();
		System.out.println();
		p();
		System.out.println();
		q();
		System.out.println();
		r();
		System.out.println();
		s();
		System.out.println();
		t();
		System.out.println();
		u();
		System.out.println();
		v();
		System.out.println();
		w();
		System.out.println();
		x();
		System.out.println();
		y();
		System.out.println();
		z();
		System.out.println();
		System.out.println("enter the String");
		String str=sc.nextLine();
		for (int i = 0; i < str.length(); i++) 
		{
			
			char ch=str.charAt(i);
			Thread.sleep(1000);
			switch(ch)
			{
			case 'a':a();
			break;
			case 'b':b();
			break;
			case 'c':c();
			break;
			case 'd':d();
			break;
			case 'e':e();
			break;
			case 'f':f();
			break;
			case 'g':g();
			break;
			case 'h':h();
			break;
			case 'i':i();
			break;
			case 'j':j();
			break;
			case 'k':k();
			break;
			case 'l':l();
			break;
			case 'm':m();
			break;
			case 'n':n();
			break;
			case 'o':o();
			break;
			case 'p':p();
			break;
			case 'q':q();
			break;
			case 'r':r();
			break;
			case 's':s();
			break;
			case 't':t();
			break;
			case 'u':u();
			break;
			case 'v':v();
			break;
			case 'w':w();
			break;
			case 'x':x();
			break;
			case 'y':y();
			break;
			case 'z':z();
			break;
			case' ':System.out.println(" ");
			break;
			}
		}
	}

	
	}

