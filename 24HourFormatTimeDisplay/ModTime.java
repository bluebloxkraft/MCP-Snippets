package pkg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ModTime extends ModDraggable {

	@Override
	public int getWidth() {
		return fr.getStringWidth("00:00");
	}

	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		//you can change the kk:mm to hh:mm to show time in 12 hour format
		fr.drawString(new SimpleDateFormat("kk:mm").format(new Date()), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}

}
