package bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.misc.extras.me.bluebloxkraft.client.pvp.main.mods.impl;

import org.lwjgl.opengl.GL11;

import bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.misc.extras.io.github.bluebloxkraft.cool.utils.BBKCUtils;
import bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.misc.extras.me.bluebloxkraft.client.pvp.main.gui.hud.ScreenPosition;
import bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.misc.extras.me.bluebloxkraft.client.pvp.main.mods.ModDraggable;
import net.minecraft.client.renderer.GlStateManager;

public class ModPaperdoll extends ModDraggable {

	/*
	 * Pitch = Up Down
	 * Yaw = Sideways
	 */
	
	private void drawPaperdoll() {
		GlStateManager.pushMatrix();
		GL11.glColor4f(1,1,1,1);
		BBKCUtils.drawEntity(pos.getAbsoluteX() + 35, pos.getAbsoluteY() + 105, 50, 20, 50, mc.thePlayer);
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
	    /*	
		if(mc.thePlayer.isSprinting()) {
			GuiInventory.drawEntityOnScreen(pos.getAbsoluteX() + 35, pos.getAbsoluteY() + 105, 50, 20, 50, mc.thePlayer);
		} else if(mc.thePlayer.isSneaking()) {
			GuiInventory.drawEntityOnScreen(pos.getAbsoluteX() + 35, pos.getAbsoluteY() + 105, 50, 20, 50, mc.thePlayer);
		} else {
			
		}
		*/
	}

}
