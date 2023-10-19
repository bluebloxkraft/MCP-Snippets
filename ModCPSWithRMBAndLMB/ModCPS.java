package pkg;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Mouse;

import ScreenPosition;
import ModDraggable;

public class ModCPS extends ModDraggable {
	
	private List<Long> clicksLMB = new ArrayList<Long>();
	
	private List<Long> clicksRMB = new ArrayList<Long>();
	
	private boolean wasPressedLMB;
	private long lastPressedLMB;
	
	private boolean wasPressedRMB;
	private long lastPressedRMB;
	
	@Override
	public int getWidth() {
		return fr.getStringWidth("[000 : 000]");
	}

	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		
		final boolean pressedLMB = Mouse.isButtonDown(0);
		
		if(pressedLMB != this.wasPressedLMB) {
			this.lastPressedLMB = System.currentTimeMillis();
			this.wasPressedLMB = pressedLMB;
			if(pressedLMB) {
				this.clicksLMB.add(this.lastPressedLMB);
			}
		}
		
		final boolean pressedRMB = Mouse.isButtonDown(1);
		
		if(pressedRMB != this.wasPressedRMB) {
			this.lastPressedRMB = System.currentTimeMillis();
			this.wasPressedRMB = pressedRMB;
			if(pressedRMB) {
				this.clicksRMB.add(this.lastPressedRMB);
			}
		}
		
		fr.drawStringWithShadow("§8[§f" + getLMB() + "§b|§f" + getRMB() + "§8]", pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
		
	}

	public int getLMB() {
		final long time = System.currentTimeMillis();
		this.clicksLMB.removeIf(aLong -> aLong + 1000 < time);
		return this.clicksLMB.size();
		
	}
	
	public int getRMB() {
		final long time = System.currentTimeMillis();
		this.clicksRMB.removeIf(aLong -> aLong + 1000 < time);
		return this.clicksRMB.size();
		
	}
	
}
