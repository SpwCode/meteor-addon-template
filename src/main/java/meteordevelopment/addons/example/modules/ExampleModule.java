package meteordevelopment.addons.example.modules;

import meteordevelopment.addons.example.ExampleAddon;
import minegame159.meteorclient.systems.modules.Module;
import com.google.common.collect.Streams;
import meteordevelopment.orbit.EventHandler;
import minegame159.meteorclient.events.world.TickEvent;
import minegame159.meteorclient.systems.modules.Categories;
import minegame159.meteorclient.systems.modules.Modules;
import minegame159.meteorclient.systems.modules.player.AutoEat;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

 @EventHandler
    private void onTick(TickEvent.Post event) {
        if (mc.player == null) return;
        if (mc.world == null) return;
        if (mc.interactionManager == null) return;

        if (mc.player.getPosY() != 4) {
            
        }
    }

public class ExampleModule extends Module {
    public ExampleModule() {
        super(ExampleAddon.CATEGORY, "example", "This is an example module inside a custom category.");
    }
}
