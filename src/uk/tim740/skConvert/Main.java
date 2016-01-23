package uk.tim740.skConvert;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.ExpressionType;
import uk.tim740.skConvert.load.*;

public class Main extends JavaPlugin {

	public static Main plugin;
		@Override
		public void onEnable() {
			 Skript.registerAddon(this);
			 if (plugin == null){
				 plugin = this;
			 }
		Skript.registerExpression(ExprBinDeConvert.class,String.class,ExpressionType.PROPERTY,"convert bin[ary] %string% to (0�(text|string)|1�decimal|2�hexa[decimal]|3�octal)");
		Skript.registerExpression(ExprBinConvert.class,String.class,ExpressionType.PROPERTY,"convert (0�(text|string)|1�decimal|2�hexa[decimal]|3�octal) %string% to bin[ary]");

		Skript.registerExpression(ExprAsciiToTxt.class,String.class,ExpressionType.PROPERTY,"convert ascii %number% to (text|string)");
		Skript.registerExpression(ExprTxtToAscii.class,String.class,ExpressionType.PROPERTY,"convert (text|string) %string% to ascii");

		Skript.registerExpression(ExprHexaToNum.class,String.class,ExpressionType.PROPERTY,"convert hexa[decimal] %string% to num[ber]");
		Skript.registerExpression(ExprNumToHexa.class,String.class,ExpressionType.PROPERTY,"convert num[ber] %string% to hexa[decimal]");

		Skript.registerExpression(ExprHexToRgb.class,String.class,ExpressionType.PROPERTY,"convert hex %string% to rgb");
		Skript.registerExpression(ExprUnixToDate.class,String.class,ExpressionType.PROPERTY,"convert unix[ date] %string% to date");
		Bukkit.getServer().getLogger().info("[skConvert] v" + Bukkit.getServer().getPluginManager().getPlugin("skConvert").getDescription().getVersion() + " has loaded successfully!");
		}
}
