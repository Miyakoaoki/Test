class A extends Exception{}
class B extends A{}
abstract class I{
	I()throws A;
	void fevent() throws A;
	void gent() throws B;
	void hent();
}
class C extends Exception{}
class D extends B{}
interface II{
	void fevent() throws C;
}
class CC extends I implements II{
	CC() throws A,C{} //�����Ƿ�ͨ��
  	hent() throws A{};//�����Ƿ�ͨ��
 	gent() throws D{};//�����Ƿ�ͨ��
   	fevent() throws C{};//�����Ƿ�ͨ��
}
