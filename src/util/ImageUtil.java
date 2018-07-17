package util;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import constant.Constant;

public class ImageUtil {
		public static Map<String, Image> images=new HashMap<>();
		
		static {
			images.put("ball_01", GameUtil.getImage("image/ball/ball.jpg"));
			images.put("desk_01", GameUtil.getImage("image/background/desk.jpg"));
		}
}
