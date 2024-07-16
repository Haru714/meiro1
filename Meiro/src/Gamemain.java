
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
 
public class Gamemain extends MyFrame implements KeyListener
{   
	Random unti =new Random();
	int n;
	public void run() 
	{
		DDD();
		addKeyListener(this);
	}

		public void keyTyped(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
		}
 
		@Override
		public void keyPressed(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("e");
			if(e.getKeyCode()==KeyEvent.VK_SPACE) 
			{
				DDD();
			}
		}
		@Override
		public void keyReleased(KeyEvent e) 
		{
			// TODO 自動生成されたメソッド・スタブ
		}
	int[][] Maikura;
	public void DDD() 
	{
		clear();
		Maikura=new int [45][];
		for(int k=0;k<45;k++)
		{
			Maikura[k]=new int[45];
		}
		for(int i=0;i<Maikura.length;i++)
		{
			for(int j=0;j<Maikura.length;j++)
			{
				if(i==0||i==44)
				{
					Maikura[i][j]=1;
				}
				else if(i>=1&&i<=43) 
				{
					Maikura[i][0]=1;
					Maikura[i][44]=1;
				}
				else 
				{
					Maikura[i][j]=0;
				}
				if(Maikura[i][j]==1)
				{
					setColor(0,0,0);
					fillRect(50+i*10,50+j*10,10,10);
				}

			}
		}
		for(int l=2;l<44;l+=2)
		{
			for(int m=2;m<44;m+=2) 
			{
				Maikura[l][m]=1;
				if(Maikura[l][m]==1)
				{
					setColor(0,0,0);
					fillRect(l*10+50,m*10+50,10,10);
				}
			}
		}
		for(int l=2;l<44;l+=2)
		{
			for(int m=2;m<44;m+=2) 
			{
				je(l,m);
			}
		}
		boolean a=false,b=false;
		while(b==false) 
		{
			int x,y,j=0,k;
			x=unti.nextInt(45);
			y=unti.nextInt(45);
			if(x%2==1&&y%2==1&&Maikura[x][y]!=1&&a==false&&x!=0&&y!=0) 
			{
				j=x;
				k=y;
				setColor(0,0,255);
				fillRect(50+j*10,50+k*10,10,10);
				a=true;
			}
			int t;
			t=j-x;
			if(t<=0) 
			{
				t=t*-1;
			}
			if(a==true&&t>=15&&Maikura[x][y]!=1&&x!=0&&y!=0)
			{
				setColor(255,29,0);
				fillRect(50+x*10,50+y*10,10,10);
				b=true;
			}
		}
	}
	public void je(int i,int j)
	{
		boolean set=false;
		while(set==false) 
		{
			if(i==2) {n =unti.nextInt(4);}
			else     {n =unti.nextInt(3);}
			switch(n) 
			{
				case 0:
				j++;//下に伸ばす
				break;
				case 1://右に伸ばす
				i++;
				break;
				case 2://上に伸ばす
				j--;
				break;
				case 3://左に伸ばす
				i--;
				break;
			}
			if(Maikura[i][j]==0) 
			{
				Maikura[i][j]=1;
				if(Maikura[i][j]==1)
				{
					setColor(0,0,0);
					fillRect(i*10+50,j*10+50,10,10);
				}
				set=true;
			}
				switch(n) 
				{
					case 0:
					j++;
					break;
					case 1:
					i++;
					break;
					case 2:
					j--;
					break;
					case 3:
					i--;
					break;
			     }
		}
	}
 
	

}
