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
	CC() throws A,C{} //编译是否通过
  	hent() throws A{};//编译是否通过
 	gent() throws D{};//编译是否通过
   	fevent() throws C{};//编译是否通过
}
