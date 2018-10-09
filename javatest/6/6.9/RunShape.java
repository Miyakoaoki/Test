import java.awt.*;
import java.applet.*;
abstract class Shapes 
{ 
  protected int x,y,k; 
  protected double m;
  public Shapes(int x,int y,int k,double m)
  {this.x=x;   this.y=y;
   this.k=k;   this.m=m;
  }
  abstract public double getArea();
  abstract public double getPerimeter();
}
class Rect extends Shapes 
{ public double getArea()
	  { return(k*m); }
  public double getPerimeter()
	  { return(2*k+2*m);}
  public Rect(int x,int y,int width,int height)
	  { super(x,y,width,height);}
}
class Triangle extends Shapes
{   public double getArea()
    {return(Math.sqrt(m*( m-k)*( m-x)*(m-y)));}
    public double getPerimeter()
	{return(k+x+y);}
    public Triangle(int baseA,int baseB,int baseC)
	{   super(baseA, baseB, baseC,0);
            //m�䵱���ܳ���һ��
            m= (baseA+ baseB+ baseC)/2.0;
	}
   }
class Circle extends Shapes
{   public double getArea()
   //Math��java.lang���е��࣬PI�Ǿ�̬�����ԣ���ֵΪ��
		{return(m* m *Math.PI);}
    public double getPerimeter()
		{return(2*Math.PI* m);}
    public Circle(int x,int y,int width)
		{
		    //m�䵱�˰뾶�Ľ�ɫ��k�䵱��ֱ��
			super(x,y, width, width/2.0);
		}
}
public class RunShape extends Applet
{
	Rect rect=new Rect(5,15,25,25);
	Triangle tri=new Triangle(5,5,8);
	Circle cir=new Circle(13,90,25);
	 //��������������ע������������Ϊs��abΪ�ַ�����������ꡣ
	//getClass.getName�ǵõ������Ӧ��������
	private void drawArea(Graphics g,Shapes s,int a,int b)
	{
		g.drawString(s.getClass().getName()+" Area"+s.getArea(),a,b);
		
	}
	private void drawPerimeter (Graphics g,Shapes s,int a,int b)
	{
		g.drawString(s.getClass().getName()+" Perimeter"+s.getPerimeter(),a,b);
	
	}
	public void paint(Graphics g)
	{     g.drawRect(rect.x,rect.y,rect.k,(int)rect.m);              //1
		  drawArea (g,rect,50,35);							     //2
		  drawPerimeter(g,rect,50,55);						     //3
		  drawArea (g, tri,50,75);							         //4	
		  drawPerimeter(g,tri,50,95);						         //5��
		  g.drawOval(cir.x-(int)cir.k/2,cir.y-(int)cir.k/2,cir.k,cir.k); //6
		  drawArea (g, cir,50,115);							     //7
		  drawPerimeter(g,cir,50,135);						   //8
	 }
}
