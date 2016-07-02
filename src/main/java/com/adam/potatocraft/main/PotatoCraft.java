package com.adam.potatocraft.main;

/**
 * Created by Adam on 29/06/2016.
 */
import com.adam.potatocraft.proxy.CommonProxy;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class PotatoCraft {

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;


    @Instance
    public static PotatoCraft instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        logger = event.getModLog();
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }


}

