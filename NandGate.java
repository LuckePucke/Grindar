
public class NandGate extends BasicGate {
	
	public NandGate() {
		super();
	}
	
	public boolean calculateValue(){
		if(getInputGates().size() < 2) {
			throw new GateException("NandGate - " + getName() + ": Less than 2 inputs.");
		}
		return !(getInputGates().get(0).getOutputValue() && getInputGates().get(1).getOutputValue());
	}
}
