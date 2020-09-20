package superworldsun.superslegend.CustomLootMobs;

import java.util.Random;

import net.minecraft.entity.monster.PhantomEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import superworldsun.superslegend.lists.ItemList;

public class CustomLootPhantom 
{
	@SubscribeEvent
    public void CustomLootDrops(LivingDropsEvent event) {

        Random random = new Random();

        if(event.getEntityLiving() instanceof PhantomEntity) {
            if(random.nextInt(5) == 0)
                event.getEntityLiving().entityDropItem(new ItemStack(ItemList.rupee, random.nextInt(4)));
            if(random.nextInt(10) == 0)
                event.getEntityLiving().entityDropItem(new ItemStack(ItemList.blue_rupee,1));
            
            if(random.nextInt(45) == 0)
                event.getEntityLiving().entityDropItem(new ItemStack(ItemList.triforce_wisdom_shard,1));
            
	        }
	    }
	}