
public abstract class BasicGate extends Gate {
	public void inputChanged(){
		outputChanged(calculateValue());
	}
}
