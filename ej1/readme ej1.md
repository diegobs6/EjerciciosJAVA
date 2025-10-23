Mesa:
   Chocolate
   Chocolate M&M
   Manzana
   Pera
-------------
Opcion 1:

class Comida:
	pass

chocolate 	= new Comida("chocolate", 100 #lipidos, 200 #carbs)
manzana 	= new Comida("manzana"	, 100 #lipidos, 200 #carbs)
pera 		= new Comida("pera"		, 100 #lipidos, 200 #carbs)
chocolatemm = new Comida("chocolate", 100 #lipidos, 200 #carbs)

-------------
Opcion 2 (vamos a hacer esto):
class Comida:
	lipidosPerGram = 20
	carbsPerGram = 5
	nombre = "chocolate"

class ItemDeComida:
	ComidaStats stats;
	grams;

chocolate	= new Comida("chocolate"	, 5 #lipidos per gram, 20 #carbs per gram)
manzana 	= new Comida("manzana"		, 5 #lipidos per gram, 20 #carbs per gram)
pera 		= new Comida("pera"			, 5 #lipidos per gram, 20 #carbs per gram)

chocolate_item 	= new ItemDeComida(chocolate, 200 #gr)
chocolate_mm 	= new ItemDeComida(chocolate, 200 #gr)
manzana_item 	= new ItemDeComida(manzana, 200 #gr)
pera_item 		= new ItemDeComida(pera, 200 #gr)

-----

class Humano:
	list[Comida] gustos


gonzalo = new Humano("gonzalo", [chocolate, arroz, ketchup])


----------

chocolate_item 	= new ItemDeComida(chocolate, 200 #gr)
chocolate_mm 	= new ItemDeComida(chocolate, 200 #gr)
manzana_item 	= new ItemDeComida(manzana, 200 #gr)
pera_item 		= new ItemDeComida(pera, 200 #gr)

comida_en_la_mesa = [
	chocolate_item,
	chocolate_mm,
	manzana_item,
	pera_item,
]

seres_vivos = [
	Humano("gonzalo", [
		chocolate,
		ketchup,
		pan,
	]),
	Perro("toby",[
		galletaDePerro,
		carne,
		pan,
	]),
	....
]


play(seres_vivos, comida_en_la_mesa)

# gonzalo escogio chocolate
# quedan 3 items en la mesa

# toby escogio <nada>
# quedan 3 items en la mesa






