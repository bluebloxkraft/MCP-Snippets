package pkg;

public class ModPaperdoll extends ModDraggable {

	private void drawPaperdoll() {
		GlStateManager.pushMatrix();
		GL11.glColor4f(1,1,1,1);
		GuiInventory.drawEntityOnScreen(pos.getAbsoluteX() + 35, pos.getAbsoluteY() + 105, 50, 20, 50, mc.thePlayer);
		GlStateManager.popMatrix();
	}
	
	@Override
	public int getWidth() {
		return 65;
	}

	@Override
	public int getHeight() {
		return 110;
	}

	@Override
	public void render(ScreenPosition pos) {
		this.drawPaperdoll();
	}

}
