package in.ck;

public class DesielEngine implements IEngine{
public DesielEngine() {
System.out.println("DE::0-param Constructor");
}
	@Override
public int start() {
	System.out.println("Desiel Engine Started..");
	return 1;
}
}
