package bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.misc.extras.io.github.bluebloxkraft.cool.utils.chat;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class ChatMsg {
	
	private static final Minecraft mc = Minecraft.getMinecraft();
	
	public ChatMsg(String message) {
		ChatComponentText c = new ChatComponentText(message);
		this.mc.ingameGUI.getChatGUI().printChatMessage(c);
	}
	
}
