package bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.misc.extras.io.github.bluebloxkraft.cool.client;

import bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.BlueBloxKraftClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class NametagImage {

	private static final ResourceLocation icon = BlueBloxKraftClient.getBBKC().ICON;
	
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
		if(((Entity) player).getName().equals("BlueBloxKraft")) {
			return true;
		} else if(((Entity) player).getName().equals("xBBKzX08iscool")) {
			return true;
		} else if(((Entity) player).getName().equals("DK_Gaming366")) {
			return true;
		} else if(((Entity) player).getName().equals("xNotMercy")) {
			return true;
		} else if(((Entity) player).getName().equals("zNqtMxrcy")) {
			return true;
		}
		
		
		else return false;
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
