package me.nixuge.nochathide;

import lombok.Getter;
import lombok.Setter;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = McMod.MOD_ID,
        name = McMod.NAME,
        version = McMod.VERSION,
        clientSideOnly = true
)

@Setter
public class McMod {
    public static final String MOD_ID = "nochathide";
    public static final String NAME = "No Chat Hide";
    public static final String VERSION = "1.0.1";


    @Getter
    @Mod.Instance(value = McMod.MOD_ID)
    private static McMod instance;
    @Getter
    private static ChatManager chatManager = new ChatManager();
}
