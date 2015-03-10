
public class SignalGate extends Gate {
	
	public SignalGate() {
		super();
	}
	
	public void inputChanged() {
		throw new GateException("SignalGate - " + getName() + ": Doesn't have inputs.");
	}
	public void setInputGate(Gate g) {
		throw new GateException("SignalGate - " + getName() + ": Can't set Input to a SignalGate.");
	}
	public boolean calculateValue() {
		return getOutputValue();
	}
	public void setValue(boolean b) {
		outputChanged(b);
	}
}
