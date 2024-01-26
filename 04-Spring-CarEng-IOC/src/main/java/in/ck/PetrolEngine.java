package in.ck;

public class PetrolEngine implements IEngine {
public PetrolEngine() {
System.out.println("PE::0-Param Constructor");
}
	@Override
public int start() {
	System.out.println("PetrolEngine started ..");
	return 1;
}
}
