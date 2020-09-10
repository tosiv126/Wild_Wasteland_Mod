package com.tosiv.wildwasteland.init;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.armor.*;
import com.tosiv.wildwasteland.blocks.BlockItemBase;
import com.tosiv.wildwasteland.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WildWastelandMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> PIPE = ITEMS.register("pipe", ItemBase::new);
    public static final RegistryObject<Item> STEEL_MIX = ITEMS.register("steel_mix", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",ItemBase::new);
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",ItemBase::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",ItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",ItemBase::new);
    public static final RegistryObject<Item> LEAD_CAST = ITEMS.register("lead_cast",ItemBase::new);
    public static final RegistryObject<Item> MOLTEN_LEAD_CAST = ITEMS.register("molten_lead_cast",ItemBase::new);
    public static final RegistryObject<Item> COPPER_CAST = ITEMS.register("copper_cast",ItemBase::new);
    public static final RegistryObject<Item> MOLTEN_COPPER_CAST = ITEMS.register("molten_copper_cast",ItemBase::new);
    public static final RegistryObject<Item> COPPER_CASE = ITEMS.register("copper_case",ItemBase::new);
    public static final RegistryObject<Item> CASTING_BIN = ITEMS.register("casting_bin",ItemBase::new);
    public static final RegistryObject<Item> LEAD_BULLET = ITEMS.register("lead_bullet",ItemBase::new);
    public static final RegistryObject<Item> LOWCAL_BULLET = ITEMS.register("lowcal_bullet",ItemBase::new);
    public static final RegistryObject<Item> RADIOACTIVE_INSECT_FLESH = ITEMS.register("radioactive_insect_flesh", ItemBase::new);
    public static final RegistryObject<Item> HEALROOT_CROP = ITEMS.register("healroot_crop", ItemBase::new);
    public static final RegistryObject<Item> ROPEROOT_CROP = ITEMS.register("roperoot_crop", ItemBase::new);
    public static final RegistryObject<Item> ROPE = ITEMS.register("rope", ItemBase::new);
    public static final RegistryObject<Item> REINFORCED_GLASS = ITEMS.register("reinforced_glass", ItemBase::new);
    public static final RegistryObject<Item> BEETLE_SHELL = ITEMS.register("beetle_shell", ItemBase::new);
    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate", ItemBase::new);
    public static final RegistryObject<Item> SKIN_CAUTION = ITEMS.register("skin_caution", ItemBase::new);
    public static final RegistryObject<Item> SKIN_HOT_PINK = ITEMS.register("skin_hot_pink", ItemBase::new);
    public static final RegistryObject<Item> SKIN_BLACK = ITEMS.register("skin_black", ItemBase::new);
    public static final RegistryObject<Item> SKIN_CAMO = ITEMS.register("skin_camo", ItemBase::new);
    public static final RegistryObject<Item> SKIN_DEFAULT = ITEMS.register("skin_default", ItemBase::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);

    //Spawn Eggs
    public static final RegistryObject<ModSpawnEggItem> GREAT_BEETLE_SPAWN_EGG = ITEMS.register("great_beetle_spawn_egg",
            ()-> new ModSpawnEggItem(ModEntityTypes.GREAT_BEETLE, 0xE83A2A,0x13083F, new Item.Properties().group(WildWastelandMod.TAB)));


    //Food
    public static final RegistryObject<CookedInsectFlesh> COOKED_INSECT_FLESH = ITEMS.register("cooked_insect_flesh", CookedInsectFlesh::new);
    public static final RegistryObject<InsectFlesh> INSECT_FLESH = ITEMS.register("insect_flesh", InsectFlesh::new);
    public static final RegistryObject<ProcessedHealroot> PROCESSED_HEALROOT = ITEMS.register("processed_healroot", ProcessedHealroot::new);


    //Crops
    public static final RegistryObject<Item> HEALROOT_SEED = ITEMS.register("healroot_seed", ()-> new BlockItem(ModBlocks.HEALROOT.get(), new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<Item> ROPEROOT_SEED = ITEMS.register("roperoot_seed", ()-> new BlockItem(ModBlocks.ROPEROOT.get(), new Item.Properties().group(WildWastelandMod.TAB)));



    //Tools
    public static final RegistryObject<SwordItem> CROZIUS = ITEMS.register("crozius",
            () -> new SwordItem(ModItemTier.CROZIUSTIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> CROZIUS_SKIN1 = ITEMS.register("crozius_skin1",
            () -> new SwordItem(ModItemTier.CROZIUSTIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> CROZIUS_SKIN2 = ITEMS.register("crozius_skin2",
            () -> new SwordItem(ModItemTier.CROZIUSTIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> CROZIUS_SKIN3 = ITEMS.register("crozius_skin3",
            () -> new SwordItem(ModItemTier.CROZIUSTIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> CROZIUS_SKIN4 = ITEMS.register("crozius_skin4",
            () -> new SwordItem(ModItemTier.CROZIUSTIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> TRENCH_MACE = ITEMS.register("trench_mace",
            () -> new SwordItem(ModItemTier.TRENCHMACETIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> TRENCH_MACE_SKIN1 = ITEMS.register("trench_mace_skin1",
            () -> new SwordItem(ModItemTier.TRENCHMACETIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> TRENCH_MACE_SKIN2 = ITEMS.register("trench_mace_skin2",
            () -> new SwordItem(ModItemTier.TRENCHMACETIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> TRENCH_MACE_SKIN3 = ITEMS.register("trench_mace_skin3",
            () -> new SwordItem(ModItemTier.TRENCHMACETIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<SwordItem> TRENCH_MACE_SKIN4 = ITEMS.register("trench_mace_skin4",
            () -> new SwordItem(ModItemTier.TRENCHMACETIER, 2, -2.4F, new Item.Properties().group(WildWastelandMod.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> BEETLE_HELMET = ITEMS.register("beetle_helmet",
            ()-> new ArmorItem(ModArmorMaterial.BEETLE, EquipmentSlotType.HEAD, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<ArmorItem> BEETLE_CHESTPLATE = ITEMS.register("beetle_chestplate",
            ()-> new ArmorItem(ModArmorMaterial.BEETLE, EquipmentSlotType.CHEST, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<ArmorItem> BEETLE_LEGGINGS = ITEMS.register("beetle_leggings",
            ()-> new ArmorItem(ModArmorMaterial.BEETLE, EquipmentSlotType.LEGS, new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<ArmorItem> BEETLE_BOOTS = ITEMS.register("beetle_boots",
            ()-> new ArmorItem(ModArmorMaterial.BEETLE, EquipmentSlotType.FEET, new Item.Properties().group(WildWastelandMod.TAB)));

    private static FlakVest model= new FlakVest();
    public static final RegistryObject<ArmorBaseItem> FLAK_VEST = ITEMS.register("flak_vest",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.CHEST, new Item.Properties().group(WildWastelandMod.TAB), model));

    private static final ResurgenceStandardIssue model1= new ResurgenceStandardIssue();
    public static final RegistryObject<ArmorBaseItem> RESURGENCE_HELMET = ITEMS.register("resurgence_helmet",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.HEAD, new Item.Properties().group(WildWastelandMod.TAB), model1));
    public static final RegistryObject<ArmorBaseItem> RESURGENCE_CHEST = ITEMS.register("resurgence_chest",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.CHEST, new Item.Properties().group(WildWastelandMod.TAB), model1));
    public static final RegistryObject<ArmorBaseItem> RESURGENCE_LEGS = ITEMS.register("resurgence_legs",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.LEGS, new Item.Properties().group(WildWastelandMod.TAB), model1));
    public static final RegistryObject<ArmorBaseItem> RESURGENCE_BOOTS = ITEMS.register("resurgence_boots",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.FEET, new Item.Properties().group(WildWastelandMod.TAB), model1));

    private static CowboyHatBrown model2= new CowboyHatBrown();
    public static final RegistryObject<ArmorBaseItem> COWBOYHATBROWN = ITEMS.register("cowboyhatbrown",
            ()-> new ArmorBaseItem(ModArmorMaterial.COWBOY, EquipmentSlotType.HEAD, new Item.Properties().group(WildWastelandMod.TAB), model2));
    private static CowboyHatWhite model3= new CowboyHatWhite();
    public static final RegistryObject<ArmorBaseItem> COWBOYHATWHITE = ITEMS.register("cowboyhatwhite",
            ()-> new ArmorBaseItem(ModArmorMaterial.COWBOY, EquipmentSlotType.HEAD, new Item.Properties().group(WildWastelandMod.TAB), model3));
    private static CowboyHatBlack model4= new CowboyHatBlack();
    public static final RegistryObject<ArmorBaseItem> COWBOYHATBLACK = ITEMS.register("cowboyhatblack",
            ()-> new ArmorBaseItem(ModArmorMaterial.COWBOY, EquipmentSlotType.HEAD, new Item.Properties().group(WildWastelandMod.TAB), model4));

    private static final Rags model5= new Rags();
    public static final RegistryObject<ArmorBaseItem> RAGS_HELMET = ITEMS.register("rags_helmet",
            ()-> new ArmorBaseItem(ModArmorMaterial.RAGS, EquipmentSlotType.HEAD, new Item.Properties().group(WildWastelandMod.TAB), model5));
    public static final RegistryObject<ArmorBaseItem> RAGS_CHEST = ITEMS.register("rags_chest",
            ()-> new ArmorBaseItem(ModArmorMaterial.RAGS, EquipmentSlotType.CHEST, new Item.Properties().group(WildWastelandMod.TAB), model5));
    public static final RegistryObject<ArmorBaseItem> RAGS_LEGS = ITEMS.register("rags_legs",
            ()-> new ArmorBaseItem(ModArmorMaterial.RAGS, EquipmentSlotType.LEGS, new Item.Properties().group(WildWastelandMod.TAB), model5));





    //Block Items
    public static final RegistryObject<Item> ASH_BLOCK_ITEM = ITEMS.register("ash_block",
            () -> new BlockItemBase(ModBlocks.ASH_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",
            () -> new BlockItemBase(ModBlocks.COPPER_BLOCK.get()));
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block",
            () -> new BlockItemBase(ModBlocks.LEAD_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block",
            () -> new BlockItemBase(ModBlocks.STEEL_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
            () -> new BlockItemBase(ModBlocks.COPPER_ORE.get()));
    public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore",
            () -> new BlockItemBase(ModBlocks.LEAD_ORE.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
            () -> new BlockItemBase(ModBlocks.RUBY_ORE.get()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore",
            () -> new BlockItemBase(ModBlocks.SAPPHIRE_ORE.get()));
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItemBase(ModBlocks.RUBY_BLOCK.get()));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block",
            () -> new BlockItemBase(ModBlocks.SAPPHIRE_BLOCK.get()));


}
