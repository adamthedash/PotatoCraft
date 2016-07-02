package com.adam.potatocraft.proxy;

/**
 * Created by Adam on 29/06/2016.
 */
import com.adam.potatocraft.init.*;
import com.adam.potatocraft.main.Reference;
import com.adam.potatocraft.structures.MyWorldGenerator;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);

//		Inits
        PotatoCraftItems.init();
        PotatoCraftBlocks.init();
        PotatoCraftFood.init();
        PotatoCraftTools.init();
        PotatoCraftArmors.init();

//		Crafting recipes
        PotatoCraftRecipes.init();

//		For custom block models
        OBJLoader.INSTANCE.addDomain(Reference.MODID);
    }

    @Override
    public void init(FMLInitializationEvent event){
        super.init(event);

//		RegisterRenders
        PotatoCraftItems.registerRenders();
        PotatoCraftBlocks.registerRenders();
        PotatoCraftFood.registerRenders();
        PotatoCraftTools.registerRenders();
        PotatoCraftArmors.registerRenders();

//		World gen
        GameRegistry.registerWorldGenerator(new MyWorldGenerator(), 10);

    }

    @Override
    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }



}
