
public class OrGate extends BasicGate{
	
	public OrGate() {
		super();
	}
	
	public boolean calculateValue(){
		if(getInputGates().size() < 2) {
			throw new GateException("OrGate - " + getName() + ": Less than 2 inputs.");
		}
		return getInputGates().get(0).getOutputValue() || getInputGates().get(1).getOutputValue();
	}
}
