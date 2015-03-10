import java.util.*;

public abstract class Gate {
	
	private String name;
	private boolean outputValue;
    private List<Gate> outputGates = new ArrayList<Gate>();
    private List<Gate> inputGates = new ArrayList<Gate>();
	private static int delay;
	
	public void init() {
		calculateValue();	
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = s;
	}
	
	public Boolean getOutputValue(){
		return outputValue;
	}
	
	public void setOutputGate(Gate g) {
		outputGates.add(g);
	}
	
	public void setInputGate(Gate g) {
		try {
			inputGates.add(g);
			g.setOutputGate(this);
		}
		catch (Exception e) {
			throw new GateException("Gate not found.");
		}
	}
	
	public List<Gate> getInputGates() {
		return inputGates;
	}
	
	public abstract boolean calculateValue();
	
	public abstract void inputChanged();
	
	public void outputChanged(Boolean o){
		outputValue = o;
		
		for (Gate g: outputGates) {
			g.inputChanged();
		}
	}
		
	public static void setDelay(int d) {
		delay = d;
	}
	public static int getDelay(){
		return delay;
	}
}
