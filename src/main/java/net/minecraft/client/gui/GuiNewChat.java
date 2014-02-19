package net.minecraft.client.gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;

import acs.tabbychat.core.GuiNewChatTC;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;

public class GuiNewChat extends Gui {
	private final Minecraft mc;
    private final List sentMessages = new ArrayList();
    private final List chatLines = new ArrayList();
    private final List field_96134_d = new ArrayList();

	public GuiNewChat(Minecraft par1Minecraft) {
		this.mc = par1Minecraft;
	}

	public void /*drawChat*/func_146230_a(int par1) {
		GuiNewChatTC.getInstance().func_146230_a(par1);
	}

	public void func_146231_a() {
		GuiNewChatTC.getInstance().func_146231_a();
	}

	public void func_146227_a(IChatComponent par1Str) {
		this.func_146234_a(par1Str, 0);
	}

	public void func_146234_a(IChatComponent par1Str, int par2) {
		this.func_96129_a(par1Str, par2, this.mc.ingameGUI.getUpdateCounter(), false);
        LogManager.getLogger().info("[CHAT] " + par1Str);
	}

	public void func_96129_a(IChatComponent par1Str, int par2, int par3, boolean par4) {
		GuiNewChatTC.getInstance().func_146237_a(par1Str, par2, par3, par4);
	}

   public void func_146245_b() {
	   GuiNewChatTC.getInstance().func_146245_b();
   }

   public List func_146238_c() {
	   return this.sentMessages;
   }

   public void addToSentMessages(String par1Str) {
	   if(this.sentMessages.isEmpty() || !((String)this.sentMessages.get(this.sentMessages.size() - 1)).equals(par1Str)) {
		   this.sentMessages.add(par1Str);
	   }
   }

   public void resetScroll() {
	   GuiNewChatTC.getInstance().resetScroll();
   }

   public void func_146229_b(int par1) {
	   GuiNewChatTC.getInstance().func_146229_b(par1);
   }

   public IChatComponent func_146236_a(int par1, int par2) {
	   return GuiNewChatTC.getInstance().func_146236_a(par1, par2);
   }

//   public void addTranslatedMessage(String par1Str, Object ... par2ArrayOfObj) {
//	   this.printChatMessage(StringTranslate.getInstance().translateKeyFormat(par1Str, par2ArrayOfObj));
//   }

   public boolean func_146241_e() {
	   return this.mc.currentScreen instanceof GuiChat;
   }

   public void func_146242_c(int par1) {
	   GuiNewChatTC.getInstance().func_146242_c(par1);
   }

   public int func_146228_f() {
	   return func_146233_a(this.mc.gameSettings.chatWidth);
   }

   public int func_146246_g() {
	   return func_146243_b(this.func_146241_e()?this.mc.gameSettings.chatHeightFocused:this.mc.gameSettings.chatHeightUnfocused);
   }

   public float func_146244_h() {
	   return this.mc.gameSettings.chatScale;
   }

   public static final int func_146233_a(float par0) {
	   short var1 = 320;
	   byte var2 = 40;
	   return MathHelper.floor_float(par0 * (float)(var1 - var2) + (float)var2);
   }

   public static final int func_146243_b(float par0) {
	   short var1 = 180;
	   byte var2 = 20;
	   return MathHelper.floor_float(par0 * (float) (var1 - var2) + (float) var2);
   }

   public int func_146232_i() {
	   return this.func_146246_g() / 9;
   }
}