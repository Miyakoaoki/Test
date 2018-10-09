public class RemoveHZ {
  public static String deal(String s){
    //文件名数据类型由String转为StringBuffer
StringBuffer sb = new StringBuffer(s); 
// se用于存放处理后的结果
	 StringBuffer se = new StringBuffer();
    //测出文件名字符的个数
	 int l = sb.length();
	 char c;
    //遍历sb,得到文件名的每个字符
	 for(int i=0;i<l;i++){
		 c =sb.charAt(i);
		 if(c>40&&c<127){   //如果是ASCII码，则保留到se当中。
			 se.append(c);
		 }
	 }    
	 return new String(se);  //返回处理后的字符串
  }
  public static void main(String[] args){
     System.out.println(deal("你好fsdf23456过得很好dfsdftrwerwe"));
  }
}
