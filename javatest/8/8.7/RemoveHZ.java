public class RemoveHZ {
  public static String deal(String s){
    //�ļ�������������StringתΪStringBuffer
StringBuffer sb = new StringBuffer(s); 
// se���ڴ�Ŵ����Ľ��
	 StringBuffer se = new StringBuffer();
    //����ļ����ַ��ĸ���
	 int l = sb.length();
	 char c;
    //����sb,�õ��ļ�����ÿ���ַ�
	 for(int i=0;i<l;i++){
		 c =sb.charAt(i);
		 if(c>40&&c<127){   //�����ASCII�룬������se���С�
			 se.append(c);
		 }
	 }    
	 return new String(se);  //���ش������ַ���
  }
  public static void main(String[] args){
     System.out.println(deal("���fsdf23456���úܺãsdfsdftrwerwe"));
  }
}
