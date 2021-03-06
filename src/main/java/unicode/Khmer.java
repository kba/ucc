package unicode;
// Kugel's "Java Code & Tools Library", Copyright (c) 1999-2007, Theossos Comp Group

/**
 * Unicode Khmer block with characters from u1780 to u17FF.
 * @author Kugel, <i>Theossos Comp Group</i>
 * @version Unicode 4.1.0
 */
public interface Khmer
{
   // constant field names modified with "^KHMER " pattern 
   char LETTER_KA = '\u1780';
   char LETTER_KHA = '\u1781';
   char LETTER_KO = '\u1782';
   char LETTER_KHO = '\u1783';
   char LETTER_NGO = '\u1784';
   char LETTER_CA = '\u1785';
   char LETTER_CHA = '\u1786';
   char LETTER_CO = '\u1787';
   char LETTER_CHO = '\u1788';
   char LETTER_NYO = '\u1789';
   char LETTER_DA = '\u178A';
   char LETTER_TTHA = '\u178B';
   char LETTER_DO = '\u178C';
   char LETTER_TTHO = '\u178D';
   char LETTER_NNO = '\u178E';
   char LETTER_TA = '\u178F';
   char LETTER_THA = '\u1790';
   char LETTER_TO = '\u1791';
   char LETTER_THO = '\u1792';
   char LETTER_NO = '\u1793';
   char LETTER_BA = '\u1794';
   char LETTER_PHA = '\u1795';
   char LETTER_PO = '\u1796';
   char LETTER_PHO = '\u1797';
   char LETTER_MO = '\u1798';
   char LETTER_YO = '\u1799';
   char LETTER_RO = '\u179A';
   char LETTER_LO = '\u179B';
   char LETTER_VO = '\u179C';
   char LETTER_SHA = '\u179D';
   char LETTER_SSO = '\u179E';
   char LETTER_SA = '\u179F';
   char LETTER_HA = '\u17A0';
   char LETTER_LA = '\u17A1';
   char LETTER_QA = '\u17A2';
   char INDEPENDENT_VOWEL_QAQ = '\u17A3';
   char INDEPENDENT_VOWEL_QAA = '\u17A4';
   char INDEPENDENT_VOWEL_QI = '\u17A5';
   char INDEPENDENT_VOWEL_QII = '\u17A6';
   char INDEPENDENT_VOWEL_QU = '\u17A7';
   char INDEPENDENT_VOWEL_QUK = '\u17A8';
   char INDEPENDENT_VOWEL_QUU = '\u17A9';
   char INDEPENDENT_VOWEL_QUUV = '\u17AA';
   char INDEPENDENT_VOWEL_RY = '\u17AB';
   char INDEPENDENT_VOWEL_RYY = '\u17AC';
   char INDEPENDENT_VOWEL_LY = '\u17AD';
   char INDEPENDENT_VOWEL_LYY = '\u17AE';
   char INDEPENDENT_VOWEL_QE = '\u17AF';
   char INDEPENDENT_VOWEL_QAI = '\u17B0';
   char INDEPENDENT_VOWEL_QOO_TYPE_ONE = '\u17B1';
   char INDEPENDENT_VOWEL_QOO_TYPE_TWO = '\u17B2';
   char INDEPENDENT_VOWEL_QAU = '\u17B3';
   char VOWEL_INHERENT_AQ = '\u17B4';
   char VOWEL_INHERENT_AA = '\u17B5';
   char VOWEL_SIGN_AA = '\u17B6';
   char VOWEL_SIGN_I = '\u17B7';
   char VOWEL_SIGN_II = '\u17B8';
   char VOWEL_SIGN_Y = '\u17B9';
   char VOWEL_SIGN_YY = '\u17BA';
   char VOWEL_SIGN_U = '\u17BB';
   char VOWEL_SIGN_UU = '\u17BC';
   char VOWEL_SIGN_UA = '\u17BD';
   char VOWEL_SIGN_OE = '\u17BE';
   char VOWEL_SIGN_YA = '\u17BF';
   char VOWEL_SIGN_IE = '\u17C0';
   char VOWEL_SIGN_E = '\u17C1';
   char VOWEL_SIGN_AE = '\u17C2';
   char VOWEL_SIGN_AI = '\u17C3';
   char VOWEL_SIGN_OO = '\u17C4';
   char VOWEL_SIGN_AU = '\u17C5';
   char SIGN_NIKAHIT = '\u17C6';
   char SIGN_REAHMUK = '\u17C7';
   char SIGN_YUUKALEAPINTU = '\u17C8';
   char SIGN_MUUSIKATOAN = '\u17C9';
   char SIGN_TRIISAP = '\u17CA';
   char SIGN_BANTOC = '\u17CB';
   char SIGN_ROBAT = '\u17CC';
   char SIGN_TOANDAKHIAT = '\u17CD';
   char SIGN_KAKABAT = '\u17CE';
   char SIGN_AHSDA = '\u17CF';
   char SIGN_SAMYOK_SANNYA = '\u17D0';
   char SIGN_VIRIAM = '\u17D1';
   char SIGN_COENG = '\u17D2';
   char SIGN_BATHAMASAT = '\u17D3';
   char SIGN_KHAN = '\u17D4';
   char SIGN_BARIYOOSAN = '\u17D5';
   char SIGN_CAMNUC_PII_KUUH = '\u17D6';
   char SIGN_LEK_TOO = '\u17D7';
   char SIGN_BEYYAL = '\u17D8';
   char SIGN_PHNAEK_MUAN = '\u17D9';
   char SIGN_KOOMUUT = '\u17DA';
   char CURRENCY_SYMBOL_RIEL = '\u17DB';
   char SIGN_AVAKRAHASANYA = '\u17DC';
   char SIGN_ATTHACAN = '\u17DD';
   char DIGIT_ZERO = '\u17E0';
   char DIGIT_ONE = '\u17E1';
   char DIGIT_TWO = '\u17E2';
   char DIGIT_THREE = '\u17E3';
   char DIGIT_FOUR = '\u17E4';
   char DIGIT_FIVE = '\u17E5';
   char DIGIT_SIX = '\u17E6';
   char DIGIT_SEVEN = '\u17E7';
   char DIGIT_EIGHT = '\u17E8';
   char DIGIT_NINE = '\u17E9';
   char SYMBOL_LEK_ATTAK_SON = '\u17F0';
   char SYMBOL_LEK_ATTAK_MUOY = '\u17F1';
   char SYMBOL_LEK_ATTAK_PII = '\u17F2';
   char SYMBOL_LEK_ATTAK_BEI = '\u17F3';
   char SYMBOL_LEK_ATTAK_BUON = '\u17F4';
   char SYMBOL_LEK_ATTAK_PRAM = '\u17F5';
   char SYMBOL_LEK_ATTAK_PRAM_MUOY = '\u17F6';
   char SYMBOL_LEK_ATTAK_PRAM_PII = '\u17F7';
   char SYMBOL_LEK_ATTAK_PRAM_BEI = '\u17F8';
   char SYMBOL_LEK_ATTAK_PRAM_BUON = '\u17F9';
}
