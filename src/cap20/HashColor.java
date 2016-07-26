package cap20;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class HashColor {
	public Color returnColor(String color){
		Map<String,Color> colors = new HashMap<String,Color>();
		colors.put("black", Color.BLACK);
		colors.put("blue", Color.BLUE);
		colors.put("cyan", Color.CYAN);
		colors.put("darkGray", Color.DARK_GRAY);
		colors.put("gray", Color.GRAY);
		colors.put("green", Color.GREEN);
		colors.put("lightGray", Color.LIGHT_GRAY);
		colors.put("magenta", Color.MAGENTA);
		colors.put("orange", Color.ORANGE);
		colors.put("pink", Color.PINK);
		colors.put("red", Color.RED);
		colors.put("white", Color.WHITE);
		colors.put("yellow", Color.YELLOW);
		
		if(colors.containsKey(color)){
			Color c = colors.get(color);
			return c;
		}else{
			return Color.BLACK;
		}		
	}
}
