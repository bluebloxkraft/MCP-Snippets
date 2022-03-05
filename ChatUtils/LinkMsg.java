package bbkzx08.me.bluebloxkraftclient.bluebloxkraft.iscool.client.code_bbk_client.misc.extras.io.github.bluebloxkraft.cool.utils.chat;

import net.minecraft.client.Minecraft;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class LinkMsg {

	private static final Minecraft mc = Minecraft.getMinecraft();
	
	public LinkMsg(String message, String url) {
	
		IChatComponent icc = new ChatComponentText(message);
		IChatComponent iccHoverText = new ChatComponentText("Click Here!");
		
		icc.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, url));
		icc.getChatStyle().setBold(true);
		icc.getChatStyle().setColor(EnumChatFormatting.AQUA);
		icc.getChatStyle().setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, iccHoverText));
		
		iccHoverText.getChatStyle().setColor(EnumChatFormatting.BLUE);
		
	}
	
}
