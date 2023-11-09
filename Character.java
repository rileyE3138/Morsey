package Morsey;

public class Character {
String English;
String Phonetic;
String Morse;
static final String gap = "|";
Character(String E, String P,String M) {
	English = E;
	Phonetic = P;
	Morse = M;
}
public String getEnglish() {
	return English;
}
public String getPhonetic() {
	return Phonetic;
}
public String getMorse() {
	return Morse;
}
public String toString() {
	return " E " + English + " P " + Phonetic + " M " + Morse;
}
}