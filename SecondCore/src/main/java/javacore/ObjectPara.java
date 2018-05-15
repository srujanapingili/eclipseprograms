package javacore;
public class ObjectPara {
int x;
int y;
	ObjectPara(int first,int second){
		x=first;
		y=second;
	}
	public boolean meth(ObjectPara j) {
		if(x==j.x && y==j.y)return true;
		else return false;
	}
	public static void main(String[] args) {
		ObjectPara obj=new ObjectPara(10,20);
		ObjectPara obj2=new ObjectPara(20,20);
		ObjectPara obj3=new ObjectPara(20,20);
		System.out.println("the value is "+ obj.meth(obj2));

	}
}
