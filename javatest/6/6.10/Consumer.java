interface  Washer 
{
	  static final a=12;
    abstract void startUp();     //启动  
    abstract void letWaterIn(); //进水
    abstract void washClothes(); //洗衣
    abstract void letWaterOut();//排水
    abstract void stop();        //停止
}

class RoseBrand implements Washer,TLJ
{
    public  void startUp(){ System.out.println("startUp");}
    public  void letWaterIn(){System.out.println("letWaterIn");}
    public  void washClothes(){System.out.println("washClothes");}
    public  void letWaterOut(){System.out.println("letWaterOut");}
    public  void stop(){System.out.println("stop");}
    //脱水
    public  void dehydrate(){System.out.println("dehydrate ");}
}

public class Consumer {
  public static void main(String args[]){
      //接口声明引用实现接口的RoseBrand类的对象。
		Washer  w = new RoseBrand();
		w.startUp();
		w.letWaterIn();
		w.washClothes();
		w.letWaterOut();
		w.stop();
		//w.dehydrate ();当通过接口调用玫瑰洗衣机类独有的，
//接口未定义的功能方法，编译会报错。
  }  
}



