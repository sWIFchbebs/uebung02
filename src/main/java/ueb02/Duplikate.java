package ueb02;

class Duplikate {
	/**
	 * Gibt ein StringSet mit den Wörtern zurück, welche mindestens zwei mal im Text vorkommen.
	 * Alle Satzzeichen im Text sollen ignoriert werden.
	 * @param text Eingabetext, kann Satzzeichen enthalten welche ignoriert werden.
	 * @return StringSet mit den Wörtern, welche mind. zwei mal vorkommen.
	 */
	static StringSet findeDuplikate(String text) {
		// TODO Implementieren Sie die Methode gemäß dem obigen Javadoc Kommentar.

		String[] sText = text.split(" ");
		StringSet ss = new StringSetImpl();
		StringSet ss2 = new StringSetImpl();

		for(String sText1 : sText) {
			if (ss.add(sText1.replaceAll("!","")) == false) {
				ss2.add(sText1.replaceAll("!",""));
			}
		}

		return ss2;
	}
}
