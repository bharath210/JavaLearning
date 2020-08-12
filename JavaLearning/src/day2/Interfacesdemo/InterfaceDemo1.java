package day2.Interfacesdemo;

interface Writer
{
	int i = 10;
	void write();
}
class Pen implements Writer
{
	public void write()
	{
		System.out.println("I'm a Pen");
	}
}
class Pencil implements Writer
{
	public void write()
	{
		System.out.println("I'm a pencil");
	}
}

class Kit
{
	void perform(Writer w)
	{
		w.write();
	}
}
public class InterfaceDemo1
{
	public static void main(String[] args) 
	{
		Writer p = new Pen();
		p.write();
		Writer pc = new Pencil();
		pc.write();
		Kit k = new Kit();
		k.perform(pc);
		k.perform(p);
		System.out.println(p.i);
	}

}
