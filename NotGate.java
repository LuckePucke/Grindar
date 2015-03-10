
import java.util.*;

public class NotGate extends BasicGate {
	
	public NotGate() {
		super();
	}
	
	public boolean calculateValue(){
		if(getInputGates().size() != 1) {
			throw new GateException("NotGate - " + getName() + ": Not exactly 1 input.");
		}
		return !getInputGates().get(0).getOutputValue();
	}
	
	public void setInputGate(Gate g) {
		if(getInputGates().size() == 0) {
			getInputGates().add(g);
			g.setOutputGate(this);
		}
		else {
			throw new GateException("NotGate: Trying to add more than one input.");
		}
	}
}
