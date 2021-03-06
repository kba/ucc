package unicode;
// Kugel's "Java Code & Tools Library", Copyright (c) 1999-2007, Theossos Comp Group

/**
 * Unicode Linear B Ideograms block with characters from u10080 to u100FF.
 * @author Kugel, <i>Theossos Comp Group</i>
 * @version Unicode 4.1.0
 */
public interface LinearBIdeograms
{
   // constant field names modified with "^LINEAR B " pattern 
   int IDEOGRAM_B100_MAN = 0x10080;
   int IDEOGRAM_B102_WOMAN = 0x10081;
   int IDEOGRAM_B104_DEER = 0x10082;
   int IDEOGRAM_B105_EQUID = 0x10083;
   int IDEOGRAM_B105F_MARE = 0x10084;
   int IDEOGRAM_B105M_STALLION = 0x10085;
   int IDEOGRAM_B106F_EWE = 0x10086;
   int IDEOGRAM_B106M_RAM = 0x10087;
   int IDEOGRAM_B107F_SHE_GOAT = 0x10088;
   int IDEOGRAM_B107M_HE_GOAT = 0x10089;
   int IDEOGRAM_B108F_SOW = 0x1008A;
   int IDEOGRAM_B108M_BOAR = 0x1008B;
   int IDEOGRAM_B109F_COW = 0x1008C;
   int IDEOGRAM_B109M_BULL = 0x1008D;
   int IDEOGRAM_B120_WHEAT = 0x1008E;
   int IDEOGRAM_B121_BARLEY = 0x1008F;
   int IDEOGRAM_B122_OLIVE = 0x10090;
   int IDEOGRAM_B123_SPICE = 0x10091;
   int IDEOGRAM_B125_CYPERUS = 0x10092;
   int MONOGRAM_B127_KAPO = 0x10093;
   int MONOGRAM_B128_KANAKO = 0x10094;
   int IDEOGRAM_B130_OIL = 0x10095;
   int IDEOGRAM_B131_WINE = 0x10096;
   int IDEOGRAM_B132 = 0x10097;
   int MONOGRAM_B133_AREPA = 0x10098;
   int MONOGRAM_B135_MERI = 0x10099;
   int IDEOGRAM_B140_BRONZE = 0x1009A;
   int IDEOGRAM_B141_GOLD = 0x1009B;
   int IDEOGRAM_B142 = 0x1009C;
   int IDEOGRAM_B145_WOOL = 0x1009D;
   int IDEOGRAM_B146 = 0x1009E;
   int IDEOGRAM_B150 = 0x1009F;
   int IDEOGRAM_B151_HORN = 0x100A0;
   int IDEOGRAM_B152 = 0x100A1;
   int IDEOGRAM_B153 = 0x100A2;
   int IDEOGRAM_B154 = 0x100A3;
   int MONOGRAM_B156_TURO2 = 0x100A4;
   int IDEOGRAM_B157 = 0x100A5;
   int IDEOGRAM_B158 = 0x100A6;
   int IDEOGRAM_B159_CLOTH = 0x100A7;
   int IDEOGRAM_B160 = 0x100A8;
   int IDEOGRAM_B161 = 0x100A9;
   int IDEOGRAM_B162_GARMENT = 0x100AA;
   int IDEOGRAM_B163_ARMOUR = 0x100AB;
   int IDEOGRAM_B164 = 0x100AC;
   int IDEOGRAM_B165 = 0x100AD;
   int IDEOGRAM_B166 = 0x100AE;
   int IDEOGRAM_B167 = 0x100AF;
   int IDEOGRAM_B168 = 0x100B0;
   int IDEOGRAM_B169 = 0x100B1;
   int IDEOGRAM_B170 = 0x100B2;
   int IDEOGRAM_B171 = 0x100B3;
   int IDEOGRAM_B172 = 0x100B4;
   int IDEOGRAM_B173_MONTH = 0x100B5;
   int IDEOGRAM_B174 = 0x100B6;
   int IDEOGRAM_B176_TREE = 0x100B7;
   int IDEOGRAM_B177 = 0x100B8;
   int IDEOGRAM_B178 = 0x100B9;
   int IDEOGRAM_B179 = 0x100BA;
   int IDEOGRAM_B180 = 0x100BB;
   int IDEOGRAM_B181 = 0x100BC;
   int IDEOGRAM_B182 = 0x100BD;
   int IDEOGRAM_B183 = 0x100BE;
   int IDEOGRAM_B184 = 0x100BF;
   int IDEOGRAM_B185 = 0x100C0;
   int IDEOGRAM_B189 = 0x100C1;
   int IDEOGRAM_B190 = 0x100C2;
   int IDEOGRAM_B191_HELMET = 0x100C3;
   int IDEOGRAM_B220_FOOTSTOOL = 0x100C4;
   int IDEOGRAM_B225_BATHTUB = 0x100C5;
   int IDEOGRAM_B230_SPEAR = 0x100C6;
   int IDEOGRAM_B231_ARROW = 0x100C7;
   int IDEOGRAM_B232 = 0x100C8;
   int IDEOGRAM_B233_SWORD = 0x100C9;
   int IDEOGRAM_B234 = 0x100CA;
   int IDEOGRAM_B236 = 0x100CB;
   int IDEOGRAM_B240_WHEELED_CHARIOT = 0x100CC;
   int IDEOGRAM_B241_CHARIOT = 0x100CD;
   int IDEOGRAM_B242_CHARIOT_FRAME = 0x100CE;
   int IDEOGRAM_B243_WHEEL = 0x100CF;
   int IDEOGRAM_B245 = 0x100D0;
   int IDEOGRAM_B246 = 0x100D1;
   int MONOGRAM_B247_DIPTE = 0x100D2;
   int IDEOGRAM_B248 = 0x100D3;
   int IDEOGRAM_B249 = 0x100D4;
   int IDEOGRAM_B251 = 0x100D5;
   int IDEOGRAM_B252 = 0x100D6;
   int IDEOGRAM_B253 = 0x100D7;
   int IDEOGRAM_B254_DART = 0x100D8;
   int IDEOGRAM_B255 = 0x100D9;
   int IDEOGRAM_B256 = 0x100DA;
   int IDEOGRAM_B257 = 0x100DB;
   int IDEOGRAM_B258 = 0x100DC;
   int IDEOGRAM_B259 = 0x100DD;
   int IDEOGRAM_VESSEL_B155 = 0x100DE;
   int IDEOGRAM_VESSEL_B200 = 0x100DF;
   int IDEOGRAM_VESSEL_B201 = 0x100E0;
   int IDEOGRAM_VESSEL_B202 = 0x100E1;
   int IDEOGRAM_VESSEL_B203 = 0x100E2;
   int IDEOGRAM_VESSEL_B204 = 0x100E3;
   int IDEOGRAM_VESSEL_B205 = 0x100E4;
   int IDEOGRAM_VESSEL_B206 = 0x100E5;
   int IDEOGRAM_VESSEL_B207 = 0x100E6;
   int IDEOGRAM_VESSEL_B208 = 0x100E7;
   int IDEOGRAM_VESSEL_B209 = 0x100E8;
   int IDEOGRAM_VESSEL_B210 = 0x100E9;
   int IDEOGRAM_VESSEL_B211 = 0x100EA;
   int IDEOGRAM_VESSEL_B212 = 0x100EB;
   int IDEOGRAM_VESSEL_B213 = 0x100EC;
   int IDEOGRAM_VESSEL_B214 = 0x100ED;
   int IDEOGRAM_VESSEL_B215 = 0x100EE;
   int IDEOGRAM_VESSEL_B216 = 0x100EF;
   int IDEOGRAM_VESSEL_B217 = 0x100F0;
   int IDEOGRAM_VESSEL_B218 = 0x100F1;
   int IDEOGRAM_VESSEL_B219 = 0x100F2;
   int IDEOGRAM_VESSEL_B221 = 0x100F3;
   int IDEOGRAM_VESSEL_B222 = 0x100F4;
   int IDEOGRAM_VESSEL_B226 = 0x100F5;
   int IDEOGRAM_VESSEL_B227 = 0x100F6;
   int IDEOGRAM_VESSEL_B228 = 0x100F7;
   int IDEOGRAM_VESSEL_B229 = 0x100F8;
   int IDEOGRAM_VESSEL_B250 = 0x100F9;
   int IDEOGRAM_VESSEL_B305 = 0x100FA;
}
