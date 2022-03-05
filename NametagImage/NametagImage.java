package clientname.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class NametagImage {

	private static final ResourceLocation icon = "client/icon.png";
	
	private static final Minecraft mc = Minecraft.getMinecraft();
	private static final FontRenderer fr = mc.fontRendererObj;
	
	/**
	 * Checks if the player has the nametag image
	 * 
	 * @param <T>
	 * @param player
	 * @return
	 */
	private static <T> boolean hasImgIcon(T player) {
		if(((Entity) player).getName().equals("player1")) {
			return true;
		} else if(((Entity) player).getName().equals("player2")) {
			return true;
		} else return false;
	}
	
	/**
	 * Renders the image icon next to their nametag
	 * 
	 * @param <T>
	 * @param player
	 */
	public static <T> void renderImgIcon(T player) {
		if(hasImgIcon(player)) {
			Minecraft.getMinecraft().getTextureManager().bindTexture(icon);
			Gui.drawModalRectWithCustomSizedTexture(-fr.getStringWidth(((EntityPlayer) player).getDisplayName().getFormattedText()) / 2 - 12, -2, 10, 10, 10, 10, 10, 10);
		}
	}
	
}
