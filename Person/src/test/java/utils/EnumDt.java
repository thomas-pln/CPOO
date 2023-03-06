package utils;

public enum EnumDt {
	// Cas nominal
	DT_1("richard", "stallman", 1953, "stallric53"),
	// Longueur du nom
	DT_2("steve", "jobs", 1955, "jobsste55"), DT_3("bill", "gates", 1955, "gatesbil55"),
	// Format du nom - majuscule
	DT_4("richard", "Stallman", 1953, "stallric53"), DT_5("richard", "stalLman", 1953, "stallric53"),
	DT_6("richard", "stallMan", 1953, "stallric53"), DT_7("richard", "stallmaN", 1953, "stallric53"),
	// Format du nom - apostrophe
	DT_8("richard", "'stallman", 1953, "stallric53"), DT_9("richard", "s'tallman", 1953, "stallric53"),
	DT_10("richard", "stal'lman", 1953, "stallric53"), DT_11("richard", "stall'man", 1953, "stallric53"),
	DT_12("richard", "stallman'", 1953, "stallric53"),
	// Format du nom - lettres accentuées
	DT_13("richard", "éèêëeman", 1953, "eeeeeric53"), DT_14("richard", "staéèêëe", 1953, "staeeric53"),
	DT_15("richard", "stàâälmàâän", 1953, "staaaric53"), DT_16("richard", "staïîlman", 1953, "staiiric53"),
	DT_17("richard", "çtalçmanç", 1953, "ctalcric53"),
	// Format du nom - caractères spéciaux
	DT_18("leonard", "de vinci", 1452, "devinleo52"), DT_19("richard", "stallman ", 1953, "stallric53"),
	DT_20("richard", "0stallman", 1953, "0stalric53"), DT_21("richard", "@stallman", 1953, "@stalric53"),
	DT_22("richard", "st,allman", 1953, "st,alric53"), DT_23("richard", "st.allman", 1953, "st.alric53"),
	DT_24("richard", "st:allman", 1953, "st:alric53"), DT_25("richard", "st[allman", 1953, "st[alric53"),
	DT_26("richard", " ", 1953, "ric53"),
	// Format du nom - lettre accentuée majuscule
	DT_27("richard", "Éstallman", 1953, "estalric53"), DT_28("richard", "stÇllman", 1953, "stcllric53"),
	// Longueur du prénom
	DT_29("roy", "mustang", 1885, "mustaroy85"), DT_30("ai", "kisugi", 1965, "kisugai65"),
	// Format du prénom - majuscule
	DT_31("Richard", "stallman", 1953, "stallric53"), DT_32("riChard", "stallman", 1953, "stallric53"),
	// Format du prénom - caractères
	DT_33("kathleen joan toelle", "reichs", 1948, "reichkat48"),
	DT_34("kathleen joan toelle", "reichs", 1948, "reichkat48"), DT_35("kat joan toelle", "reichs", 1948, "reichkat48"),
	DT_36("ri'chard", "stallman", 1953, "stallric53"), DT_37("jean-jacques", "goldman", 1951, "goldmjea51"),
	DT_38("ri-chard", "stallman", 1953, "stallri-53"), DT_39("éôùhard", "stallman", 1953, "stalleou53"),
	DT_40("àïçhard", "stallman", 1953, "stallaic53"), DT_41("richàrd", "stallman", 1953, "stallric53"),
	DT_42("ri0chard", "stallman", 1953, "stallri053"), DT_43("ri&hard", "stallman", 1953, "stallri&53"),
	// Année de naissance
	DT_44("richard", "stallman", -1953, "stallric53"), DT_45("jesus", "christ", 0, "chrisjes00"),
	DT_46("richard", "stallman", 5, "stallric05"), DT_47("richard", "stallman", 19, "stallric19"),
	DT_48("richard", "stallman", 195, "stallric95"), DT_49("richard", "stallman", 2000, "stallric00"),
	DT_50("richard", "stallman", 11953, "stallric53"), DT_51("richard", "stallman", -5, "stallric05"),
	DT_52("ryo", "saeba", 1959, "saebaryo59"), DT_53("jules", "cesar", -100, "cesarjul00"),
	DT_54("antonio", "canova", 1757, "canovant57"),
	// Nom ou prénom vide.
	DT_55("john", "", 1955, "???joh55"), DT_56("", "doe", 1955, "doe???55");

	public String prenom;
	public String nom;
	public int anneeDeNaissance;
	public String idAttendu;

	private EnumDt(String prenom, String nom, int anneeNaissance, String idAttendu) {
		this.prenom = prenom;
		this.nom = nom;
		this.anneeDeNaissance = anneeNaissance;
		this.idAttendu = idAttendu;
	}
}
