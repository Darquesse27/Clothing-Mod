
Initial Goals:
==============

* Create several unique base clothing/armour items. Initial items include:
  * For the Head slot:
    * Hat
  * For the Chest slot:
    * Shirt (long/short sleeve)
    * Jacket
    * Vest
    * Dress (stops you from putting on certain leg items)
  * For the Legs slot:
    * Trousers
    * Shorts
    * Skirt
    * Leggings/Tights...? (how do you wear it along with a skirt?)
  * For the Feet slot:
    * Sandals
    * Shoes
* Initially, should just be makeable using the "Clothes-piece" item, gained with `/give`, with recipes coming down the line
* Should be able to dye using regular dyes to change base colour (by default it will be white)

Future Goals
============

Integration Goals:
* Integrate with the [Accessories](https://www.curseforge.com/minecraft/mc-mods/accessories)
mod so clothing items can be placed in certain slots
* Integrate with the [Cosmetic Armor](https://www.curseforge.com/minecraft/mc-mods/cosmetic-armor-reworked)
mod if necessary


Environmental Effects:
* Add random **sweat marks** (potentially dependent on material) on the clothes as player sprints/jumps
* Add random **bloodstains** and **tears** (clothes gain transparency in gash shapes) when player takes damage

Custom block:
* Add a clothes washing station for removing environmental effects from clothing (requires water, causes **murky water**)
  * Can also be used for bleaching clothes to remove all custom features from them
* Add a clothes wardrobe (2x1 door-sized block) for clothes storage - should open a GUI menu showing all clothes 
* Embroidery Station - can be used to add any 3x3(?) pixel pattern to clothes item. **VERY MUCH A STRETCH**
  * You can either create the pattern from scratch with wool, or duplicate it like a smithing template using just one piece of white wool
  * Can stack multiple onto it
* Clothing loom (made by adding an embroidery needle to a loom)
  * Used for adding patterns (everything you can do to banners, essentially)

Custom item (embroidering needle):
* Needed for interacting with an embroidery station, made with iron and string
* Needed for making a clothing loom
* Has durability, can be upgraded through gold, diamond

Custom materials:
* Add new materials/items with a tag that shows they can be crafted into specific clothes pieces. These may include:
  * Cotton
  * Nylon
  * Silk
    * If you sleep in 75%+ silk clothes, recover health and gain a comfort effect for the morning (4 mins)
  * etc.
  * \[tags may be added to things like leather too]
* Based on the combination of items used to make the clothes, show (e.g. 20% cotton, 80% nylon) like a real clothing label
* Add bleach to return any clothing to its undyed form
* Add murky water (from environmental effect removal)

Villagers:
* Add a fashionista (name undecided) villager to trade clothing with (trades unimproved clothing back and forth for varying amounts
of emeralds depending on how expensive the resource used to make it was).
* Villager workbench should be a wardrobe

Redstone:
=========
* Powerable versions of embroidery stations and clothing looms for automation
* The industrial revolution should be possible!
* Expand upon this later
