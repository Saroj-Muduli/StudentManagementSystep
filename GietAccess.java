class A
{
int x=10;
public int y=20;
private int z=30;
protected int k=40;
}
class B extends A
{
}
class GietAccess
{
public static void main(String args[])
{
B b=new B();
System.out.println("default:"+b.x);
System.out.println("public:"+b.y);



System.out.println("private:"+b.z);
System.out.println("protected:"+b.k);
}
}


