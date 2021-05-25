package fixtures;

public class LightSwitch extends Fixture{
	private boolean isOn;
	public LightSwitch(String shortDescription,String longDesctiption) {
		super(shortDescription, longDesctiption);
	}
	public void changeLight() {
	if(isOn) {
		System.out.println("The switch is on");
	} else {
		System.out.println("The switch is off");
	}
	
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
}
